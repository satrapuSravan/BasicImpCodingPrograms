package com.impbasic.problems;
import java.util.Scanner;
public class AddEvenAndOddSeparately
{
    public static void main(String[] args) 
    {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number To Add Even And Odd Separately");
		int num=s.nextInt();
		int even=0;
		int odd=0;
		System.out.println("Given Number Is "+num);
		
		if(num<=0)System.out.println("No Zero And Negatives Please");
		else
		{
			while(num>0)
			{
			  int n=num%10;
			  num/=10;
			  if(n%2==0)even+=n;
			  else odd+=n;
			}
			System.out.println("Sum Of Even In Given Number Is : "+even);
			System.out.println("Sum Of Odd In Given Number Is : "+odd);
		}
	}
}
