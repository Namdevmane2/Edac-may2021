/*
PATTERN-2

A 
A B 
A B C 
A B C D 
A B C D E 

*/


import java.util.*;

class Pattern2
{
	public static void main(String[] args)
	{
		int i,j,k;
	 
		for(i =1 ; i<=5  ; i++)
		{
			char ch = 'A';
			for(j=1 ; j<=i ; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
		}
	}
}