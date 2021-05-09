/*
PATTERN-18

A B C D E 
A B C D
A B C
A B
A
*/

import java.util.*;

class Pattern18
{
	public static void main(String[] args)
	{
		int i,j ;
	
		for(i = 1; i<=5; i++)
		{
			char ch = 'A' ;	
			for(j = 5; j>=i; j--)
			{
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
		}
	}
}