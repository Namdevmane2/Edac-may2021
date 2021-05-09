/*

6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

*/



import java.util.*;
class Assign6
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number :");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int add = i + j ;
		int mul = i * j ;
		int sub = i - j ;
		int div = i / j ;
		int mod = i % j ;

		
		System.out.println("Addition: "+add);
		System.out.println("Multiplication: "+mul);
		System.out.println("Subtract: "+sub);
		System.out.println("Divisuon: "+div);
		System.out.println("Modules: "+mod);

	}
}