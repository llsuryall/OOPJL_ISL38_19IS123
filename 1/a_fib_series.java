import java.util.Scanner;

class a_fib_series{
	private static short n=0;
	private static long first=0L,second=1L,temp=0L;
	public static void fib_recursion(){
		if(n>0){
			System.out.print(first+" ");
			temp=first;
			first=second;
			second=temp+second;
			n--;
			fib_recursion();
		}
	}
	public static void reset(){
		first=0;
		second=1;
	}
	public static void fib_no_recursion(short n){
		long first=0,second=1,temp=0;
		while(n>0){
			System.out.print(first+" ");
			temp=first;
			first=second;
			second=temp+second;
			n--;
		}
		System.out.println("");
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of fib terms to print - ");
		n=sc.nextShort();
		short ncp=n;
		if(n>0){
			System.out.println("Using recursion-");
			fib_recursion();
			reset();
			System.out.println("");
			System.out.println("Without recursion-");
			fib_no_recursion(ncp);
		}
	}
}
