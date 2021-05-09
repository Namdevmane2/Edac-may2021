/*
PATTERN-5

A 
B B 
C C C 
D D D D 
E E E E E 

*/


import java.util.*;

class Pattern5
{
	public static void main(String[] args)
	{
		int i,j,k;
		char ch = 'A';
		for(i =1 ; i<=5  ; i++)
		{
			for(j=1 ; j<=i ; j++)
			{
				System.out.print(ch+" ");
				
			}
			ch++;

			
			System.out.println();
		}
	}
}