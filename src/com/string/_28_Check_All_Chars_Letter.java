package com.string;

public class _28_Check_All_Chars_Letter 
{
	public static void main(String[] args)
	{
		/*
		 *  28. Check if all characters are letters
			📥 String str = "abcXYZ";
			📤 true
		 */

		String str = "abcXYZ";
		
		boolean allMatch = str.chars()
			.mapToObj(x -> (char)x)
			.allMatch(Character::isLetter);
		
		System.out.println(allMatch);
	}
}
