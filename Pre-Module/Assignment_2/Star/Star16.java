/*
PATTERN-16

     *
	**
   * *
  *	 *
 *****
 
*/
class Star16
{ 
      
    public static void main(String args[]) 
    { 
		int i, j ;
		for(i = 1 ; i<=5; i++)
		{
			for(j= 1; j<=5; j++)
			{
				if((i ==1 && j==1) || (i==1 && j==2) || (i==1 && j==3) ||(i==1 && j==4)
					|| (i==2 && j==1) || (i==2 && j==2) || (i==2 && j==3) 
				    || (i==3 && j==1)||(i==3 && j==2)||(i==3 && j==4)
					|| (i==4 && j==1)||(i==4 && j==3)|| (i==4 && j==4) )
					{
						System.out.print(" ");
					}
				else
					{
					System.out.print("*");
					}	
				
			}
			System.out.println();
		}  
    }   
} 

/*

----*
---**
--*-* 
-*--*
*****


int i, j ;
		for(i = 1 ; i<=5; i++)
		{
			for(j= 1; j<=i; j++)
			{
				if((i ==1 && j==1) || (i==1 && j==2) || (i==1 && j==3) ||(i==1 && j==4)
					|| (i==2 && j==1) || (i==2 && j==2) || (i==2 && j==3) 
				    || (i==3 && j==1)||(i==3 && j==2)||(i==3 && j==4)
					|| (i==4 && j==1)||(i==4 && j==3)|| (i==4 && j==4) )
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

*/