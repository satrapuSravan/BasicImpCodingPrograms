package com.StringPractice;

public class ReverseEachWordWithoutSplit 
{
	public static void main(String[] args) 
	{
       String s="java is oops lang";
       char[] a=s.toCharArray();
       String s1="";
       
       int len=a.length;
       int i=0,j=0;
       while(j<len)
       {
    	   while(j<len&&a[i]!=' ')j++;
    	   System.out.println(j);
    	   String temp="";
    	   int k=j-1;
    	   while(k>=i)
    	   {
    		   temp+=a[k];
    		   k--;
    		 System.out.println(k);
    	   }
    	   s1+=temp;
    	  //if(j<len)s1+=" ";
    	  //j++; 
    	  //i=j;
       }
       System.out.println(s1);
	}
}
