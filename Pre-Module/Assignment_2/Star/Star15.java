/*
PATTERN-15

*
**
* *
*  *
*****

*/
class Star15
{ 
      
    public static void main(String args[]) 
    { 
		int i, j ;
		for(i = 1 ; i<=5; i++)
		{
			for(j= 1; j<=i; j++)
			{
				if((i ==3 && j==2) || (i==4 && j==2) || (i==4 && j==3) )
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}			
			}
				System.out.println();
		}  
    }   
} 

/*

*
**
*-*
*--*
*****

*/

  
