package ISE;
import java.util.Scanner;


public class ISE_department implements Department{
	private final String dep_name="Information Science and Engineering";
	private int noOfDesignations,research_projects=-1,noOfFaculty;
	Faculty[] faculties;
	public void readdata()throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of designations in the department - ");
		this.noOfDesignations=sc.nextInt();
		if(this.noOfDesignations<=0){
			throw new Exception("Invalid input for no of designations!");
		}
		System.out.print("Enter no. of research projects - ");
		this.research_projects=sc.nextInt();
		System.out.print("Enter no of faculty in department - ");
		this.noOfFaculty=sc.nextInt();
		if(this.noOfFaculty<=0){
			throw new Exception("Invalid input for no of faculty!");
		}
		System.out.println("Enter the details for all the faculties-");
		faculties=new Faculty[this.noOfFaculty];
		for(int i=0;i<this.noOfFaculty;i++){
			System.out.println("Enter the details for Faculty "+(i+1)+" - ");
			try{
				faculties[i]=Faculty.getInput();
			}
			catch(AgeException e){
				e.printStackTrace();
				faculties[i]=null;
			}
			if(faculties[i]==null){
				System.out.println("Invalid details! Try again...");
				i--;
			}
		}
	}
	public void printdata(){
		if(this.research_projects!=-1){
			System.out.println("Department Name : "+this.dep_name);
			this.print_no_of_designations();
			System.out.println("No of reasearch projects : "+this.research_projects);
			System.out.println("No of faculties : "+this.noOfFaculty);
			for(int i=0;i<this.noOfFaculty;i++){
				if(this.faculties[i].get_yearsOfExp()>=20){
					System.out.println("");
					System.out.println("Faculty "+(i+1)+"-");
					Faculty.display(this.faculties[i]);
				}
			}
		}
	}
	public void print_no_of_designations(){
		System.out.println("No of designations : "+this.noOfDesignations);
	}
	public int number_of_reasearch_consultency_projs(){
		return this.research_projects;
	}
}
