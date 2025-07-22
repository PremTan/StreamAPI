package com.test;

import java.util.Comparator;
import java.util.stream.Stream;

/*
	Find the word that has the 2nd(Nth) highest length
	I/P : String s = "I am learning Streams API in Java"
	O/P : Streams
*/
public class _03_NthLongestWord 
{
	public static void main(String[] args) 
	{
		String s = "I am learning Streams API in Java";
		int n = 2;
		
		Stream.of(s.split(" "))
			.sorted(Comparator.comparing(String::length).reversed())
				.limit(n)
					.skip(n-1)
						.forEach(System.out::println);
	}
}
