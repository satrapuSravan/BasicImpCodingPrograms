package com.Array.Basic;

public class PrintAllElementsInArray
{
	public static void main(String[] args) 
	{
//          int[] a=new int[3];  //One Way to Create An Array.
//          a[0]=10;
//          a[1]=20;
//          a[2]=30;
		 
		    int[] a= {1,4,2,5};    //2nd way to create An Array and add values directly
		    
//          for(int i=0;i<a.length;i++)   //one way to print by using for loop
//          {
//        	  System.out.print(a[i]+" ");
//          }
//          System.out.println();
          for(int s:a)                     //2nd way to print in using for each loop
          {
        	  System.out.print(s+" ");
          }
	}
}
