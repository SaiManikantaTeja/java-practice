class parameter2{
	// non-static method with parameter char
	double m1(char a){
		System.out.println(a);
		double b=31.10;
		return b;
	}
	//non-static method with paramter int
	String m2(int c){
		System.out.println(c);
		String d="yo";
		return d;
	}
	public static void main(String[] args)
	{
		parameter2 obj = new parameter2();
		System.out.println(obj.m1('S'));
		System.out.println(obj.m2(52));
	}
}
