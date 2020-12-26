package Main;
import ISE.ISE_department;

class MainClass{
	public static void main(String args[]){
		ISE_department myISE = new ISE_department();
		boolean success=false;
		System.out.println("Enter the deatils to create department of ISE -");
		while(!success){
			try{
				myISE.readdata();
				success=true;
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("Invalid input! Try again...");
				success=false;
			}
		}
		System.out.println("");
		System.out.println("Details of Dept. of ISE-");
		myISE.printdata();
	}
}
