import java.util.Scanner;

class employ_impl{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of employee details to enter - ");
		int n=sc.nextInt();
		if(n>0){
			Employee[] ar=new Employee[n];
			boolean success=true;
			for(int i=0;i<n;i++){
				success=true;
				System.out.println("Enter the datails of employee "+(i+1)+" - ");
				while(success){
					try{
						ar[i]=getInput();
						success=false;
					}
					catch(IllegalArgumentException e){
						System.out.println("Invalid input! Try again!");
						success=true;
					}
				}
			}
			System.out.println("\nDisplaying details of "+n+" employee"+(n>1?"s":"")+"...");
			for(int i=0;i<n;i++){
				System.out.println("Employee "+(i+1)+"-");
				ar[i].display();
				System.out.println("Loan eligibility - "+(ar[i].isEligible()?"E":" Not e")+"ligible");
				System.out.println("Promotion eligibility - "+(ar[i].isEligibleForPromotion()?"E":" Not e")+"ligible");
				System.out.println("Income tax(monthly) - Rs."+ar[i].taxPayAmt());
			}
		}
		else{
			System.out.println("Invalid input!");
		}
	}
	public static Employee getInput()throws IllegalArgumentException{
		Scanner sc=new Scanner(System.in);
		String fullname,education;
		int age,yearsOfExperience,noOfLoans,loanAmount,educationVal,basic,hra,da;
		System.out.print("Enter the full name of the employee - ");
		fullname=sc.nextLine();
		System.out.print("Enter the age of the employee - ");
		age=sc.nextInt();
		System.out.print("No of years of experience - ");
		yearsOfExperience=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the education details - ");
		education=sc.nextLine();
		System.out.print("Enter the basic salary - ");
		basic=sc.nextInt();
		System.out.print("Enter HRA and DA -");
		hra=sc.nextInt();
		da=sc.nextInt();
		System.out.print("Value of education according to company terms(integer) - ");
		educationVal=sc.nextInt();
		System.out.print("No of loans - ");
		noOfLoans=sc.nextInt();
		System.out.print("Enter the total loan amount - ");
		loanAmount=sc.nextInt();
		sc.nextLine();
		return new Employee(fullname,education,educationVal,age,yearsOfExperience,noOfLoans,loanAmount,basic,da,hra);
	}
}
