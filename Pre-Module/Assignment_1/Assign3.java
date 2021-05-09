/*
3. Write a Java program to divide two numbers and print on the screen.

*/

import java.util.*;
class Assign3
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number for case A:");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int div = i / j ;
		
		System.out.println("Output: "+div);
	}
}