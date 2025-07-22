package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/*
	Find the word that has the highest length
	I/P : String s = "I am learning Streams API in Java"
	O/P : learning
*/
public class _01_High_Len_Word 
{
	public static void main(String[] args) 
	{
		String s = "I am learning Streams API in Java";
		
		Arrays.stream(s.split(" "))
			.max(Comparator.comparing(String::length))
				.ifPresent(System.out::println);
		
		System.out.println(".......................");
		
		String max = Stream.of(s.split(" "))
				.max(Comparator.comparing(String::length))
					.get();
			System.out.println(max);
	}
}