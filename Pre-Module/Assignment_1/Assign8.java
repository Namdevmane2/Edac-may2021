/*
8. Write a Java program to display the following pattern.

*/

import java.util.*;

class Assign8
{
	public static void main(String[] args)
	{
		int i,j ;
		for(i=1 ; i<=4; i++)
		{
			for(j=1; j<=22 ; j++)
			{
				if(	(i==1)&&(j==4) ||(i==2)&&(j==4) ||(i==3)&&(j==1) ||(i==3)&&(j==4) ||(i==4)&&(j==3) ||(i==4)&&(j==2) )
					{
						System.out.print("J");
					}
				else if( (i==1)&&(j==9) ||(i==2)&&(j==8) ||(i==2)&&(j==10) ||(i==3)&&(j==7) ||(i==3)&&(j==8) ||(i==3)&&(j==9) ||
					(i==3)&&(j==10) ||(i==3)&&(j==11) ||(i==4)&&(j==6) ||(i==4)&&(j==12) )
					{
						System.out.print("A");
					}
					
				else if((i==1)&&(j==11) ||(i==1)&&(j==17) ||(i==2)&&(j==12) ||(i==2)&&(j==16) ||(i==3)&&(j==13) ||(i==3)&&(j==15) ||
					(i==4)&&(j==14)	)
					{
						System.out.print("V");
					}
					
				else if( (i==1)&&(j==19) ||(i==2)&&(j==18) ||(i==2)&&(j==20) ||(i==3)&&(j==17) ||(i==3)&&(j==18) ||(i==3)&&(j==19) ||
					(i==3)&&(j==20) ||(i==3)&&(j==21) ||(i==4)&&(j==16) ||(i==4)&&(j==22) )
					{
						System.out.print("A");
					}	 
				else
					{
						System.out.print(" ");
					}
			}
			System.out.println();
		}
		
	}
}


/*

1234567891234567891234567
-------------------------6
---j----a---v-----v--a---
---j---a-a---v---v--a-a--
j--j--aaaaa---v-v--aaaaa-
-jj--a-----a---v--a-----a
------------------------- 25



*/