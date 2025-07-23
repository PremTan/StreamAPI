package com.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
	Find the occurrence of each word
	I/P : String s = "Mississippi"
	O/P : {M=1, i=4, s=4, p=2}
*/
public class _08_Occurence_Of_Each_Char  
{
	public static void main(String[] args) 
	{
		String s = "Mississippi";
		LinkedHashMap<String, Long> collect = Arrays.stream(s.split(""))
			.collect(Collectors.groupingBy(
				x -> x,
				LinkedHashMap::new,
				Collectors.counting()
			));
		System.out.println(collect);
		
		System.out.println("......................");
		
		Map<String, Long> collect2 = Arrays.stream(s.split(""))
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect2);
	}
}
