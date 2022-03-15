import java.util.*;
class ConstructorAdd{
	int s;
	ConstructorAdd(){
		System.out.print("Sum of the numbers : ");
	}
	ConstructorAdd(int a,int b){
		System.out.println(a+b);
	}
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First No : ");
		int m = sc.nextInt();
		System.out.print("Enter Second No : ");
		int n = sc.nextInt();
		ConstructorAdd t1 = new ConstructorAdd();
		ConstructorAdd t2 = new ConstructorAdd(m,n);
	}
}