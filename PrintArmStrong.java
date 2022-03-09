import java.util.*;
class PrintArmStrong{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lower Limit : ");
		int l= sc.nextInt();
		System.out.print("Enter the Upper Limit : ");
		int u= sc.nextInt();
		if(l<=10)
				for(int a=l;a<10;a++)
					System.out.println(""+a+" is an Armstrong number.");
			
		for (int i = l; i<u; i++){
			int check, rem, sum = 0;
			check = i;
			while(check != 0) {
				rem = check % 10;
				sum = sum + (rem * rem * rem);
				check = check / 10;
			}
			if(sum == i){
				System.out.println(""+i+" is an Armstrong number.");
			}
		}
	}
}