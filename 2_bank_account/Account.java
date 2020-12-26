import java.util.Scanner;

public class Account{
	private long accno;
	private String name;
	private long phone_no;
	private float balance;
	public void getInput(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the account no - ");
		this.accno=sc.nextLong();
		sc.nextLine();
		System.out.print("Enter the name of the customer - ");
		this.name=sc.nextLine();
		System.out.print("Enter the phone no - ");
		this.phone_no=sc.nextLong();
		System.out.print("Enter the initial balance - ");
		this.balance=sc.nextFloat();
		sc.nextLine();
	}
	public void deposit(float val){
		if(val>0){
			this.balance+=val;
			System.out.println("Rs. "+val+" was deposited. Current balance is Rs. "+this.balance);
		}
		else{
			System.out.println("Invalid amount! Cannot deposit -ve amount");
		}
	}
	public void withdraw(float val){
		if(this.balance>val){
			this.balance-=val;
			System.out.println("Rs. "+val+" was withdrawn. Current balance is Rs. "+this.balance);
		}
		else{
			System.out.println("Insuffecient balance!");
		}
	}
	public void display(){
		System.out.println("Name - "+this.name);
		System.out.println("Account no - "+this.accno);
		System.out.println("Phone no - "+this.phone_no);
		System.out.println("Balance - "+this.balance);
	}
}
