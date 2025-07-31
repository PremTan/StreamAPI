package com.string;

public class _15_Sum_Ascii 
{
	public static void main(String[] args)
	{
		/*
		 *  15. Sum of ASCII values
			📥 String str = "AB";
			📤 131
		 */

		String str = "AB";
		
		Integer integer = str.chars()
			.mapToObj(x -> x)
			.reduce((x,y) -> x+y)
			.get();
		System.out.println(integer);
	}
}



