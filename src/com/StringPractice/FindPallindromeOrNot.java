package com.StringPractice;

public class FindPallindromeOrNot {

	public static void main(String[] args)
	{
        String s1="AbCDdcBa";
               s1=s1.toLowerCase();
        System.out.println(isPallindrome(s1));
        
	}
	public static boolean isPallindrome(String s)
	{
		char[] a=s.toCharArray();
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(a[i]!=a[j])return false;
			i++;
			j--;
		}
		return true;
	}
}
