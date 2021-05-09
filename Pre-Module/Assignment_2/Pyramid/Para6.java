/* 

Paramid pattern-6

*/


import java.util.*;

class Para6
{
	public static void main(String[] args)
	{
		int i,j ;
		char ch = '*';
		for(i = 9; i>=1; i--)
		{
			
			for(j = 8; j>=i; j--)
			{
				System.out.print(" ");		// for printing Spaces
			}
			
			for(int k = 1; k<=i; k++)
			{
				System.out.print(ch+" ");	// For printing Star
				
			}
			
			
			
			System.out.println();
		}
	}
}