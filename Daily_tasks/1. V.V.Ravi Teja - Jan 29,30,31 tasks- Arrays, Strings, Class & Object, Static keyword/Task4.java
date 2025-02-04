package org.anurag;
public class Task4 {
public static void main(String args[])
{
	int intArray[]= {1,2,3};
	int cloneArray[]=intArray.clone();
	System.out.println(intArray==cloneArray);
	System.out.println(intArray!=cloneArray);
}
}
