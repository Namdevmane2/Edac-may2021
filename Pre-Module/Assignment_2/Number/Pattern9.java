/*

     A 
	A B
   A B C 
  A B C D 
 A B C D E 
 
 */

import java.util.*;

class Pattern9
{
	public static void main(String[] args)
	{
		int i,j ;
		
		for(i = 1; i<=5; i++)
		{
			char ch ='A';
			for(j = 4; j>=i; j--)
			{
				System.out.print(" ");		// for printing Spaces
			}
			
			for(int k = 1; k<=i; k++)
			{
				System.out.print(ch+" ");	// For printing Star
				ch++;
			}
			
			System.out.println();
		}
	}
}