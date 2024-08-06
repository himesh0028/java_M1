package com.basic;

import java.util.Scanner;

/*
 * • Write a program in Java to input 5 numbers from keyboard
and find their sumand average using for loop.
 */

public class Sum_and_Average 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int count=5;
		
		System.out.println("Enetr 5 Numbers : ");
		
		for(int i=0;i<count;i++) 
		{
			System.out.println("Enter number"+(i+1)+":");
			int num=sc.nextInt();
			sum=sum+num;
		}
		
		float Average = sum/count;
		
		System.out.println("Sum of 5 number is "+sum);
		System.out.println("Average of 5 Number is "+Average);
	
		sc.close();
	}
}
