import java.util.*;
class kilogram{
	public static void main(String[] args){
		System.out.println("Enter value in kgs:");
		Scanner sc = new Scanner(System.in);
		float k=sc.nextFloat();
		k*=1000;
		System.out.println("In grams:"+k+"grams");
	}
}
