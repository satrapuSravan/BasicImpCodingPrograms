package com.StringPractice;

public class CountLength_WithoutLengthMethod 
{
	public static void main(String[] args) 
	{
       String s1="abcdefgh";
       char[] a=s1.toCharArray();
       int count=0;
       
       for(char s:a)
       {
    	   count++;
       }
       System.out.println("length Of Given String Is : "+ count);
	}

}
