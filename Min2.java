import java.util.*;
class Min2{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st No : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd No : ");
		int b = sc.nextInt();
		int min = (a<b)?a:b;
		System.out.print(min+" is Smaller");
	}
}
