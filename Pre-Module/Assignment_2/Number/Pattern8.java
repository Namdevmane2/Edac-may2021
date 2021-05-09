/*

PATTERN-8

      5 
	 4 5 
	3 4 5 
   2 3 4 5 
  1 2 3 4 5 
  
  */
import java.util.*;

class Pattern8
{
	public static void main(String[] args)
	{
		int i,j ;
		
		for(i = 5; i>=1; i--)
		{
			for(j = 2; j<=i; j++)
			{
				System.out.print(" ");		// for printing Spaces
			}
			for(int k = i; k<=5; k++)
			{
				System.out.print(k+" ");	// For printing Star
			}
			System.out.println();
		}
	}
}