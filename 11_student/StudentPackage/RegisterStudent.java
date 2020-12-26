package StudentPackage;
import java.util.Scanner;
import ResultPackage.Result;
import ResultPackage.InvalidSGPA;

public class RegisterStudent implements Student{	
	private String name,branch;
	private int noOfCredits;
	Result res;
	public void getDetails()throws CreditLimit{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name of the student - ");
		this.name=sc.nextLine();
		System.out.print("Enter the branch of the student - ");
		this.branch=sc.nextLine();
		this.noOfCredits=-1;
		while(this.noOfCredits<0){
			System.out.print("Enter the no of credits registered - ");
			this.noOfCredits=sc.nextInt();
		}
		sc.nextLine();
		if(this.noOfCredits>30){
			throw new CreditLimit();
		}
		boolean success=false;
		while(!success){
			try{
				res=new Result();
				res.getDetails();
				success=true;
			}catch(InvalidSGPA e){
				e.printStackTrace();
				success=false;
				System.out.println("Try Again...");
			}
		}
	}
	public void printDetails(){
		System.out.println("Name : "+this.name);
		System.out.println("Branch : "+this.branch);
		res.printDetails();
	}
}
