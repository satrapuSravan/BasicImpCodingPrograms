package com.StringPractice;

public class CounteEachCharRepitation 
{
	public static void main(String[] args)
	{
       String s=" abcaabcccd ";
       s=s.trim();
     
       while(s.length()>0)
       {
    	   char a=s.charAt(0);
    	   String s1=s.replace(a+"","");
    	   int count=s.length()-s1.length();
    	   System.out.println(a+"= "+count);
    	   s=s1;
       }
	}
}
