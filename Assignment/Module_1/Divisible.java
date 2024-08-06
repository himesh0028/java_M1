package com.basic;
/*
 * • Write a Java program to print numbers between 1 to 100
which are divisibleby 3, 5 and by both.
 */

public class Divisible 
{
	public static void main(String[] args) 
	{
		int i;
		
		for(i=1;i<=100;i++) 
		{
			if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number divisible by both 3 and 5: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Number divisible by 3: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Number divisible by 5: " + i);
            }
		}
	}
}
