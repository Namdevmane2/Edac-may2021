/* 

Paramid pattern-3

*/


import java.util.*;

class Para3
{
	public static void main(String[] args)
	{
		int i,j ;
	
		for(i = 1; i<=9; i++)
		{
			for(j = 8; j>=i; j--)
			{
				System.out.print(" ");		// for printing Spaces
			}
			
			for(int k = 1; k<=i; k++)
			{
				System.out.print("* ");	// For printing Star
			}
			System.out.println();
		}
	}
}