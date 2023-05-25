package com.DataStructures;

public class TestArrayList 
{
  public static void main(String[] args) 
  {
	ArrayList a=new ArrayList();
	a.add(10);
    a.add(20);
    a.add(30);
    a.add(40);
    a.add(2,35);
   a.add(4,45);
   a.remove(4);
  // a.clear();
    
    for(int i=0;i<a.size();i++)
    {
    	System.out.print(a.get(i)+" ");
    }
    System.out.println();
    
    System.out.println(a.size());
  }
}
