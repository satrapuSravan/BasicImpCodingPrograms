package com.StringPractice;

public class CharAtMethod_Demo 
{
	public static void main(String[] args) 
	{
          String s1="ravi";
          
          for(int i=0;i<s1.length();i++)
          {
        	  System.out.println(s1.charAt(i));
          }
          System.out.println("**************************");
          for(int j=s1.length()-1;j>=0;j--)
          {
        	  System.out.println(s1.charAt(j));
          }
	}

}
