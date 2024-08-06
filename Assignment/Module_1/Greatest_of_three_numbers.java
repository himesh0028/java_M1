package com.basic;
/*
 • Write a Java program to Take three numbers from the user
and print the greatest number.
 */

public class Greatest_of_three_numbers 
{
	public static void main(String[] args) 
	{
		int a=3,b=8,c=9;
		if(a>b && a>c) 
		{
			System.out.println("a is maximum");
		}else if(b>a && b>c) 
		{
			System.out.println("b is maximum");
		}else 
		{
			System.out.println("c is maximum");
		}
	}

}
