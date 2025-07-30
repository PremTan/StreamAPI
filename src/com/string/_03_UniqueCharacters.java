package com.string;

import java.util.List;

public class _03_UniqueCharacters 
{
	public static void main(String[] args)
	{
		/*
		 *  3. Print unique characters
			📥 String str = "stream";
			📤 [s, t, r, e, a, m]
		 */

		String str = "stream";
		
		List<Character> list = 
			str.chars()
			.mapToObj(x -> (char)x)
			.distinct()
			.toList();
		
		System.out.println(list);
	}

}
