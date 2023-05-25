package com.impbasic.problems;
import java.util.Scanner;
public class ArmStrongNumOrNot 
{
  public static void main(String[ ] args)
  {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter A Number To Find ArmStrongNumber Or Not");
	int num=s.nextInt();
	int n=num;
	System.out.println("Given Number Is "+num);
	int length=0,sum=0;
	while(num>0)
	{
		length++;
		num/=10;
	}
	//System.out.println(length);
	num=n;
	while(num>0)
	{
		int power=1;
		int digit =num%10;
		int i=0;
		while(i<length)
		{
			power*=digit;
			i++;
		}
		 sum+=power;
		 num/=10;
	}
	if(sum==n)System.out.println(n+" Is A ArmStrongNumber");
	else System.out.println(n+" Is Not A ArmStrongNumber");
  }
}
