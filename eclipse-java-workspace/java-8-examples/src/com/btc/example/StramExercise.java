package com.btc.example;

import java.util.Arrays;
import java.util.List;

public class StramExercise {

	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(10,5,2,3,6,7,8);
		
		int sum=nums.stream().map(i->i*i).filter(i->i%2==0).findFirst().orElse(0);
		
		System.out.println(nums);
		System.out.println(sum);

	}
//	
//	public static int getSum(List<Integer> nums) {
//		int sum=0;
//		for(int i=0;i<nums.size();i++) {
//			if(nums.get(i)%2==0) {
//				sum=sum+(nums.get(i)*nums.get(i));
//			}
//		}
//		return sum;
//		
//	}
//	

}
