package com.StringPractice;

public class ReverseThe_String 
{
   public static void main(String[] args) 
   {
	   String s="sravAn";
	   s=s.toLowerCase();
	   System.out.println(rev(s));
	   
   }
   public static String rev(String a)
   {
	   char[] s=a.toCharArray();
	   int i=0,j=s.length-1;
	   while(i<j)
	   {
		   char temp=s[i];
		   s[i]=s[j];
		   s[j]=temp;
		   i++;
		   j--;
	   }
	   return new String(s);
   }

}
