package com.btc.springboot.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btc.springboot.microservice.model.Coupon;
import com.btc.springboot.microservice.repository.CouponRepo;

@RestController
@RequestMapping("/coupons")
public class CouponController {
	
	@Autowired
	private CouponRepo repo;
	
	@GetMapping("/coupon-code/{couponCode}")
	public Coupon getCoupon(@PathVariable String couponCode) {
		return repo.getCoupon(couponCode);
	}

}
