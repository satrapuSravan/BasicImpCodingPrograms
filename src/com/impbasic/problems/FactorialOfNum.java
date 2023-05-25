package com.impbasic.problems;
import java.util.Scanner;

public class FactorialOfNum
{

	public static void main(String[] args) 
	{
       Scanner s=new Scanner(System.in);
       System.out.println("Enter A Number To Find Factorial Of Num");
       
        int num=s.nextInt();
        int fact=1;
        
        for(int i=1;i<=num;i++)
        {
        	fact*=i;
        }
       System.out.println(fact);
	}

}
