package com.Array.Sorting;

public class InserationSort 
{
	public static void main(String[] args) 
	{
		 int[] a= {2,1,8,4,3,5,9};
	       sort(a);
	       for(int m:a)
	       {
	    	   System.out.print(m+" ");
	       }
	}
    public static void sort(int[] a)
    {
    	for(int i=1;i<a.length;i++)
    	{ 
    		int key=a[i];
    		int j=i-1;
    		while(j>=0&&a[j]>key)
    		{
    			a[j+1]=a[j];
    			j--;
    		}
    		a[j+1]=key;
    	}
    }
}
