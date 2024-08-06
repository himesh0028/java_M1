package com.basic;

import java.util.Scanner;

public class Count_number_of_digits_in_number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Number Less Than 10 billion");
		long number = sc.nextLong();
		
		if(number<1) 
		{
			System.out.println("Enter A Positive Number");
		}else if(number>=10000000000L) 
		{
			System.out.println("Entered Number Is Greater Than Or Equal To 10 Billion");
		}else 
		{
			 int digits = countDigits(number);
	         System.out.println("Number of digits in the number: " + digits);
		}
		sc.close();
	}

	private static int countDigits(long number)
	{
		int count=0;
		while(number!=0) 
		{
			number=number/10;
			count++;
			
		}
		return count;
	}
}
