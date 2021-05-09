/*
PATTERN-15

5 4 3 2 1 
5 4 3 2
5 4 3
5 4 
1

*/

import java.util.*;

class Pattern15
{
	public static void main(String[] args)
	{
		int i,j ;
		
		for(i = 1; i<=5; i++)
		{
			int ch = 5 ;
			for(j = 5; j>=i; j--)
			{
				System.out.print(ch+" ");
				ch--;
			}
			
			System.out.println();
		}
	}
}