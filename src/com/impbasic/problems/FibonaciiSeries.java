package com.impbasic.problems;

import java.util.Scanner;

public class FibonaciiSeries {
	public static void main(String[] args) 
	{
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a=0,b=1,c;
       
       //int x= s.nextInt();
       //int y=s.nextInt();
       
      for(int i=1;i<=n;i++)//used to print series of count n;
       {
    	  System.out.print(a+",");
    	  c=a+b;
//    	  System.out.print("Of c "+c+" ");
//    	  System.out.println();
    	  a=b;
//    	  System.out.print("Of a "+a+" ");
//    	  System.out.println();
    	  b=c;
//    	  System.out.print("Of b "+b+" ");
//    	  System.out.println();
       }
       
//       while(a<=n)
//       {
//    	   System.out.print(a+",");  //use to print series less the n;
//    	   c=a+b;
//    	   a=b;
//    	   b=c;
//       }
        
//       while(a<=y)//use to print series with i range x and y;
//       {
//    	   if(a>=x)System.out.print(a+",");
//    	   c=a+b;
//    	   a=b;
//    	   b=c;
//       }
	}
}
