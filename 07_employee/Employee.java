class Employee{
	private String fullname,education;
	private int age,yearsOfExperience,noOfLoans,loanAmount,educationVal,basic,hra,da;
	public Employee(String fullname,String education,int educationVal,int age,int yearsOfExperience,int noOfLoans,int loanAmount,int basic,int da,int hra)throws IllegalArgumentException{
		if(fullname!=null && fullname.length()>1 && educationVal>0 && age>0 && noOfLoans>=0 && yearsOfExperience>=0 && loanAmount>=0 && basic>=0 && da>=0 && hra>=0){
			this.fullname=fullname;
			this.education=education;
			this.educationVal=educationVal;
			this.age=age;
			this.basic=basic;
			this.hra=hra;
			this.da=da;
			this.yearsOfExperience=yearsOfExperience;
			this.noOfLoans=noOfLoans;
			this.loanAmount=loanAmount;
		}
		else{
			throw new IllegalArgumentException("Invalid employee details!");
		}
	}
	public boolean isEligible(){
		if(age>=18 && educationVal>=12 && noOfLoans<=2){
			return true;
		}
		else{
			return false;
		}
	}
	public int taxPayAmt(){
		if(this.basic*12>250000){
			if(this.basic*12 <= 500000){
				return this.basic/20;
			}
			else if(this.basic*12 <= 750000){
				return this.basic/10;
			}
			else if(this.basic*12 <= 1000000){
				return this.basic*3/20;
			}
			else if(this.basic*12 <= 1250000){
				return this.basic/5;
			}
			else if(this.basic*12 <= 1500000){
				return this.basic/4;
			}
			else{
				return this.basic*3/10;
			}
		}
		else{
			return 0;
		}
	}
	public boolean isEligibleForPromotion(){
		if(this.yearsOfExperience>=2){
			return true;
		}
		else{
			return false;
		}
	}
	public void display(){
		System.out.println("Name : "+this.fullname);
		System.out.println("Age : "+this.age+"y");
		System.out.println("Education : "+this.education+"("+this.educationVal+")");
		System.out.println("Experience : "+this.yearsOfExperience+"y");
		System.out.println("Basic Salary(monthly) : Rs. "+this.basic);
		System.out.println("HRA : Rs. "+this.hra+"| DA : Rs."+this.da);
		System.out.println("No of loans : "+this.noOfLoans);
		System.out.println("Total Loan Amount : "+this.loanAmount);
	}
}
