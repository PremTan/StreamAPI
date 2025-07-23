package com.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
	Find the first non-repeated character
	I/P : String s = "Hello Hi World";
	O/P : e
*/
public class _11_First_Non_Repeated_Char  
{
	public static void main(String[] args) 
	{
		String s = "Hello Hi World";
		
		Optional<Character> firstNonRepeated = s.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(
        		c -> c, 
        		LinkedHashMap::new, 
        		Collectors.counting()
        ))
        .entrySet()
        .stream()
        .filter(entry -> entry.getValue() == 1)
        .map(Map.Entry::getKey)
        .findFirst();
		firstNonRepeated.ifPresent(c -> System.out.println("First non-repeated character: " + c));
	}
}
