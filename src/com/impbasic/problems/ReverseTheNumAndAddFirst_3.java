package com.impbasic.problems;

import java.util.Scanner;

public class ReverseTheNumAndAddFirst_3 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);	
		System.out.println("Enter The Number ");
		int a=s.nextInt();
		System.out.println("Enter Number Is : "+a);
		int count=0;
		int rev=0;
		int sum=0;
		
		if(a<=0)System.out.println(" No Negatives And Zero's Please ");
		
		else
		{
			while(a>0) 
		{
			rev = rev*10 + a%10;
			a/=10;
			count++;
			if(count<4) 
			{
			  sum+=rev%10;
		
	        }
	    }
		System.out.println("Reverse Number Of Given Number is : "+rev);
		System.out.println("Sum Of First Three Digits Of Reverse Number Is : "+sum);
		}
	}
}

