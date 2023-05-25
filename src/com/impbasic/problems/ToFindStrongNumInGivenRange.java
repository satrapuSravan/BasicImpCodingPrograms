package com.impbasic.problems;
import java.util.Scanner;
public class ToFindStrongNumInGivenRange
{
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)fact*=i;
		return fact;
	}
	
	public static int strongNum(int num)
	{
		int sum=0;
		while(num!=0) 
		{
			int d=num%10;
			 sum+=factorial(d);
			num/=10;
		}
		return sum;
	}
	
	public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter A Number To Find Strong Number WIth In The Number");
			int range=s.nextInt(); 
			System.out.println("Given Number Is "+range);
			
		   for(int i=1;i<=range;i++)
		    {
			if(i==strongNum(i))System.out.println(i);
		    }
		}
}
