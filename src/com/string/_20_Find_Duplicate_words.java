package com.string;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _20_Find_Duplicate_words 
{
	public static void main(String[] args)
	{
		/*
		 *  20. Find duplicate words in sentence
			📥 String str = "hi hello hi hello hi";
			📤 {hi=3, hello=2}
		 */

		String str = "hi hello hi hello hi";
		
		Map<String, Long> collect = Stream.of(str.split(" "))
		.collect(Collectors.groupingBy(
					x -> x, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(x -> x.getValue() > 1)
		.collect(Collectors.toMap(
					Map.Entry::getKey,
					Map.Entry::getValue
				));
			
		System.out.println(collect);
	}
}
