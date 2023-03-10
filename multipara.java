import java.util.*;
class multipara{
	static Scanner sc = new Scanner(System.in);

	static short m1(long a,boolean b,float c){
		System.out.println(a+""+b+""+c);
		return sc.nextShort();
	}
	static char m2(int a,String b,byte c){
		System.out.println(a+"\n"+b+"\n"+c);
		System.out.println( m1(sc.nextLong(), sc.nextBoolean(), sc.nextFloat()) );
		return sc.next().charAt(0);
	}
	public static void main(String[] args){
		System.out.println( m2( sc.nextInt(), sc.next(), sc.nextByte() ) );
	}
}
