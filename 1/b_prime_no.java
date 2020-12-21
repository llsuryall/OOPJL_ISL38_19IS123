import java.util.Scanner;

class b_prime_no{
	static boolean is_prime(long prime){
		if(prime%2==0){
			if(prime!=2){
				return false;
			}
			else{
				return true;
			}
		}
		else{
			int sq=(int)Math.sqrt((double)prime);
			for(long i=3;i<=sq;i+=2){
				if(prime%i==0){
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. to check whether its prime-\n->");
		long num=sc.nextLong();
		System.out.println("The no. is "+(is_prime(num)?"":"not ")+"prime");
	}
}
