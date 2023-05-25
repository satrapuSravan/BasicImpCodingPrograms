package com.Recursion.practice;

import java.util.Scanner;

public class ToprintNaturalNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A Number To print All Natural Number Upto Number");
		int num = s.nextInt();
		System.out.println("--------------Given Number Is: " + num);

		// printNum(num);
		//System.out.println(count(num));
		reverseNum(num);
	}

	public static void printNum(int num) {
		if (num <= 0)
			return;
		else {
			System.out.println(num);
			printNum(num - 1);
		}
	}

	public static int count(int num) {
		if (num == 0)
			return 0;
		return 1 + count(num / 10);
	}
	
	public static void reverseNum(int num)
	{ 
		if(num<10) 
		{
			System.out.println(num);
			return;
		}
		else {
			System.out.print(num%10);
			reverseNum(num/10);
		}
	}
}
