package com.string;

import java.util.Map;
import java.util.stream.Collectors;

public class _12_Count_Upper_Lowercase 
{
	public static void main(String[] args)
	{
		/*
		 *  12. Count uppercase and lowercase letters
			📥 String str = "JavaIsFun";
			📤 {Upper=3, Lower=6}
		 */

		String str = "JavaIsFun";
		
		Map<String, Long> collect = str.chars()
			.mapToObj(x -> (char)x)
			.collect(Collectors.groupingBy(
					t -> {
						if(Character.isUpperCase(t))
							return "Upper";
						else
							return "Lower";
					},
					Collectors.counting()));
		System.out.println(collect);
	}
}



