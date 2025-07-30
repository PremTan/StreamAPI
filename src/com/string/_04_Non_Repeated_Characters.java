package com.string;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _04_Non_Repeated_Characters 
{
	public static void main(String[] args)
	{
		/*
		 *  4. Find first non-repeating character
			📥 String str = "aabbcdde";
			📤 c, e
		 */

		String str = "aabbcdde";
		
			List<Character> collect = 
				str.chars()
				.mapToObj(x -> (char)x)
				.collect(Collectors.groupingBy(
						x -> x, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x -> x.getValue() == 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
			
		System.out.println(
				collect.stream()
				.map(String::valueOf)
				.collect(Collectors.joining(", "))
				);
	}

}
