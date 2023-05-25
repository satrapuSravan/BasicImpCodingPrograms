package com.impbasic.problems;
import java.util.Scanner;
public class StrongNumberOrNot 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number To Find Strong Number Or Not");
		int num=s.nextInt();
		int n=num;
		System.out.println("Given Number Is "+n);
		int sum=0;
		
		while(num>0) 
		{
			int d=num%10;
			int fact=1;
			for(int i=1;i<=d;i++)
			{
				fact*=i;
				//System.out.println("itreation no:-"+i);
				//System.out.println("factorial is : "+fact);
			}
			sum+=fact;
			num/=10;
			//System.out.println("sum of fact is : "+sum);
		}
		
		if(n==sum) System.out.println(n+" Is A Strong Number");
		else System.out.println(n+ " Is Not A Strong Numbeer");
	}
}
