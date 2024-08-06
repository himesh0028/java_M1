package com.basic;

import java.util.Scanner;

/*
 * Write a Java program that takes a year from user and print
whether that yearis a leap year or not. B19. Write a program
in Java to display the first 10 natural numbers using while
loop.
 */
public class Leap_year_or_natural_number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a year : ");
		
		int year=sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
		{
			System.out.println(year +"is a leap year");
		}else {
			System.out.println(year +"is not a leap year");
		}
		
		System.out.println("Question 2nd part starts here.................");
		System.out.println("Firat 10 natural numbers are : ");
		
		int i=0;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		sc.close();
	}
	
}

