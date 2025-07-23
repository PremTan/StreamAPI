package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*
	int [] arr, re-arrange the elements to form the highest/lowest possible value
	I/P : int[] arr = {9,2,3,4,5}
	O/P : 995432 / 992345
*/
public class _09_ArrangeHighLowUsingStream  
{
	public static void main(String[] args) 
	{
		int[] arr = {99,2,3,4,5};
		
		Arrays.stream(arr)
			.sorted()
				.forEach(System.out::print);
		
		System.out.println("\n...........................");
		
		String descOrder = Arrays.stream(arr)
			.boxed()
				.sorted(Collections.reverseOrder())
				.map(String::valueOf)
                	.collect(Collectors.joining());
		System.out.println(descOrder);
	}
}
