package com.string;

public class _26_Count_No_Of_Digits 
{
	public static void main(String[] args)
	{
		/*
		 *  26. Count number of digits
			📥 String str = "a1b2c3d4e5";
			📤 5
		 */

		String str = "a1b2c3d4e5";
		
		long count = str.chars()
			.mapToObj(x -> (char)x)
			.filter(Character::isDigit)
			.count();
		
		System.out.println(count);
	}
}
