package com.string;

import java.util.stream.Collectors;

public class _16_Replace_Vowels_With_star 
{
	public static void main(String[] args)
	{
		/*
		 *  16. Replace all vowels with * 
			📥 String str = "hello world";
			📤 "h*ll* w*rld"
		 */

		String str = "hello world";
		
		String collect = str.toLowerCase().chars()
			.mapToObj(x -> (char)x)
			.map(x -> "aeiou".indexOf(x) != -1 ? "*" : String.valueOf(x))
			.collect(Collectors.joining());
		
		System.out.println("\""+collect+"\"");
	}
}



