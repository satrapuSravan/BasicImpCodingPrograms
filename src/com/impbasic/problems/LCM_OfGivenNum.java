package com.impbasic.problems;

import java.util.Scanner;
public class LCM_OfGivenNum
{
	public static void main(String[] args) 
	{
     Scanner s= new Scanner(System.in);
     System.out.println("Enter Two Numbers To Find There LCM :");
     int num1=s.nextInt();
     int num2=s.nextInt();
     int c=num1>num2?num1:num2;
     System.out.println("Given Numbers Are : "+num1+" And "+num2);
     while(true)
      {
    	 if(c%num1==0&&c%num2==0) break;
    		 c++;
      }
     System.out.println("LCM Of Given Numbers Is : "+c);
	}
}
