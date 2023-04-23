package com.Java.TestPrograms;

public class P4_SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swaping values are:" + a + " " + b);

		// Swap logic using third variable
		int t = a;
		a = b;
		b = t;
		System.out.println("After swaping values are:" + a + " " + b);
	}
}
