/*
PATTERN-10

      E 
	 D E 
	C D E 
   B C D E
  A B C D E 
  
 */

public class Pattern10
{  
public static void main(String args[])   
{   
int n = 5; // you can take input from prompt or change the value
int alphabet = 65;
 for (int i = n; i >= 1; i--)
		{
		for (int j = 1; j <= i; j++)
			{
			System.out.print(" ");
			}
			for (int j = i; j <= 5; j++)
			{
		        System.out.print((char) (alphabet + j - 1) + " ");
			}
			System.out.println();
		}
}   
}  

//     E
//    D E
//   C D E
//  B C D E
// A B C D E