/*
PATTERN-5

    *
   ***
  *****
 *******
*********

*/
import java.util.*;

class Star5
{
	public static void main(String[] args)
	{
		int i,j,k ;
		for(i = 1; i<=5; i++)
		{
			for(j = 4 ; j>=i ; j--)  // 4>=1;3>=2;2>=1;1>=1,
			{
				System.out.print(" ");		// for printing Spaces
			}
			for(k = 1 ; k<=i ; k++)  // 1<=1; 2=2
			{
				System.out.print("*");		// for printing Star
			}
			for(k = 2 ; k<=i ; k++)  
			{
				System.out.print("*");		// for printing Star
			}
			System.out.println();
		}
	}
}