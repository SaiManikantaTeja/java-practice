class bothmethodcall{
	//non-static method with parameter float
	void m1(float x){
		System.out.println(x);
	}
	//static method with parameter String
	static void m2(String y){
		System.out.println(y);
	}
	public static void main(String[] args)
	{
		//object created for non-static method
		bothmethodcall object = new bothmethodcall();
		// syntax : <Objname>.<methodname>();
		object.m1(10.1f);

		//static method call
		m2("mani");
	}
}
