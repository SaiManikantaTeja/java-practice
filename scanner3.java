import java.util.*;
//specifically we import only Scanner i.e, import java.util.Scanner;
class scanner3{
	//when calling 'global object' to a static method, that method needs to be 'static'
	static Scanner sc = new Scanner(System.in);

	// returntypes are declared in same method, but "parameters are declared in 'main method'"
	static int m1(float a){
		System.out.println(a);
		System.out.println("Enter int value:");
		int b=sc.nextInt();
		return b;
	}
	static boolean m2(long c){
		System.out.println(c);
		System.out.println("Enter boolean value:");
		boolean d=sc.nextBoolean();
		return d;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter Float Value:");
		float a=sc.nextFloat();
		System.out.println(m1(a));

		System.out.println("Enter Long Value:");
		long b=sc.nextLong();
		System.out.println(m2(b));
	}
}
