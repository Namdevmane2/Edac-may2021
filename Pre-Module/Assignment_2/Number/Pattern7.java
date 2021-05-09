/*
PATTERN-7

      1 
	 1 2 
	1 2 3 
   1 2 3 4 
  1 2 3 4 5 
  
  */

import java.util.*;

class Pattern7
{
	public static void main(String[] args)
	{
		int i,j ;
		
		for(i = 1; i<=5; i++)
		{
			int ch =1;
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