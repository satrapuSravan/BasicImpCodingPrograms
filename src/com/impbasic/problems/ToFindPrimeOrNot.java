package com.impbasic.problems;
import java.util.Scanner;
public class ToFindPrimeOrNot 
{
	public static void main(String[] args) 
	{
      Scanner s=new Scanner(System.in);
   System.out.println("Enter A Number To Find Prime Or NotPrime");
      int num=s.nextInt();
      System.out.println("Given Number Is : "+num);
      
      if(num<1) 
       {
    	System.out.println("No Zero's And Negatives Please");
    	return;
       }
      else
       {
    	  for(int i=2;i<num/2;i++)
    	  {
    		  if(num%i==0)
    			  {
    			  System.out.println(num+" Is Not A Prime Number");
    			  return;
    			  }
    	  }
    	     System.out.println(num+" Is A Prime Number"); 
       }
	  }
}
