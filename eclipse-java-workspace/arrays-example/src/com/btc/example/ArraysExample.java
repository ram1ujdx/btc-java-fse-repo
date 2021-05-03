package com.btc.example;

public class ArraysExample {

	public static void main(String[] args) {
		
		int nums[]={2, 5, 3, 7, 1};
		
		System.out.println("Items are : ");
//		for(int i=0; i<nums.length; i++) {
//			System.out.print(nums[i]+"\t");
//		}
		
	
		for(int item:nums) {
			System.out.print(item+"\t");
		}
		
		int min=nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<min) {
				min=nums[i];
			}
		}
		
		System.out.println("\n\nMin is "+min);

	}

}
