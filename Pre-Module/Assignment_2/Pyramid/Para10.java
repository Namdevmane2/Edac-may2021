/* 

Paramid pattern-10

*/


class Para10
{ 
      
    public static void main(String args[]) 
    { 
		int i, j ;
		for(i = 1 ; i<=6; i++)
		{
			for(j= 1; j<=6; j++)
			{
				if(	(i==2 && j==2) || (i==2 && j==3) || (i==2 && j==4) || (i==2 && j==6) || 
					(i==3 && j==2) || (i==3 && j==3) || (i==3 && j==5) || (i==3 && j==6) || 
					(i==4 && j==2) || (i==4 && j==4) || (i==4 && j==5) || (i==4 && j==6) || 
					(i==5 && j==3) || (i==5 && j==4) || (i==5 && j==5) || (i==5 && j==6) || 
					(i==6 && j==2) || (i==6 && j==3) || (i==6 && j==4) || (i==6 && j==5) || (i==6 && j==6))
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

******
*---*-
*--*--
*-*---
**----
*-----



					(i==2 && j==2) || (i==2 && j==3) || (i==2 && j==4) || (i==2 && j==6) || 
					(i==3 && j==2) || (i==3 && j==3) || (i==3 && j==5) || (i==3 && j==6) || 
					(i==4 && j==2) || (i==4 && j==4) || (i==4 && j==5) || (i==4 && j==6) || 
					(i==5 && j==3) || (i==5 && j==4) || (i==5 && j==5) || (i==5 && j==6) || 
					(i==6 && j==2) || (i==6 && j==3) || (i==6 && j==4) || (i==6 && j==5) || (i==6 && j==6)

*/