package com.impbasic.problems;
import java.util.Scanner;

public class HCF_OfGivenNum 
{
	public static void main(String[] args)
	{
         Scanner s=new Scanner(System.in);
         System.out.println("Enter Two Number To Find There GCD :");
         int num1=s.nextInt();
         int num2=s.nextInt();
         
         System.out.println("Given Numbers Are : "+num1+" And "+num2);
         while(num1%num2!=0)
         {
        	 int hcf=num1%num2;
        	 num1=num2;
        	 num2=hcf;
         }
         System.out.println("HCF Of Given Numbers Is :"+num2);
	}

}
