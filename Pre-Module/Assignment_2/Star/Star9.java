/*
PATTERN-9
     *
	**
   ***
  ****
 *****
  ****
   *** 
    **
	 *
	 
*/
import java.util.*;

class Star9
{
	public static void main(String[] args)
	{
		int i,j,k;
		for(i = 1; i<=5; i++)
		{
			for(j = 4; j>=i; j--)
			{
				System.out.print(" ");		// for printing Spaces
			}
			for( k = 1; k<=i; k++)
			{
				System.out.print("*");		// For printing Star
			}
			System.out.println();
		}
		for(i = 1; i<=5; i++)
		{
			
			for(j = 2 ; j<=i ; j++)  // 2>=1
			{
				System.out.print(" ");		// for printing Spaces
			}
			for(k = 5 ; k>=i ; k--)
			{
				System.out.print("*");		// for printing Star
			}
			System.out.println();
		}
	}
}