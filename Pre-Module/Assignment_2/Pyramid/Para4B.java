/* 

Paramid pattern-4

*/

public class Para4B
{  
public static void main(String args[])   
{   
int n = 9; // you can take input from prompt or change the value

 for (int i = 1; i <= n; i++) 
        { 
          for (int j = n; j > i; j--)
	{
	  System.out.print("  ");
	}
	 for (int k = 1; k <= i; k++) 
             { 
                  System.out.print(k + " "); 
                     } 
                        for (int l = i - 1; l >= 1; l--)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
}   
}  

//                1
//              1 2 1
//            1 2 3 2 1
//          1 2 3 4 3 2 1
//        1 2 3 4 5 4 3 2 1
//      1 2 3 4 5 6 5 4 3 2 1
//    1 2 3 4 5 6 7 6 5 4 3 2 1
//  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
//1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1