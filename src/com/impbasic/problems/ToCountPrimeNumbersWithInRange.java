package com.impbasic.problems;
import java.util.Scanner;
public class ToCountPrimeNumbersWithInRange
{
	public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Range Of Two Number To Count The PrimeNumbers With In The Range");
        int num1=s.nextInt();
        int num2=s.nextInt();
        System.out.println("Given Numbers Are "+num1+" And "+num2);
        int count=0;
        
        for(int i=num1;i<=num2;i++)
        {
        	if(i<=1)continue;
        	boolean flag=true;
        	for(int j=2;j<=i/2;j++)
        	{
        		if(i%j==0)
        		{
        			flag=false;
        			break;
        		}
        	}
        	if(flag) 
        	{
        		count++;
        	}
        }
        System.out.println(count);
	}
}
