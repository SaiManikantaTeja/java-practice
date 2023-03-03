class parameter{
	//static method with returntype boolean with parameter long
	static boolean M1(long a){
		System.out.println(a);
	// to return the boolean, it must be declared and intialized
		boolean b=true;
		return b;
	}
	public static void main(String[] args)
	{
		// this statement 
		M1(122345l);
		System.out.println("Returns "+M1(12234));
	}
}
