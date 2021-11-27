class Bitwise{
	public static void main(String arg[]){
		int x=9,y=8;
		System.out.println("x=9 , y=8");
		System.out.println("x&y = "+(x&y)); //Bitwise AND (&) 1001 & 1000 = 1000 = 8
		System.out.println("x^y = "+(x^y)); //Bitwise exclusive OR (^)  1001 ^ 1000 = 0001 = 1  
		System.out.println("x|y = "+(x|y)); //Bitwise inclusive OR (|)  1001 | 1000 = 1001 = 9
		System.out.println("~x = "+(~x));   //Bitwise Complement (~)  ~1001= 0110 = -10
		System.out.println("x>>2 = " + (x >>2)); // x/2^2
		System.out.println("x<<1 = " + (x << 1)); // x*(2^1)
	}
}