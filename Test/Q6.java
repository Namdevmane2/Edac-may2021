/*
6.WAP to illustrate condition operator to find maximum among 2or 3 numbers
*/
import java.util.*;

class Q6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter  Number: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		if(num1>num2)
		{
			System.out.println(num1+" is maximum than "+num2);
		}
		else
		{
			System.out.println(num2+" is maximum than "+num1);
			
		}
	}
}