/*
18. Write a Java program to multiply two binary numbers.

*/

class Assign18B
{
public static void main(String args[])
{
    int num = 01;   
	int num2=111;
    int dec_value = 0;
	int dec2=0;	

    // Initializing base value to 1, i.e 2^0

    int base1 = 1;
	int base2=1;
 
    int temp = num;
	int temp2=num2;

    while (temp!=0) 
{
        int last_digit= temp % 10;
        temp = temp / 10;
 
        dec_value = dec_value + last_digit * base1;

        base1 = base1 * 2;
  }
  while (temp2!=0) 
{
        int last_digit = temp2 % 10;
        temp2 = temp2 / 10;
 
        dec2 = dec2 + last_digit * base2;

        base2 = base2 * 2;
  }
	
	int decimal=dec_value*dec2;
	int[] a=new int[10];
	int index=0;
	while(decimal!=0)
	{
		a[index]=decimal%2; //10%2=a[0]=0 5%2=a[1]=1
		
		decimal=decimal/2; //10/2=5 5/2=2 
		
		
		index++; //1 2
	}
	for(int i=index-1;i>-1;i--)
	{
	System.out.print(a[i]);
	}
    
}
}
 
