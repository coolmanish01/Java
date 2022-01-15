import java.util.*;
class Swapwithout3{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b : ");
		int b = sc.nextInt();
		// code to Swap
			b = a + b;
			a = b - a;
			b = b - a;
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	}
}