package com.Array.Basic;

public class PrintSmallestNumberInArray 
{
	public static void main(String[] args)
	{
           int[] a= {4,3,6,2,1};
           System.out.println(smalleNum(a));
	}
     static int smalleNum(int[] a)
     {
    	 int ele=a[0];
    	 for(int i=1;i<a.length;i++)
    	 {
    		 if(ele>a[i])ele=a[i];
    	 }
    	 return ele;
     }
}
