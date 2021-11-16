import java.util.*;
class Leap{
	public static void main(String arg[]){
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year : ");
		y = sc.nextInt();
		if(((y%4==0)&&(y%100!=0))||(y%400==0))
			System.out.println("It is a Leap Year !");
		else
			System.out.println("It is not a Leap Year !");
		
	}
}