import java.util.*;
class S{
	//non-static method with parameter float
	void m1(float a){
		System.out.println(a);
	}
	//main method
	public static void main(String[] args){
		// user friendly message
		System.out.println("Enter float value :");

		//scanner method for dynamic input from user
		// System.in is important
		Scanner sc = new Scanner(System.in);
		//this must match with parameter
		float a=sc.nextFloat();

		//create new object for calling the method m1
		S obj = new S();
		obj.m1(a);
	}

}
