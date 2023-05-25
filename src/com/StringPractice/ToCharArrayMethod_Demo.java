package com.StringPractice;

public class ToCharArrayMethod_Demo
{
	public static void main(String[] args)
	{
         String s1="abcdefgh";
         char[] a=s1.toCharArray();
         
         for(char s:a)
         {
        	 System.out.print(s+" ");
         }
         System.out.println();
         for(int i=s1.length()-1;i>=0;i--)
         {
        	 System.out.print(a[i]+" ");
         }
	}
}
