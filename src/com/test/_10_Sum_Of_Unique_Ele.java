package com.test;

import java.util.Arrays;

/*
	Find the sum of unique elements
	I/P : int[] arr = {1,2,5,4,1,2,6,8}
	O/P : 26
*/
public class _10_Sum_Of_Unique_Ele  
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,5,4,1,2,6,8};
		
		int sum = Arrays.stream(arr)
			.distinct()
				.sum();
		System.out.println(sum);
	}
}
