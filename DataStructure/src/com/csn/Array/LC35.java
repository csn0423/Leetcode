package com.csn.Array;

public class LC35 {
	///Given a sorted array and a target value, 
	///return the index if the target is found. If not, return the index where it would be if it were inserted in order.
	//给出有序数组和目标值，返回目标值索引。
	public static int searchInsert(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
        	if(target <= nums[i]) return i;
		}
        return nums.length;
	}
}
