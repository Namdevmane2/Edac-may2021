/*
4. Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3

*/

import java.util.*;
class Assign4
{
	
	public static void main(String args[])
	{

		int result1 = -5 + 8 * 6 ;
		System.out.println("Output: "+result1);
		
		int result2 = (55 + 9) % 9 ;
		System.out.println("Output: "+result2);

		
		int result3 = 20 + -3 * 5 / 8 ;
		System.out.println("Output: "+result3);

		
		int result4 = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println("Output: "+result4);

		


	}
}