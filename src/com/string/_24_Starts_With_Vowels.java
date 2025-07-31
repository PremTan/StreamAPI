package com.string;

import java.util.List;
import java.util.stream.Stream;

public class _24_Starts_With_Vowels 
{
	public static void main(String[] args)
	{
		/*
		 *  24. Words starting with vowels
			📥 String str = "Apple orange mango banana elephant";
			📤 [Apple, orange, elephant]
		 */

		String str = "Apple orange mango banana elephant";
		
		List<String> list = Stream.of(str.split(" "))
		.filter(x -> "aeiou".indexOf(Character.toLowerCase( x.charAt(0))) != -1)
		.toList();
		
		System.out.println(list);
	}
}
