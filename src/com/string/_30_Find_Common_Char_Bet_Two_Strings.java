package com.string;

import java.util.List;
import java.util.stream.Collectors;

public class _30_Find_Common_Char_Bet_Two_Strings 
{
	public static void main(String[] args)
	{
		/*
		 *  30. Find common characters between two strings
			📥 String s1 = "abcd"; 
			   String s2 = "bcde";
			📤 [b, c, d]
		 */

		String s1 = "abcd"; 
		String s2 = "bcde";
		
		List<Character> list = s1.chars()
				.mapToObj(x -> (char)x)
//				.filter(x -> s2.contains(x+""))
				.filter(x -> s2.indexOf(x) != -1)
				.distinct()
				.collect(Collectors.toList());
	
		System.out.println(list);
	}
}
