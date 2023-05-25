package com.StringPractice;

public class ReverseTheWordsIn_String 
{
	public static void main(String[] args)
	{
     String s1="java is oop lang";
     String[] a=s1.split(" ");
     String s="";
     for(int i=a.length-1;i>=0;i--)
     {
    	 s+=a[i];
    	 s+=" ";
     }
    s= s.trim();
    System.out.println(s);
	}
}
