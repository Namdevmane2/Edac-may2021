/*
5. Write a Java program that takes two numbers as input and display the product of two numbers.

*/

import java.util.*;

class Assign5 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("input first number ");
		int num1 = sc.nextInt();
		
		System.out.println("input second number ");
		int num2 = sc.nextInt();
		
		int prod = num1 * num2 ;
		
		System.out.println(num1+ "x" +num2+ "=" +prod);
	}
}
