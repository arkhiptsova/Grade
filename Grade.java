package FeetNumber;

import java.util.Scanner;

/*
Mila Arkhiptcova
This program that prompts the user to enter a letter grade A, B, C, D, or F 
and displays its corresponding numeric value 4, 3, 2, 1, or 0.  
For other input, display invalid grade. 
09/11/2019
Bellevue University
grade.java
*/
public class Grade {

	public static void main(String args[]) { 
	
		Scanner input = new Scanner (System.in)	;
		System.out.println("Enter a letter grade");
		String grade = input.next();
		char a = grade.charAt(0);
		a = Character.toUpperCase(a);
		if (a == 'A' || a == 'B'|| a == 'F' || a == 'C')
		{
			switch(a)
			{
				case 'A': System.out.println("The numeric value for grade A is 4"); break;
				case 'B': System.out.println("The numeric value for grade B is 3"); break;
				case 'C': System.out.println("The numeric value for grade C is 2"); break;
				case 'F': System.out.println("The numeric value for grade F is 1"); break;

			}
		}
		else
			System.out.println(a + " is an invalid grade");
}
}