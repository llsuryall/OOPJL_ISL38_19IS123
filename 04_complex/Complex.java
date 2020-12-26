class Complex{
	private double real,imaginary;
	public Complex(double real,double imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	public static Complex add(Complex op1,Complex op2){
		return new Complex(op1.real+op2.real,op1.imaginary+op2.imaginary);
	}
	public static Complex sub(Complex op1,Complex op2){
		return new Complex(op1.real-op2.real,op1.imaginary-op2.imaginary);
	}
	public static Complex multiply(Complex op1,Complex op2){
		return new Complex(op1.real*op2.real-op1.imaginary*op2.imaginary,op1.real*op2.imaginary+op2.real*op1.imaginary);
	}
	public String toString(){
		return ""+this.real+" + "+this.imaginary+"i";
	}
}
