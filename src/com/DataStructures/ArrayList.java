package com.DataStructures;

public class ArrayList<E>
{
  Object[] a=new Object[5];
  int count=0;
  
  public void add(E ele)
  {
	  if(count>=a.length)
	  {
		  inc();
	  }
	  a[count++]=ele;
  }
  public int size()
  {
	  return count;
  }
  public void inc()
  {
	  Object[] temp=new Object[a.length+3];
	  for(int i=0;i<size();i++)
	  {
		  temp[i]=a[i];
	  }
	  a=temp;
  }
  public E get(int index)
  {
	  if(index<0||index>=size())
	  {
		  throw new IndexOutOfBoundsException();
	  }
	  return (E)a[index];
  }
 public void add(int index,E ele)
 {
	 if(index<0||index>=size())
	 {
		 throw new IndexOutOfBoundsException();
	 }
	 if(count>=a.length)inc();
	 for(int i=size()-1;i>=index;i--)
	 {
		 a[i+1]=a[i];
	 }
	 a[index]=ele;
	 count++;
 }
 public void remove(int index)
 {
	 if(index<0||index>=size())
	 {
		 throw new IndexOutOfBoundsException();
	 }
	 for(int i=index+1;i<size();i++)
	 {
		 a[i-1]=a[i];
	 }
	 count--;
	 a[count]=null;
 }
 public void clear()
 {
	 a=new Object[5];
	 count=0;
 }
 
}
