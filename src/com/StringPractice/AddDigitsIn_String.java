package com.StringPractice;

public class AddDigitsIn_String
{
	public static void main(String[] args) 
	{
            String s="KE123MPHS453";
            int sum=0;
            
            for(int i=0;i<s.length();i++)
            {
            	char c=s.charAt(i);
            	if(c>='0'&&c<='9')
            	{
            		int num=c-'0';
            		sum+=num;
            	}
            }
            System.out.println(sum);
	}

}
