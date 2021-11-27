import java.util.*;
class Max2{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st No : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd No : ");
		int b = sc.nextInt();
		int max = (a>b)?a:b;
		System.out.print(max+" is Greater");
	}
}