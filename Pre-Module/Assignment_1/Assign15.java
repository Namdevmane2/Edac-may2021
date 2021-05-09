/*
15. Write a Java program to swap two variables.
*/

import java.util.*;
class Assign15
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number :");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.println("Before Swap "+i+" "+j);
		int temp = 0 ;
		temp = i ;
		i = j ;
		j = temp ;
		
		System.out.println("After Swap "+i+ " "+j);

		
	}
}