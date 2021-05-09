/*
3.WAP to swap 2 numbers and display it before swap and after swap.

*/

import java.util.*;

class Q3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Two Number");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println("before swap :"+num1+" "+num2);
		int temp;
		temp = num1 ;
		num1 = num2 ;
		num2 = temp ;
		System.out.println("After swap :"+num1+" "+num2);
		
	}
}