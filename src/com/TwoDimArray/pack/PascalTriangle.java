package com.TwoDimArray.pack;

public class PascalTriangle 
{
	public static void main(String[] args)
	{
        int[][] a=pascal(5);
        int space=5-1;
        for(int[] t:a)
        {
        	for(int i=0;i<space;i++)
        	{
        		System.out.print(" ");
        	}
        	for(int n:t)
        	{
        		System.out.print(n+" ");
        	}
        	System.out.println();
        	space--;
        }
	}
    public static int[][] pascal(int size)
    {
    	int[][] a= new int[size][];
    	for(int i=0;i<a.length;i++)
    	{
    		a[i]=new int[i+1];
    		for(int j=0;j<a[i].length;j++)
    		{
    			if(i==j||j==0)a[i][j]=1;
    			else a[i][j]=a[i-1][j-1]+a[i-1][j];
    		}
    	}
    	return a;
    }
}
