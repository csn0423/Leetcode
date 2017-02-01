package com.csn.Array;

public class L414 {
	///Given a non-empty array of integers, return the third maximum number in this array. 
	///If it does not exist, return the maximum number. 
	///The time complexity must be in O(n).
    public int thirdMax(int[] nums) {
    	int first, second, third;
    	first = second = third = Integer.MIN_VALUE;
    	
    	for(int num:nums){
    		if(num == first || num == second || num == third) continue;
    		if(num > first){
    			third = second;
    			second = first;
    			first = num;
    		}
    		else if(num > second){
    			third =second;
    			second = num;
    		}else {
				third = num;
			}
    	}
    	
    	if(third == Integer.MIN_VALUE) return first;
    	else return third;
    }
}
