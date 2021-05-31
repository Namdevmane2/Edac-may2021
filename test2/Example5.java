import java.util.*;

// WAP to illustrate Array List using Employee Class.
class Employee {
	int id ; 
	String name ; 
	int salary ;
	
	
	public Employee (int id , String name , int salary) {
		this.id = id ;
		this.name = name ;
		this.salary = salary ;
		
	}
	public static void displayList(ArrayList<Employee> list) {
		for(Employee er : list)
			System.out.println(er);
	}
	private static void addList(ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		
	}

	
}
public class Example5 {
	public static void main(String Args[])
	{
		ArrayList<Employee> list = new ArrayList<Employee>() ;
		
		list.add(new Employee(101, "Namdev" ,25000)) ;
		list.add(new Employee(102, "Ganesh" ,20000)) ;
		list.add(new Employee(103, "Monish" ,30000)) ;
		list.add(new Employee(104, "Sachin" ,25500)) ;
		list.add(new Employee(105, "Vishal" ,25550)) ;
		
		//System.out.println(list);
		for(Employee er : list)
		{
			System.out.println(er);
		}
	}

	
	
}
