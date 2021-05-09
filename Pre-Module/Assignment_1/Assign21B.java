/*
21. Write a Java program to convert a decimal number to octal number.

*/

import java.util.*;
import java.lang.*;
class Assign21B
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num ;
		System.out.println("Enter decimal number :");
		num = sc.nextInt();
		int rem;
		String str = "";
		char digit[] = {'0','1','2','3','4','5','6','7'};
		
		while(num > 0)
		{
			rem = num % 8;
			str = digit[rem] + str ;
			num = num / 8 ;
			
		}
		
		System.out.println("dec to octal :"+str);
	}
}