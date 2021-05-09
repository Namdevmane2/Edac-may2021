/*

7.WAP to illustrate example of typecasting 

*/

class Q7
{
	public static void main(String args[])
	{
		float num2 = 20.4f;
		double num3 = num2 ; //widening
		long num4 = 40643434 ; 
		int num1 = (int)num4; // narrowing
		
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num1);
	}
	
}

