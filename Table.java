import java.util.*;
class Table{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number to print Table: ");
		int no = sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(no+"*"+i+" = "+(no*i));
		}
	}
}