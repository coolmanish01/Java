import java.util.*;
class PrintPrime{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Lower Limit : ");
		int l = sc.nextInt();
		System.out.print("Enter the Upper Limit : ");
		int u = sc.nextInt();
		boolean f = true;
		for(int i=l;i<=u;i++){
			f=true;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					f=false;
					break;
				}
			}
			if(f==true)
				System.out.print("  "+i);
		}
	}
}