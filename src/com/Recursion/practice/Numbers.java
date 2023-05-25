package com.Recursion.practice;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		printNum(num);
		System.out.println(catEyes(num));
		System.out.println(power(2,3));
	}

	public static void printNum(int num) {
		if (num == 0)
			return;
		else {
			System.out.println(num);
			printNum(num - 1);
		}
	}

	public static int catEyes(int num) {
		if (num == 0)return 0;
		else {
		return 2+catEyes(num-1);
		}
	}

	public static int power(int base, int exp) {
		if (exp == 1)
			return base;
		else {
			return base * power(base, exp - 1);
		}
	}

}
