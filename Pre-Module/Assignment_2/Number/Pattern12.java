/*
PATTERN-12

     1
	2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5

*/ 
  



import java.util.*;

class Pattern12
{
	public static void main(String[] args)
	{
		int i,j ;
		int ch =1;
		for(i = 1; i<=5; i++)
		{
			
			for(j = 4; j>=i; j--)
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