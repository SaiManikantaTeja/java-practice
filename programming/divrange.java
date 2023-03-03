import java.util.*;
class divrange{
	public static void main(String[] args)
	{
		System.out.println("Enter values a & b :");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Divisible numbers are:");
		for(int i=a;i<=b;i++)
		{
			if(i%11==0){
				System.out.println(i);
			}
		}
	}
}
