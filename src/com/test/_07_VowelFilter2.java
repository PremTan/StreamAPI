package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
	From a list of Integers, divide it into two lists 
	one having an even number 
	and the other having an odd number
	I/P : int arr[] = {1,2,3,4,5,6,7,8};
	O/P : [[1,3,5,7],[2,4,6,8]]
*/
public class _07_VowelFilter2  
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7,8};
		
		List<Integer> evenList = Arrays.stream(arr)
			.boxed()
				.filter(x -> x%2 == 0)
					.toList();
		
		List<Integer> oddList = Arrays.stream(arr)
		.boxed()
			.filter(x -> x%2 != 0)
				.toList();
		
		System.out.println(Arrays.asList(oddList, evenList));
		
		System.out.println("=============================================");
		
		Map<Boolean, List<Integer>> partitioned  = Arrays.stream(arr)
			.boxed()
				.collect(Collectors.partitioningBy(i -> i%2 == 1));
		
		List<Integer> oddList1 = partitioned.get(true);
        List<Integer> evenList1 = partitioned.get(false);

        System.out.println(Arrays.asList(oddList1, evenList1));
	}
}
