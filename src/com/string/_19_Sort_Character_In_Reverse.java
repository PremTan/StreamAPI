package com.string;

import java.util.Comparator;
import java.util.stream.Collectors;

public class _19_Sort_Character_In_Reverse 
{
	public static void main(String[] args)
	{
		/*
		 *  19. Sort characters in reverse
			📥 String str = "abghcd";
			📤 "hgdcba"
		 */

		String str = "abghcd";
		
		String sorted = str.chars().mapToObj(x -> (char)x)
				.sorted(Comparator.reverseOrder())
				.map(String::valueOf)
				.collect(Collectors.joining());
			
		System.out.println("\""+sorted+"\"");
	}
}
