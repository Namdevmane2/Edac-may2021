import java.util.*;

class Student {
	Scanner sc = new Scanner(System.in);
	
	void studentDetails(int id ,String name) {
		System.out.println("enter Student ID : "+id);
		System.out.println("enter Student Name : "+name);
	}
}
class Marks extends Student {
	void studentDetails(int id, String name ) {
		int marks1 ;
			System.out.println("Enter marks of Student");
			int n1 = sc.nextInt() ;
			int n2 = sc.nextInt() ;
			int n3 = sc.nextInt() ;
			int n4 = sc.nextInt() ;
			marks1 = (n1 + n2+ n3 + n4) ;
			System.out.println("marks : "+marks1);
		}
}

class Result extends Marks {
	void studentDetails(int id, String name ) {
		System.out.println("pass");
	}
}
public class Example4 {

	public static void main(String[] args) {
		Student obj = new Student() ;
		obj.studentDetails(056, "Namdev");
		obj = new Marks() ;
		obj.studentDetails(056, "Namdev");
		obj = new Result() ;
		obj.studentDetails(056, "Namdev");
	}

}
