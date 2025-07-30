package com.string;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _02_DuplicateCharacters 
{
	public static void main(String[] args)
	{
		/*
		 * 2. Print duplicate characters 
		 * 📥 String str = "programming";
		 * 📤 [r, g, m]
		 */

		String str = "programming";
		
		List<Character> duplicates = str.chars()
	            .mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(
	            		x -> x, Collectors.counting()))
	            .entrySet()
	            .stream()
	            .filter(entry -> entry.getValue() > 1)
	            .map(Map.Entry::getKey)
	            .collect(Collectors.toList());
		
		System.out.println(duplicates);
	}

}
