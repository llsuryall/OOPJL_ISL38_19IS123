package ISE;
import java.util.Scanner;

class Faculty{	
	private String name,joining_date,designations,subjects_handled;
	private int age,yearsOfExp;
	public static Faculty getInput()throws AgeException{
		Scanner sc=new Scanner(System.in);
		Faculty fac=new Faculty();
		System.out.print("Enter the name of faculty - ");
		fac.name=sc.nextLine();
		System.out.print("Enter the age - ");
		fac.age=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter joining date of faculty - ");
		fac.joining_date=sc.nextLine();
		System.out.print("Enter Designations - ");
		fac.designations=sc.nextLine();
		System.out.print("Enter the subjects handled by faculty - ");
		fac.subjects_handled=sc.nextLine();
		System.out.print("Enter no of years of experience - ");
		fac.yearsOfExp=sc.nextInt();
		sc.nextLine();
		if(fac.name!=null && fac.age>=0 && fac.joining_date!=null && fac.designations!=null && fac.subjects_handled!=null && fac.yearsOfExp>=0){
			if(fac.age>58){
				throw new AgeException();
			}
			else{
				return fac;
			}
		}
		else{
			return null;
		}
	}
	public static void display(Faculty fac){
		System.out.println("Name : "+fac.name);
		System.out.println("Age : "+fac.age);
		System.out.println("Joining date : "+fac.joining_date);
		System.out.println("Designations : "+fac.designations);
		System.out.println("Subjects handled : "+fac.subjects_handled);
		System.out.println("Experience : "+fac.yearsOfExp);
	}
	public int get_yearsOfExp(){
		return this.yearsOfExp;
	}
}

class AgeException extends Exception{
	public String toString(){
		return "Age should be less than 59!";
	}
}
