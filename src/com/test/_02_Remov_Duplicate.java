package com.test;

/*
	Remove duplicates from the string and return in the same order
	I/P : String s = "dadabcefgbcadefg"
	O/P : dabcefg
*/
public class _02_Remov_Duplicate 
{
	public static void main(String[] args) 
	{
		String s = "dabcadefg";
		
		s.chars()
			.distinct()
				.mapToObj(x -> (char)x)
					.forEach(System.out::print);
	}
}
