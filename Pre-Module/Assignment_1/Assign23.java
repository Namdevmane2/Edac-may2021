/*
23. Write a Java program to convert a binary number to hexadecimal number.

*/

import java.util.*;

class Assign23
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("input a binary number");
		int n = sc.nextInt();
		
		int rem = 0;
		int d = 0, c = 0;
		while(n!=0)
		{
			rem = n%10;
			n/=10;
			d=d+rem*(int)Math.pow(2,c++);
		}
		int r;
		String hn="";
		char h[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(d>0)
		{
			r=d%16;
			hn = h[r] +hn ;
			d =d/16 ;
		}
		System.out.print("Hexadecimal number is: "+hn);
	}
}