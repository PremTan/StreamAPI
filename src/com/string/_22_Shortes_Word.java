package com.string;

import java.util.Comparator;
import java.util.stream.Stream;

public class _22_Shortes_Word 
{
	public static void main(String[] args)
	{
		/*
		 *  22. Shortest word in sentence
			📥 String str = "I love programming in Java";
			📤 "I"
		 */

		String str = "I love programming in Java";
		
		String string = Stream.of(str.split(" "))
		.min(Comparator.comparing(String::length))
		.get();
		
		System.out.println("\""+string+"\"");
	}
}
