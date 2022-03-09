import java.util.*;
class Floyd{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Rows : ");
		int n = sc.nextInt();
		int i,j,k=1;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(k+" ");
				k++;
			}
		System.out.println();
		}
	}
}