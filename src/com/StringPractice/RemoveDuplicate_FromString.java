package com.StringPractice;

public class RemoveDuplicate_FromString 
{
	public static void main(String[] args) 
	{
      String s="Sravans";
      s=s.toLowerCase();
      System.out.println(remove(s));
	}
	public static String remove(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(s1.indexOf(c)==-1)s1+=c;
		}
		return s1;
	}
}
