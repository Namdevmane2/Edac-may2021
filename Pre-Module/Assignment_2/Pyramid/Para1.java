/* 

Paramid pattern-1

*/

import java.util.*;

class Para1
{
	public static void main(String[] args)
	{
		int i,j ;
		int ch =1;
		for(i = 1; i<=9; i++)
		{
			
			for(j = 8; j>=i; j--)
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