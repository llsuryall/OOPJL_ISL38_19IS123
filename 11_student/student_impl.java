import StudentPackage.RegisterStudent;
import StudentPackage.CreditLimit;

class student_impl{
	public static void main(String args[]){
		RegisterStudent stu1=new RegisterStudent();
		boolean success=false;
		while(!success){
			try{
				stu1.getDetails();
				success=true;
			}catch(CreditLimit e){
				e.printStackTrace();
				success=false;
				System.out.println("Try Again...");
			}
		}
		System.out.println("");
		System.out.println("Details of Student-");
		stu1.printDetails();
	}
}
