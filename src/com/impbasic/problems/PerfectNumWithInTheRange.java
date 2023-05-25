package com.impbasic.problems;
import java.util.Scanner;

public class PerfectNumWithInTheRange
{
	public static void main(String main[])
	{
	    Scanner scn = new Scanner(System.in);
	    System.out.println("Enter Start Number");
	    int start=scn.nextInt();
	    System.out.println("Enter End Number");
	    int end=scn.nextInt();
	    
	    System.out.println("Perfect Numbers between " + start + " and " + end + " are :");
	    
	    for (int i=start;i<=end;i++)
	    {
	    	int sum=0;
	        for (int j=1;j<i;j++)
	        {
	            if (i%j==0)  sum+=j;
	        }
	     if(sum==i)System.out.println(i);
	    }
	}
}

