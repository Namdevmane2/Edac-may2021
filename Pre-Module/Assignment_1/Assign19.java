/*
19. Write a Java program to convert a decimal number to binary number.

*/
import java.util.*;

class Assign19
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);  // User input
		System.out.println("Enter decimal number");
		int n1 = sc.nextInt();                               // next method read data from console and return data in the form of string.
		
		//conversion method
		String binarystr = Integer.toBinaryString(n1);
		
		//display
		System.out.println("Binary value is: " +binarystr);
	}
}
   