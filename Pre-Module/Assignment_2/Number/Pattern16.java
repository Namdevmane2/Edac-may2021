/*
PATTERN-16

5
5 4
5 4 3
5 4 3 2
5 4 3 2 16

*/

import java.util.*;

class Pattern16
{
	public static void main(String[] args)
	{
		int i,j ;
		
		for(i = 1; i<=5; i++)
		{
			int ch = 5 ;
			for(j = 1; j<=i; j++)
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
}