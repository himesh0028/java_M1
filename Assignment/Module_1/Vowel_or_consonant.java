package com.basic;

import java.util.Scanner;

/*
 * Write a Java program that takes the user to provide a single
character from the alphabet. Print Vowel or Consonant,
depending on the user input. If the user input is not a letter
(between a & z or A and Z), or is a string of length
> 1, print an error message.

 */
public class Vowel_or_consonant 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a single character from the alphabet:");
		
		 String input = sc.nextLine();
		 
		
		if(input.length()!=1) 
		{
			System.out.println("Enter a single character");
		}
		
		char ch = input.charAt(0);
		
		 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
             System.out.println("Entered Character is vowel");
         } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        	 System.out.println("Entered Character is vowel");
         }else {
        	 System.out.println("Entered Character is not a vowel");
         }
		 sc.close();	
	}
}
