package com.string;

public class _07_Count_Consonants 
{
	public static void main(String[] args)
	{
		/*
		 *  7. Count consonants
			📥 String str = "Education";
			📤 4
		 */

		String str = "Education";
		
			Long collect = str.toLowerCase().chars()
				.mapToObj(x -> (char)x)
				.filter(x -> "aeiou".indexOf(x) == -1)
				.count();
			System.out.println(collect);
	}
}
