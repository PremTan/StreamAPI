package com.string;

import java.util.stream.IntStream;

public class _17_Check_Palindrome 
{
	public static void main(String[] args)
	{
		/*
		 *  17. Check if palindrome
			📥 String str = "madam";
			📤 true
		 */

		String str = "madam";
		
		boolean isPalindrome = IntStream.range(0, str.length() / 2)
			.allMatch(x -> str.charAt(x) == str.charAt(str.length() - 1 - x));
			
		System.out.println(isPalindrome );
	}
}