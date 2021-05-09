/*
PATTERN-17

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/



import java.util.*;

class Pattern17
{
	public static void main(String[] args)
	{
		int i,j ;
		int ch = 1 ;
		for(i = 1; i<=5; i++)
		{
			for(j = 1; j<=i; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
		}
	}
}