package com.impbasic.problems;
import java.util.Scanner;

public class CommanFactorsOf2Num 
{

	public static void main(String[] args)
	{
       Scanner s=new Scanner(System.in);
       System.out.println("Enter Two Numbers To Find CommanFactorsOf2Num ");
       
       int num1=s.nextInt();
       int num2=s.nextInt();
       
       for(int i=1;i<=num2;i++)
       {
    	 if(num1%i==0&&num2%i==0) 
    		 System.out.println(i);
       }
	}
}
