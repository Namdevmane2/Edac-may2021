
import java.util.Scanner;

interface dispTime {
	public void dispTime_InSec(int a);
	public void dispTime_Inhrs(int a);
	
	
}

class Time implements dispTime {

	@Override
	public void dispTime_InSec(int a) {
		int sec  = a * 60 ; 
		System.out.println("time in second is  : "+sec);
	}

	@Override
	public void dispTime_Inhrs(int a) {
		int hr = a / 60 ;
		System.out.println("time in  hr : "+hr);
		
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter time in Minute");
		int minute = sc.nextInt();
		sc.close();
		Time obj = new Time() ;
		obj.dispTime_Inhrs(minute);
		obj.dispTime_InSec(minute);

	}

}
