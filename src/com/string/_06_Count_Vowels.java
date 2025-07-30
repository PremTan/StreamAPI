package com.string;

public class _06_Count_Vowels 
{
	public static void main(String[] args)
	{
		/*
		 *  6. Count vowels
			📥 String str = "Education";
			📤 5
		 */

		String str = "Education";
		
			Long collect = str.toLowerCase().chars()
				.mapToObj(x -> (char)x)
				.filter(x -> "aeiou".indexOf(x) != -1)
				.count();
			System.out.println(collect);
	}
}
