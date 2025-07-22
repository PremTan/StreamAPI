package com.test;

import java.util.Comparator;
import java.util.stream.Stream;

/*
	Find the 2nd(Nth) highest length  word in sentence
	I/P : String s = "I am learning Streams API in Java"
	O/P : 7
*/
public class _04_NthHighLenWord 
{
	public static void main(String[] args) 
	{
		String s = "I am learning Streams API in Java";
		int n = 2;
		
		Integer ans = Stream.of(s.split(" "))
			.sorted(Comparator.comparing(String::length).reversed())
				.limit(n)
					.skip(n-1)
						.map(x -> x.length())
							.findFirst()
								.get();
		System.out.println(ans);
	}
}
