/*
PATTERN-6

*********
 *******
  *****
   *** 
    *
	
*/
import java.util.*;

class Star6
{
	public static void main(String[] args)
	{
		int i,j,k ;
		for(i = 1; i<=5; i++)
		{
			for(j = 2 ; j<=i ; j++)  // 
			{
				System.out.print(" ");		// for printing Spaces
			}
			for(k = 5 ; k>=i ; k--)  // 
			{
				System.out.print("*");		// for printing Star
			}
			for(k = 4 ; k>=i ; k--)  // 
			{
				System.out.print("*");		// for printing Star
			}
			
			System.out.println();
		}
	}
}

/*

    ***** ****
	 **** ***
	  *** **
	   ** *
	    *






*/