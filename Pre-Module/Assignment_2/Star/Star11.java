/*
PATTERN-11
*****
 *****
  *****
   *****
    ******
	
*/

class Star11
{
	public static void main(String[] args)
	{
		int i,j,k ;
		for(i = 1; i<=5; i++)
		{
			for(j = 2 ; j<=i ; j++)  // 2>=1
			{
				System.out.print(" ");		// for printing Spaces
			}
			
			
			for(k = 1 ; k<= 5; k++)
			{
				System.out.print("*");		// for printing Star
			}
			System.out.println();
		}
	}
}