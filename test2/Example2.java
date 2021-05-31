import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		
		
		// Null pointer Exception  
		 String str=null;
		 try
		 {
		 System.out.print(str.length());
		 }catch(NullPointerException e)
		 {
			 System.err.print("NullPointerException:: Enter the correct value");
			 System.out.println();
		 }
		 
		 // Number Formate Exception 
		 try
		 {
		 int num = Integer.parseInt(null); 
		 }catch(NumberFormatException e)
		 {
			 System.err.println("NumberFormatException: : enter the correct number formate");
			 System.out.println();
		 }
		 
		 //Arithmatic Exceptions
		 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.print("enter the first number :");
		 int num1=sc.nextInt();	
		 System.out.print("enter the Second number :");
		 int num2=sc.nextInt();
		 try
		 {
		 int c=num1/num2;
		 System.out.print("value :"+c); 
		 }catch(ArithmeticException e)
		 {
			 System.out.println();
		 System.err.print("ArithmeticException::plz enter the correct value:");
		 System.out.println();
		 }
		 
		 int arr[]= {2,3,4,5,6,7};
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 try
		 {
		 System.out.println("index value :"+arr[7]);
		 }catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.err.print("ArrayIndexOutOfBoundsException: ");
		 }
		
		

	}

}
