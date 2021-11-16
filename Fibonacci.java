class Fibonacci{
	public static void main(String arg[]){
		long n1=0,n2=1,temp;
		for(int i=0;i<40;i++){
			temp=n1+n2;
			System.out.print(n1 +"\t");
			n1=n2;
			n2=temp;
		}
	}
}