package com.string;

import java.util.stream.Collectors;

public class _08_Remove_Digits 
{
	public static void main(String[] args)
	{
		/*
		 *  8. Remove all digits
			📥 String str = "abc123xyz";
			📤 "abcxyz"
		 */

		String str = "abc123xyz";
		
		String collect = str.chars()
			.mapToObj(x -> (char)x)
			.filter(x -> Character.isLetter(x))
			.map(String::valueOf)
			.collect(Collectors.joining());
		
		System.out.println(collect);			// abcxyz
		System.out.println("\""+collect+"\"");	// "abcxyz"
	}
}
