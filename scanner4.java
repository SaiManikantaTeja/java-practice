import java.util.*;
class scanner4{
	static Scanner sc = new Scanner(System.in);
	//Scanner sc = new Scanner(System.in);
	long m1(float a){
		System.out.println(a);
		System.out.println("Enter Long value:");
		long b=sc.nextLong();
		return b;
	}
	static boolean m2(double c){
		System.out.println(c);
		Scanner sc = new Scanner(System.in);

		scanner4 obj = new scanner4();
		System.out.println("Enter float value:");
		float a=sc.nextFloat();
		System.out.println(obj.m1(a));

		System.out.println("Enter Boolean value:");
		boolean d=sc.nextBoolean();
		return d;
	}
	public static void main(String[] args){
		System.out.println("Enter Double value:");
		double a=sc.nextDouble();
		System.out.println(m2(a));
	}
}
