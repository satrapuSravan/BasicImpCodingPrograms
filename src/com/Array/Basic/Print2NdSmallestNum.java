package com.Array.Basic;

public class Print2NdSmallestNum 
{
	public static void main(String[] args) 
	{
        int[] a= {3,5,6,7,9};
        System.out.println(find(a));
	}
    static int find(int[] a)
    {
    	int ref1=a[0];
    	int ref2=a[0];
    	
    	for(int i=1;i<a.length;i++)
    	{
    		if(ref1>a[i])
    		{
    			ref2=ref1;
    			ref1=a[i];
    		}
    		else if(ref2>a[i]||ref1==ref2)
    		{
    			ref2=a[i];
    		}
    	}
    	return ref2;
    }
}
