package com.string;

import java.util.stream.Collectors;

public class _09_Remove_whitespaces
{
	public static void main(String[] args)
	{
		/*
		 *  9. Remove all whitespaces
			📥 String str = "a b c d e";
			📤 "abcde"
		 */

		String str = "a b c d e";
		
		String collect = str.chars()
			.mapToObj(x -> (char)x)
			.filter(x -> Character.isLetter(x))
			.map(String::valueOf)
			.collect(Collectors.joining());
		
		System.out.println("\""+collect+"\"");	
	}
}
