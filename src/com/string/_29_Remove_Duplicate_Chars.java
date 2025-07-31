package com.string;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class _29_Remove_Duplicate_Chars 
{
	public static void main(String[] args)
	{
		/*
		 *  29. Remove duplicate characters (keep order)
			📥 String str = "aabbccdde";
			📤 "abcde"
		 */

		String str = "aabbccdde";
		
		String result = str.chars()
			.mapToObj(x -> (char)x)
			.distinct()
			.map(String::valueOf)
			.collect(Collectors.joining());
		
		System.out.println("\""+result+"\"");
		
		System.out.println("............ OR ............");
		
		result = str.chars()
	            .mapToObj(c -> (char) c)
	            .collect(Collectors.collectingAndThen(
	                Collectors.toCollection(LinkedHashSet::new),
	                set -> set.stream()
	                          .map(String::valueOf)
	                          .collect(Collectors.joining())
	            ));
	
		System.out.println("\""+result+"\"");
	}
}
