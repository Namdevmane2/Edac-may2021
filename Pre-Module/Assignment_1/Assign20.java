/*
20. Write a Java program to convert a decimal number to hexadecimal number.
*/

import java.util.*;

class Assign20
{
	public static void main(String args[])
	{
		int  i, j = 0 ;
		char hexa[] = new char[100];
			System.out.println("Enter decimal number");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			int temp = num ;
			
			while(temp !=0)
			{
				int rem = temp % 16 ;
				if(rem<10)
				{
					hexa[j++] = (char)(48+rem); // 0 to 9
				}
				else
				{
					hexa[j++] = (char)(55+rem); // 10 to 15 
				}
				
				temp = temp / 16 ;
				
			}
			
			System.out.print("Hexadecimal Value of "+num+"= ");
			
				for(i = j-1 ; i>=0 ;i--)
				{
					System.out.print(hexa[i]);  // for reverse printing 
				}
	}
}
   