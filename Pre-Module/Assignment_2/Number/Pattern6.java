/*
PATTERN-6

        *
      * *
    * * * 
  * * * *
* * * * *

*/

import java.util.*;

class Pattern6
{
	public static void main(String[] args)
	{
		int i,j ;
		for(i = 1; i<=5; i++)
		{
			for(j = 4; j>=i; j--)
			{
				System.out.print(" ");		// for printing Spaces
			}
			
			for(int k = 1; k<=i; k++)
			{
				System.out.print("*");		// For printing Star
			}
			
			System.out.println();
		}
	}
}