package com.btc.springboot.microservice.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.btc.springboot.microservice.model.CartDetails;
import com.btc.springboot.microservice.model.Coupon;
import com.btc.springboot.microservice.model.Product;

@Service
public class CartService {
	
	@Autowired
	RestTemplate rTemplate;
	
	public CartDetails getCartInfo(int productId, String couponCode) {
		
		Product product=rTemplate.getForObject("http://localhost:5100/products/product-id/"+productId,Product.class);
		Coupon coupon=rTemplate.getForObject("http://localhost:5200/coupons/coupon-code/"+couponCode,Coupon.class);
		
		
		
		CartDetails cartDetails=new CartDetails();
		cartDetails.setProduct(product);
		cartDetails.setCoupon(coupon);
		boolean couponApplicable=true;
		double discount=0;
		
		if(coupon.getValidTill().isBefore(LocalDate.now())) {
			couponApplicable=false;
		}
		if(product.getPrice()<coupon.getMinimumOrderAmt()) {
			couponApplicable=false;
		}
		if(couponApplicable) {
			discount = product.getPrice()*(coupon.getDiscount()/100.0);
			discount = discount<coupon.getMaxDiscount()?discount:coupon.getMaxDiscount();
		}
		cartDetails.setCoponApplied(couponApplicable);
		cartDetails.setFinalPrice(product.getPrice()-discount);
		
		return cartDetails;
	}
	

}
