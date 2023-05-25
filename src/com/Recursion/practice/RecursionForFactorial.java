package com.Recursion.practice;

import java.util.Scanner;

public class RecursionForFactorial 
{
	public static int factorial(int num) 
	{
		if(num == 0) return 1;
		return num * factorial(num-1);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number To Find Its Factorial ");
		int num=s.nextInt();
		System.out.println(num +" Is A Given Number");
		
        System.out.println("Factorial of "+num+" Is = "+factorial(num));
	}
}
