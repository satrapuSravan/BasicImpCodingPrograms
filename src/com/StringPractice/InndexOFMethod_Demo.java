package com.StringPractice;

public class InndexOFMethod_Demo 
{
	public static void main(String[] args) 
	{
       String s="abcdefghabc";  //index values of each char(a=0,b=1,c=2,d=3,e=4,f=5,g=6,h=7,a=8,b=9,c=10)
       System.out.println(s.indexOf('f'));   //gives f index value 
       System.out.println(s.indexOf('h'));   //gives h index value.
       System.out.println(s.indexOf('i'));   //if value not present in string it returns -1.
       System.out.println(s.indexOf("cde")); //gives 1st char index value.(c=2)
       System.out.println(s.indexOf('a',1)); // gives a index value,and start searching form 1.
       System.out.println(s.indexOf('c',3)); // gives c index value,and start searching form 3.
       System.out.println(s.indexOf('d',4)); //gives d index value,and start searching form 4 
                                             //  if value not present in string it returns -1.
       System.out.println(s.indexOf("ab",2));// gives first char(a)index value,and start searching form 2.
	}

}
