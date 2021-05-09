/*
4.WAP to check whether a number given is even or odd

*/
import java.util.*;

class Q4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter  Number: ");
		int num1 = input.nextInt();
		if(num1%2==0)
		{
			System.out.println("number is even :"+num1);
		}
		else
		{
			System.out.println("number is Odd :"+num1);
		}
	}
}