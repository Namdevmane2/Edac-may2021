/*
2. Write a Java program to print the sum of two numbers.

*/

import java.util.*;
class Assign02
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number :");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int add = i + j ;
		
		System.out.println("addition"+add);
	}
}