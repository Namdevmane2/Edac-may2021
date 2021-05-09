import java.util.*;

class Assign_22
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Binary Number");
		int num = sc.nextInt();
		int i=0;
		int decimal = 0;
		
		while(num > 0)
		{
			int rem = num % 10 ;
			decimal = (int)(decimal + rem * Math.pow(2,i));
			num = num/10 ;
			i++;	
		}
		System.out.print("Decimal Number "+decimal);

		
	}
}