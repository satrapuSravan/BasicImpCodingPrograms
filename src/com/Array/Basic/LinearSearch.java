package com.Array.Basic;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
        int[] a= {2,5,6,4,7,9};
        int ele=6;
        System.out.println(lSearch(a,ele));
	}
    public static int lSearch(int[] a,int ele)
    {
    	for(int i=0;i<a.length;i++)
    	{
    		if(ele==a[i])return i;
    	}
    	return -1;
    }
}
