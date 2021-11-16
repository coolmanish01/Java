import java.util.*;
class Compare{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your 1st Number : ");
		int a = sc.nextInt();
		System.out.print("Enter your 2nd Number : ");
		int b = sc.nextInt();
		if(a<b){
			System.out.println(a+" is Smaller");
		}
		else if(a>b){
			System.out.println(b+" is Smaller");
		}
		else if(a==b){
			System.out.println("Both are Equal");			
		}
		else
			System.out.println("Wrong Input");
	}
}