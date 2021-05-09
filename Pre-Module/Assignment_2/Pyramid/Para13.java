/* 

Paramid pattern-13

*/


class Para13
{ 
      
    public static void main(String args[]) 
    { 
        int n = 6; 
        printPattern(n); 
    } 
  
    static void printPattern(int n) 
    { 
        int i, j, k = 0; 
        for (i = 1; i <= n; i++) // row=6 
        { 
          
            for (j = i; j < n; j++)      // Print spaces
	     { 
                System.out.print(" "); 
            } 
            
          
            while (k != (2 * i - 1))     // Print *
                { 
                if (k == 0 || k == 2 * i - 2) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
                k++; 
                
            } 
            k = 0; 
              
           
            System.out.println();     // print next row 
        } 
   
        for (i = 0; i < 2 * n - 1; i++)         // print last row 
		{ 
            System.out.print("*"); 
        } 
    } 
} 
  
