package com.impbasic.problems;
import java.util.Scanner;
public class SumOfDigitsInGivenNum 
{
	public static void main(String[] args) 
	{
          Scanner s=new Scanner(System.in);
          System.out.println("Enter The Number To Sum Of The Digits");
          int num=s.nextInt();
          int sum=0;
          System.out.println("Given Number Is : "+num);
          
          while(num>0)
          {
        	  sum+=num%10;
        	  num/=10;
          }
          System.out.println("The Sum Of Digits Of Given Number Is :"+sum);
	}

}
