package com.string;

import java.util.stream.Collectors;

public class _10_Special_Chars
{
	public static void main(String[] args)
	{
		/*
		 *  10. Remove all special characters
			📥 String str = "he@llo!#123";
			📤 "hello123"
		 */

		String str = "he@llo!#123";
		
		String collect = str.chars()
			.mapToObj(x -> (char)x)
			.filter(x -> Character.isLetterOrDigit(x))
			.map(String::valueOf)
			.collect(Collectors.joining());
		
		System.out.println("\""+collect+"\"");	
	}
}
