/* 

Paramid pattern-9

*/


import java.util.*;

class Para9
{
	public static void main(String[] args)
	{
		int i,j ;
		for(i = 1; i<=6; i++)
		{
			for(j = 6; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}