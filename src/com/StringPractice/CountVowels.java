package com.StringPractice;

public class CountVowels 
{
	public static void main(String[] args)
	{
        String s="javAdeveLopEr";
        s=s.toLowerCase();
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
        	char c=s.charAt(i);
        	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        	{
        		count++;
        	}
        }
        System.out.println(count);
	}

}
