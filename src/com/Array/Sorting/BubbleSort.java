package com.Array.Sorting;
import com.Array.Basic.BinarySearch;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
       int[] a= {2,1,8,4,3,5,9};
       sort(a);
       for(int m:a)
       {
    	   System.out.print(m+" ");
       }
      /* System.out.println();
       int index=BinarySearch.bSearch(a,5);
       System.out.println("index value is : "+index);*/
	}
    public static void sort(int[] a)
    {
    	for(int i=0;i<a.length-1;i++)
    	{
    		for(int j=0;j<a.length-1;j++)
    		{
    			if(a[j]>a[j+1])
    			{
    				int temp=a[j];
    				a[j]=a[j+1];
    				a[j+1]=temp;
    			}
    		}
    	}
    }
}
