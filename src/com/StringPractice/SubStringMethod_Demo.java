package com.StringPractice;

public class SubStringMethod_Demo 
{
	public static void main(String[] args)
	{
      String s1="anand";
      System.out.println(s1.substring(3));
      System.out.println(s1.substring(2,5));
      
      /*for(int i=0;i<s1.length();i++) 
      {
    	for(int j=i+1;j<s1.length();j++)
    	{
    		System.out.println(i+" "+ j);
    		System.out.println(s1.substring(i, j+1));
    	}
      }*/
	}

}
