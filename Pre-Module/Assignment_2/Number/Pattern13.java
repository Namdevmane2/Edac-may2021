/*
PATTERN-13
  
     A
    B B	 
   C C C
  D D D D 
 E E E E E
 
 */

import java.util.*;

class Pattern13
{
	public static void main(String[] args)
	{
		int i,j ;
		char ch ='A';
		for(i = 1; i<=5; i++)
		{
			
			for(j = 4; j>=i; j--)
			{
				System.out.print(" ");		// for printing Spaces
			}
			
			for(int k = 1; k<=i; k++)
			{
				System.out.print(ch+" ");	// For printing Star
				
			}
			ch++;
			
			System.out.println();
		}
	}
}