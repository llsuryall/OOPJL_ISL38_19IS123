package StudentPackage;

public class CreditLimit extends Exception{
	public String toString(){
		return "Registered credits should be smaller than 30";
	}
}
