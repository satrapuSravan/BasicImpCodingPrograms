package com.StringPractice;

public class PrintNumbersInGiven_String 
{
	public static void main(String[] args) 
	{
            String s="KE12MPH345";
            for(int i=0;i<s.length();i++)
            {
            	char c=s.charAt(i);
            	if(c>='0'&&c<='9')
            	{
            		System.out.println(c);
            	}
            }
	}
}
