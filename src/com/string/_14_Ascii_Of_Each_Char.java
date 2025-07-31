package com.string;

import java.util.stream.Collectors;

public class _14_Ascii_Of_Each_Char 
{
	public static void main(String[] args)
	{
		/*
		 *  14. Get ASCII value of each character
			📥 String str = "AB";
			📤 A=65, B=66
		 */

		String str = "AB";
		
		String collect = str.chars()
			.mapToObj(x -> (char)x+"="+x)
			.collect(Collectors.joining(", "));
		
		System.out.println(collect);
	}
}



