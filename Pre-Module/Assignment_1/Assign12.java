/*
12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
*/

import java.util.*;

class Assign12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter three Number ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3 ;
		
		int avg = (num1 + num2 + num3)/3 ;

		
		System.out.println("addition is : "+sum);
		
		System.out.println("average is : "+avg);

	}
}