package com.Java.TestPrograms;

import java.util.Scanner;

public class P2_ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // To input the number from user
		System.out.println("Enter the Number:");
		int num = sc.nextInt(); //1234
		int rev = 0;
		
		//Using Algorithm
		while (num!= 0) {
			rev = rev*10 + num%10; //0*10+1234%10=0+4=4  40+3=43  430+2=432  4320+1=4321
			num = num/10; //1234/10=123  123/10=12  12/10=1  1/0=0
		}

	/*	//Using StringBuffer
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		*/

		System.out.println("Reversed Number is:" + rev);
	}
}
