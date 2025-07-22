package com.test;

import java.util.stream.Stream;

/*
	Find the words with a specified number of vowels
	No. of vowels = 2
	I/P : String s = "I am learning Streams API in Java"
	O/P : Streams
		  API
		  Java
*/
public class _06_VowelFilter  
{
	public static void main(String[] args) 
	{
		String s = "I am learning Streams API in Java";
		int noOfVowels = 2;
		
		Stream.of(s.split(" "))
			.filter(word -> word.replaceAll("[^aeiouAEIOU]", "").length() == noOfVowels)
				.forEach(System.out::println);
	}
}
