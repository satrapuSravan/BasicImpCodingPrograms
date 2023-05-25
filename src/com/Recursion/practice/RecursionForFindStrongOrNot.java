package com.Recursion.practice;

import java.util.Scanner;

public class RecursionForFindStrongOrNot
{
	public static boolean StorngOrNot(int num)
	{
		int sum = 0;
		int n = num;
		while (num > 0) 
		{
			int rem = num % 10;
			sum += RecursionForFactorial.factorial(rem);
			num /= 10;
		}
		return n == sum;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A Number To find StrongOrNot");
		int num = s.nextInt();

		if (StorngOrNot(num))
			System.out.println(num + " Is A Strong Number");
		else
			System.out.println(num + " Is Not A Strong Number");
	}
}
