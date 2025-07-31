package com.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _11_Reverse_String 
{
	public static void main(String[] args)
	{
		/*
		 *  11. Reverse a string
			📥 String str = "stream";
			📤 "maerts"
		 */

		String str = "stream";
		
		// Using StringBuilder
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println("\""+reversed+"\"");
		
		
		// Using Stream API
		String rev = IntStream.range(0,str.length())
                .mapToObj(i -> str.charAt(str.length() - 1 - i))
                .map(String::valueOf)
                .collect(Collectors.joining());
		
		System.out.println("\""+rev+"\"");	
		
	}
}



