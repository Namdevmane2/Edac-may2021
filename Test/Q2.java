/*
-2. WAP to accept number from user(Scanner class) print table of it
	5*1=5
	5*2=10
	5*3=15
	5*4=20
..
*/
import java.util.*;

class Q2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = input.nextInt();
		
		for(int i=1 ; i<=10 ; i++)
		{
			int res = num * i ;
			System.out.println(num+"*"+i+"="+res);
		}
		
	}
}