/*
13. Write a Java program to print the area and perimeter of a rectangle
*/

import java.util.*;

class Assign13 
{
	public static void main(String args[])
	{
		double width = 5.5 ,height = 8.5 , area ,perimeter;
		
		area = (width * height) ; 
		
		perimeter = 2 * ( width + height);
		
		System.out.println("area of rectangle: "+area);
		
		System.out.println("perimeter of rectangle: "+perimeter);

	}
}