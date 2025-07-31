package com.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _25_Capitalize_Each_Word 
{
	public static void main(String[] args)
	{
		/*
		 *  25. Capitalize first letter of each word
			📥 String str = "hello world java stream";
			📤 "Hello World Java Stream"
		 */

		String str = "hello world java stream";
		
		String collect = Stream.of(str.split(" "))
			.map(x -> x.substring(0,1).toUpperCase() + x.substring(1))
			.collect(Collectors.joining(" "));
		
		System.out.println("\""+collect+"\"");
	}
}
