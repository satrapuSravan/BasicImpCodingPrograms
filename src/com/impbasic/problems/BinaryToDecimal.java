package com.impbasic.problems;
import java.util.Scanner;

public class BinaryToDecimal
{
	public static void main(String[] args) 
	{
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Binary Numbers (Like 0's And 1's Only) To Find There Decimal Value");
      int bin=s.nextInt();
      System.out.println("Given Binary Number Is : "+bin);
      int dec=0;
      int i=1;
      
      while(bin>0)
      {
    	  dec+=bin%10*i;
    	  bin/=10;
    	  i*=2;
      }
      System.out.println("For A Given Binary Number Decimal Value Is : "+dec);
	}

}
