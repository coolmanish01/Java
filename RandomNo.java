import java.util.*;
class RandomNo{
	public static void main(String arg[]){
		Random rd = new Random();
		int limit= 100;
		int no = rd.nextInt(limit);
		for(int i=0;i<5;i++){
			System.out.println("Generated Random Number : "+ no);
			no = rd.nextInt(limit);
		}
	}
}