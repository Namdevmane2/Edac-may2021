/*

1. WAP to accept 2 numbers from Command line argument and perform its addition and display.

*/
import java.lang.*;
public class Q1
{
  public static void main(String args[ ])
  {
     String a1=args[0];
	 String a2=args[1];
  
   
	 int i=Integer.parseInt(a1);
	 int j=Integer.parseInt(a2);
	 int k=i+j;
	 
	 System.out.println("first Number" +i);
	 System.out.println("Second Number" +j);
	 System.out.println("addition of k is"+k);
  
  }

}