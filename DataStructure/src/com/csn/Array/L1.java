package com.csn.Array;

public class L1 {
	//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	//You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //
	public int[] twoSum(int[] nums, int target) {
        if(nums.length <= 1) return null;
        else{
        	for(int i = 0; i < nums.length; i++){
        		for(int j = 0; j < i; j++){
        			if(target == nums[i] + nums[j]) return new int[]{i,j};
        		}
        	}
        }
        return null;
    }
}
