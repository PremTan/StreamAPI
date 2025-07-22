package com.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Find the Occurrence of each word & preserve order also
	I/P : String s = "I am learning Streams API in Java Java"
	O/P : {Java=2, in=1, I=1, API=1, learning=1, am=1, Streams=1}
*/
public class _05_OccurenceOfEachWord 
{
	public static void main(String[] args)
	{
		String s = "I am learning Streams API in Java Java";

		Map<String, Long> wordCount = Stream.of(s.split(" "))
			.collect(Collectors.groupingBy(
				Function.identity(),
//				word -> word,     		// same as Function.identity()
				LinkedHashMap::new, 
				Collectors.counting()
		));
		System.out.println(wordCount);
	}
}
