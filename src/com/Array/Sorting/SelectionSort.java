package com.Array.Sorting;

public class SelectionSort 
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
    	for(int i=0;i<a.length;i++)
    	{
    		int index=i;
    		for(int j=i+1;j<a.length;j++)
    		{
    			if(a[j]<a[index])index=j;
    		}
    		if(index!=i)
    		{
    			int temp=a[i];
    			a[i]=a[index];
    			a[index]=temp;
    		}
    	}
    }
}
