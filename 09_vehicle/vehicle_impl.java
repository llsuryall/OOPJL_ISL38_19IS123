import java.util.Scanner;

class vehicle_impl{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		boolean success=false;
		MyTwoWheeler twoWhl=null;
		FourWheeler forWhl=null;
		short yearOfManufacture=0;
		String name=null;
		while(!success){
			try{
				System.out.print("Enter details for a two wheeler vehicle -\n");
				System.out.print("Name : ");
				name=sc.nextLine();
				System.out.print("Manufacture Year : ");
				yearOfManufacture=sc.nextShort();
				sc.nextLine();
				twoWhl=new MyTwoWheeler(name,yearOfManufacture);
				twoWhl.getData();
				success=true;
			} catch(IllegalArgumentException e){
				e.printStackTrace();
				success=false;
				System.out.print("Try Again...\n");
			}
		}
		success=false;
		while(!success){
			try{
				System.out.print("Enter details for a four wheeler vehicle -\n");
				System.out.print("Name : ");
				name=sc.nextLine();
				System.out.print("Manufacture Year : ");
				yearOfManufacture=sc.nextShort();
				sc.nextLine();
				forWhl=new FourWheeler(name,yearOfManufacture);
				forWhl.getData();
				success=true;
			} catch(IllegalArgumentException e){
				e.printStackTrace();
				success=false;
				System.out.print("Try Again...\n");
			}
		}
		System.out.print("Displaying details of cars\n");
		System.out.print("Displaying details of 2 wheeler vehicle - ");
		twoWhl.putData();
		System.out.print("Displaying details of 4 wheeler vehicle - ");
		forWhl.putData();
	}
}
