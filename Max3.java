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
		else if(b>a&&b>c)
			System.out.println(b+" is Greater");
		else if(c>a&&c>b)
			System.out.println(c+" is Greater");
                else if(a=b=c)
                        System.out.println("All are Equal");
                else
                        System.out.println("Invalid Input");
	}
}
