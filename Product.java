/*
Accept 2 array from user and display its product in third array

*/


import java.util.*;
import java.lang.*;

class Product
{
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		int i,j;
		
		int mat1[][] = new int[3][3];  //mat1[i][j]
		int mat2[][] = new int[3][3];	 // mat2[i][j]
		int sum[][]  = new int[3][3];
		
		System.out.println("Enter first Matrix: ");

		for(i=0;i<mat1.length;i++)		//row
		{
			for(j=0;j<mat1[i].length;j++)		//column
			{
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("print first Matrix: ");

		for(i=0;i<mat1.length;i++)		//row
		{
			for(j=0;j<mat1[i].length;j++)		//column
			{
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter second Matrix: ");

		for(i=0;i<mat2.length;i++)		//row
		{
			for(j=0;j<mat2[i].length;j++)		//column
			{
				mat2[i][j] = sc.nextInt();
			}
		}
		System.out.println("print second Matrix: ");

		for(i=0;i<mat2.length;i++)		//row
		{
			for(j=0;j<mat2[i].length;j++)		//column
			{
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
		
		for(i=0;i<sum.length;i++)		
		{
			for(j=0;j<sum[i].length;j++)		
			{
				sum[i][j] = mat1[i][j] * mat2[i][j];
			}
	
		}
		System.out.println("print second Matrix: ");

		for(i=0;i<sum.length;i++)		//row
		{
			for(j=0;j<sum[i].length;j++)		//column
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}