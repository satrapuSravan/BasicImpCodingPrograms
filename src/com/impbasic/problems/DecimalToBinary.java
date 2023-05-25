package com.impbasic.problems;
import java.util.Scanner;
public class DecimalToBinary 
{
	public static void main(String[] args)
	{
     Scanner s=new Scanner(System.in);
     System.out.println("Enter A Number To Find It's Binary Number");
     int dec=s.nextInt();
     int i=1;
     int bin=0;
     System.out.println("Givne Number Is : "+dec);
     
     while(dec>0) {
    	 bin+=dec%2*i;
    	 dec/=2;
    	 i*=10;
     }
     System.out.println("The Binary Number Of Given Number Is : "+bin);
	}
}
