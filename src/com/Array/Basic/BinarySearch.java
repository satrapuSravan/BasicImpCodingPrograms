package com.Array.Basic;

public class BinarySearch
{
	public static void main(String[] args) 
	{
      int[] a= {1,3,5,7,9,11};
      int ele=3;
      System.out.println(bSearch(a,ele));
	}
	public static int bSearch(int[] a,int ele)
	{
		int first=0,last=a.length-1;
		
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(ele==a[mid])return mid;
			else if(ele<a[mid])last=mid-1;
			else first=mid+1;
		}
		return -1;
	}

}
