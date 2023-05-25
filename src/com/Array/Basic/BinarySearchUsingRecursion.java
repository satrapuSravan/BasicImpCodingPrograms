package com.Array.Basic;

public class BinarySearchUsingRecursion
{
	public static void main(String[] args) 
	{
		int[] a= {1,3,5,7,9,11};
	    int ele=1;
	      System.out.println(bSearch(a,ele,0,a.length-1));
	}
	static int bSearch(int[]a ,int ele,int first,int last)
	{
		if(first>last)return -1;
		
		int mid=(first+last)/2;
		if(ele==a[mid]) return mid;
		else if(ele<a[mid])return bSearch(a,ele,first,mid-1);
		else return bSearch(a,ele,mid+1,last);
			
	    }
}
