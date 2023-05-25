package com.impbasic.problems;
import java.util.Scanner;

public class FactorsOfNum
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
        System.out.println("Enter A Number To Find Factors Of Num");
        
        int num=s.nextInt();
       
        for(int i=1;i<=num;i++) 
        {
        	if(num%i==0)
        		System.out.println(i);
        }
	}
}
