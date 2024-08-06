package com.basic;

import java.util.Scanner;

/*
 * • Write a Java program to count the letters, spaces, numbers
and other characters of an input string.
 */

public class Special_Characters_usig_string 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input String");
		
		String input = sc.nextLine();
		
		int character=0 , spaces=0 , special=0 , numbers=0;
		
		for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                character++;
            } else if (Character.isDigit(c)) {
                numbers++;
            } else if (Character.isWhitespace(c)) {
                spaces++;
            } else {
               special++;
            }
        }
		System.out.println("Character"+character);
		System.out.println("Number"+numbers);
		System.out.println("Spaces"+spaces);
		System.out.println("Specials"+special);
		
		sc.close();
	}
}
