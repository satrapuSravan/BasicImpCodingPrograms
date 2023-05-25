package com.impbasic.problems;
import java.util.Scanner;
public class ToFindPerfectNumberOrNot
{
	public static void main(String[] args)
	{
     Scanner s=new Scanner(System.in);
     System.out.println("Enter A Number To Find PerfectNumber Or NotPerfectNumber");
     int num=s.nextInt();
     int sum=0;
     System.out.println("Given Number Is : "+num);
     
     if(num<1)
     {
    	 System.out.println("No Negatives And Zero's Please");
    	return;
     }
     else
     {
    	 for(int i=1;i<num;i++)
    	 {
    		 if(num%i==0)sum+=i;
    	 }
    	 if(num==sum)System.out.println(num+" Is A Perfect Number ");
    	 else System.out.println(num+" Is Not A Perfect Number ");
     }
	}
}
