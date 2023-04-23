package com.Java.TestPrograms;

public class P1_ReverseString {

	public static void main(String[] args) {

		String str = "Hello";
		char[] ca = str.toCharArray();
		int size = ca.length; // 5
		String reversedString = "";

		for (int i = size - 1; i >= 0; i--) {
			reversedString = reversedString + ca[i]; // olleH
		}
		System.out.println(reversedString);
	}
}
