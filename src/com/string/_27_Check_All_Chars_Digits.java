package com.string;

public class _27_Check_All_Chars_Digits 
{
	public static void main(String[] args)
	{
		/*
		 *  27. Check if all characters are digits
			📥 String str = "123456";
			📤 true
		 */

		String str = "123456";
		
		boolean allMatch = str.chars()
			.mapToObj(x -> (char)x)
			.allMatch(Character::isDigit);
		
		System.out.println(allMatch);
	}
}
