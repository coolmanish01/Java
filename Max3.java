import java.util.*;
class Max3{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your 1st No : ");
		int a = sc.nextInt();
		System.out.print("Enter your 2nd No : ");
		int b = sc.nextInt();
		System.out.print("Enter your 3rd No : ");
		int c = sc.nextInt();
		if(a>b&&a>c)
			System.out.println(a+" is Greater");
		if(b>a&&b>c)
			System.out.println(b+" is Greater");
		if(c>a&&c>b)
			System.out.println(c+" is Greater");
	}
}