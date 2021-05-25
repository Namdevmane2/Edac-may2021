import java.util.Scanner;

class Student 
{
	int id ;
	String name ;
	double percentage ;
	String std ;
	int result,total = 0 ;
	public Student()
	{
		this.id = 101 ;
		this.name = "Namdev" ;
		this.std = "CDAC" ;
	}
	public Student(int id , String name,String std)
	{
		this.id = id ;
		this.name = name ;
		this.std = std ;
	}
	public void displayData() {
		System.out.println("Studenr id : = "+this.id);
		System.out.println("Student name : "+this.name);
		System.out.println("Student Standard : "+this.std);
		
	}
	public void acceptmarks(int arr[]) {
		int i ;
		for(i = 0 ; i<arr.length;i++)
		{
			total = total + arr[i];
		}
		System.out.println("total marks : "+total);
		percentage = (double)(total*100)/500;
		System.out.println("percentage : "+percentage);
	}
	public void DisplayResult() {
		displayData();
		if(this.percentage > 70 )
		{
			System.out.println("Result pass :Distriction");
		}
		else if (this.percentage > 60 )
		{
			System.out.println("Result pass :first class");
		}
		else if(this.percentage > 40)
		{
			System.out.println("Result pass :second class ");
		}
		else
		{
			System.out.println("Result Fail :" );
		}
	}
}


public class TestDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]  marks = new int[5] ;
		System.out.println("Enter Student marks");
		for(int i = 0 ;i<marks.length;i++)
		{
			marks[i] = sc.nextInt();
		}
		
		Student obj = new Student(404,"Rahul","CDAC");
		obj.acceptmarks(marks);
		//obj.displayData();
		obj.DisplayResult() ;

	}
}
