import java.util.*;
class Mult2{
	int Mult2(int m,int n){
		return m*n;
	}
}
class Mult3 extends Mult2{
	int Mult3(int a,int b,int c){
		int no;
		no = Mult2(a,b);
		return no*c;
	}
}
class Multiplication{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First No : ");
		int a= sc.nextInt();
		System.out.print("Enter the Second No : ");
		int b= sc.nextInt();
		System.out.print("Enter Third No : ");
		int c = sc.nextInt();
		Mult2 t1 =  new Mult2();
		Mult3 t2 =  new Mult3();
		
		
		int m1 = t1.Mult2(a,b);
		int m2 = t2.Mult3(a,b,c);
		System.out.println("Multiplication of 2 No : "+m1);
		System.out.println("Multiplication of 3 No : "+m2);
	}
}