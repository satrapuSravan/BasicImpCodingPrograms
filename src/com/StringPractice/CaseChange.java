package com.StringPractice;
public class CaseChange
{
	public static void main(String[] args) 
	{
       String s="SRAvan";
       System.out.println(changeCase(s));
	}
	public static String changeCase(String s)
	{
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='A'&&a[i]<='Z')
			{
				a[i]=(char)(a[i]+32);
			}
			else if(a[i]>='a'&&a[i]<='z')
			{
				a[i]=(char)(a[i]-32);
			}
		}
		return new String(a);
	}
}
