/*
24. Write a Java program to convert a binary number to a Octal number.
*/

import java.util.*;

class Assign24
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Binary Number: ");
		int num = sc.nextInt();
		int i=0;
		int decimal = 0;
		
		while(num > 0)
		{
			int rem = num % 10 ;
			decimal = (int)(decimal + rem * Math.pow(2,i));
			num = num/10 ;
			i++;	
		}
	
		String octal = "";
		while(decimal > 0)
		{
			int r=decimal %8;
			decimal = decimal /8 ;
			octal = r + octal ;
			System.out.println("The Octal number is :"+octal);
		}
		
	}
}