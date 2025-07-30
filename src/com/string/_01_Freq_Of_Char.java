package com.string;

import java.util.Map;
import java.util.stream.Collectors;

public class _01_Freq_Of_Char {

	public static void main(String[] args)
	{
		/*
		 * 1. Count character frequency 
		 * 📥 String str = "aabbccdde"; 
		 * 📤 {a=2, b=2, c=2, d=2, e=1}
		 */
		
		String str1 = "aabbccdde";
		
		Map<Character, Long> collect = 
				str1.chars()
				.mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		
		System.out.println(collect);
	}

}
