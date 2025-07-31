package com.string;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class _13_MaxFrequencyChar 
{
	public static void main(String[] args)
	{
		/*
		 *  13. Find character with max frequency
			📥 String str = "aabbbcddddd";
			📤 d=5
		 */

		String str = "aabbbcddddd";
		
		Entry<Character, Long> entry = str.chars()
		.mapToObj(x -> (char)x)
		.collect(Collectors.groupingBy(
					x -> x,
					Collectors.counting()))
		.entrySet()
		.stream()
		.max(Map.Entry.comparingByValue())
		.orElse(null);
		
		if(entry != null)
		{
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
}



