package com.impbasic.problems;

import java.util.Scanner;

public class ReverseTheNum 
{
	public static void main(String[] args)
	{
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter The Number : ");
       int num=scn.nextInt();
       int rev=0;
       System.out.println("Entere Number Is : "+num);
       
       if(num<=0)System.out.println("No Negatives And Zero's");
       
       else
       {
    	  while(num>0)
    	  {
    		  rev = rev*10+num%10;
    		  num/=10;
    	  }
    	  System.out.println("The Reverse Number Is : "+rev);
       }
       
	}

}
