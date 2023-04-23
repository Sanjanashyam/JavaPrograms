package com.Java.TestPrograms;

import java.util.Scanner;

public class P3_PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int orig_num = num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (orig_num == rev) {
			System.out.println(orig_num + " Palindrome Number");
		} else {
			System.out.println(orig_num + " NOT a Palindrome Number");
		}
	}
}
