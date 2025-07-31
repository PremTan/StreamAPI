package com.string;

import java.util.List;
import java.util.stream.Stream;

public class _23_Palindromic_Words 
{
	public static void main(String[] args)
	{
		/*
		 *  23. Print all palindromic words
			📥 String str = "madam level racecar hello world";
			📤 [madam, level, racecar]
		 */

		String str = "madam level racecar hello world";
		
		List<String> list = Stream.of(str.split(" "))
			.filter(x -> x.equals(new StringBuffer(x).reverse().toString()))
			.toList();
		
		System.out.println(list);
	}
}
