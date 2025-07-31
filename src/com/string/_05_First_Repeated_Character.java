package com.string;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class _05_First_Repeated_Character 
{
	public static void main(String[] args)
	{
		/*
		 *  5. Find first repeated character
			📥 String str = "eabeacddc";
			📤 e
		 */

		String str = "eabeacddc";
		
		Character character = str.chars()
			.mapToObj(x -> (char)x)
			.collect(Collectors.groupingBy(
						x -> x,
						LinkedHashMap::new,
						Collectors.counting()))
			.entrySet()
			.stream()
			.map(x -> x.getKey())
			.findFirst()
			.get();
		
		System.out.println(character);
	}

}
