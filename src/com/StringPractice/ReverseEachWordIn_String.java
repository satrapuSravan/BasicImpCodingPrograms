package com.StringPractice;

public class ReverseEachWordIn_String {

	public static void main(String[] args)
	{
         String s="java is oop lang";
         String[] s1=s.split(" ");
         String s2="";
         for(String c:s1)
         {
        	 s2+=rev(c);
        	 s2+=" ";
         }
         s2=s2.trim();
         System.out.println(s2);
	}
	public static String rev(String s)
	{
		char[] a=s.toCharArray();
		int i=0,j=a.length-1;
		while(i<j)
		{
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		   i++;j--;
		}
		return new String(a);
	}
}
