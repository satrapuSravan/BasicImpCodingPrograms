package com.StringPractice;

public class Demo1 {
	public static void main(String[] args)
	{
		   /*
		       String s1=new String("ram");   
		    * Creating Object by using new keyword memory created in heap area.
		    
               String s2="ram";
            * Creating Object By using non primitive data type(String).
              for this type String object will Create in   SCP(String constant Pool);
             
           
           System.out.println(s1==s2);  == check based on String address
           System.out.println(s1.equals(s2)); equals() check based on Strings 
           */ 
		
		    Object o1="ravi";
		    String o2="ravi";
		    
		    System.out.println(o1==o2);
		    System.out.println(o1.equals(o2));
	}

}
