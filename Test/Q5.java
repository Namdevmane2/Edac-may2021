/*

5.WAP to accept an array and display it in reverse form.

*/

import java.util.*;
import java.lang.*;

class Q5
{
	public static void main(String[] args)
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array element");
		int num1[] = new int[5];
		for(i=0 ; i<num1.length ; i++)
		{
			num1[i]=sc.nextInt();
		}

		for(i=num1.length-1; i>=0;i--)
		{
			System.out.print(num1[i]+" ");
		}
		System.out.println(" ");	
	}
}

