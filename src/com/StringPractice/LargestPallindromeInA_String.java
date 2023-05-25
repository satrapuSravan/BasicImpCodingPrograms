package com.StringPractice;

public class LargestPallindromeInA_String 
{
	public static void main(String[] args)
	{
        String s="malayalam";
        String big=" ";
        
        for(int i=0;i<s.length();i++)
        {
        	for(int j=i+1;j<s.length();j++)
        	{
        		if(isPallindrome(s,i,j))
        		{
        			String tem=s.substring(i,j+1);
        			if(tem.length()>big.length())
        			{
        				big=tem;
        			}
        			//System.out.println(s.substring(i,j+1));
        		}
        	}
        }
        System.out.println(big);
	}
	public static boolean isPallindrome(String s,int start,int end)
	{
		int i=start,j=end;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
}
