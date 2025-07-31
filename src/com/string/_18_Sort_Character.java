package com.string;

import java.util.stream.Collectors;

public class _18_Sort_Character 
{
	public static void main(String[] args)
	{
		/*
		 *  18. Sort characters alphabetically
			📥 String str = "dbca";
			📤 "abcd"
		 */

		String str = "dbca";
		
		String sorted = str.chars().mapToObj(x -> (char)x)
				.sorted()
				.map(String::valueOf)
				.collect(Collectors.joining());
			
		System.out.println("\""+sorted+"\"");
	}
}
