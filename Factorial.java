import java.util.*;
class Factorial{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number : ");
		int n = sc.nextInt();
		int f=1;
		for(int i=1;i<=n;i++){
			f=f*i;
		}
		System.out.println("Factorial : "+ f);
	}
}