import java.util.Scanner;

class complex_impl{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Note : Input in the format <Real> <Imaginary>");
		System.out.print("Enter the first complex no.-");
		double real=sc.nextDouble(),imaginary=sc.nextDouble();
		Complex op1=new Complex(real,imaginary);
		System.out.print("Enter the second complex no.-");
		real=sc.nextDouble();
		imaginary=sc.nextDouble();
		Complex op2=new Complex(real,imaginary);
		System.out.println(op1+" + "+op2+" = "+Complex.add(op1,op2));
		System.out.println(op1+" - ("+op2+") = "+Complex.sub(op1,op2));
		System.out.println("("+op1+") * ("+op2+") = "+Complex.multiply(op1,op2));
	}
}
