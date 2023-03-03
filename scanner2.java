import java.util.*;
class scanner2{
	static void m1(boolean x){
		System.out.println(x);
	}
	static void m2(long y){
		System.out.println(y);
	}
	public static void main(String[] args){
		
		System.out.println("Enter Boolean and long values:");
		Scanner sc = new Scanner(System.in);
		boolean x=sc.nextBoolean();
		long y=sc.nextLong();
		System.out.println(m1(x));
		System.out.println(m2(y));
		//m1(x);
		//m2(y);
	}
}
