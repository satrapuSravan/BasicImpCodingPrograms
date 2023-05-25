package com.Array.Sorting;

public class QuickSort 
{
	public static void main(String[] args) 
	{
		  int[] a=  {2,1,8,4,3,5,9};
	       sort(a,0,a.length-1);
	       for(int v:a)
	       {
	    	   System.out.print(v+" ");
	       }
	}
    public static void sort(int[] a,int start,int end)
    {
    	if(start>=end)return;
    	int i=start,j=end;
    	int pivot=a[(start+end)/2];
    	while(i<=j)
    	{
    		while(a[i]<pivot)i++;
    		while(a[j]>pivot)j--;
    		while(i<=j)
    		{
    			int temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    			i++;
    			j--;
    		}
    	}
    	sort(a,start,j);
    	sort(a,i,end);
    }
}
