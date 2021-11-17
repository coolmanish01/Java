import java.util.*;
class palindrome{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your No : ");
		int n = sc.nextInt();
		int rev=0,temp,r;
		temp=n;
		while(temp>0){
			r=temp%10;
			rev = (rev*10)+r;
			temp=temp/10;
		}
		if(rev==n)
			System.out.println("No is Palindrome ");
		else
			System.out.println("No is not Palindrome ");
	}
}