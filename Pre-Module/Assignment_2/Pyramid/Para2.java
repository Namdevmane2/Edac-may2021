/* 

Paramid pattern-2

*/

import java.util.*;

class Para2
{
	public static void main(String[] args)
	{
		int i,j ;
	
		for(i = 1; i<=9; i++)
		{
			int ch =1;
			for(j = 8; j>=i; j--)
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