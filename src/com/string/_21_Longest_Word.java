package com.string;

import java.util.Comparator;
import java.util.stream.Stream;

public class _21_Longest_Word 
{
	public static void main(String[] args)
	{
		/*
		 *  21. Longest word in sentence
			📥 String str = "I love programming in Java";
			📤 "programming"
		 */

		String str = "I love programming in Java";
		
		String string = Stream.of(str.split(" "))
		.max(Comparator.comparing(String::length))
		.get();
		
		System.out.println("\""+string+"\"");
	}
}
