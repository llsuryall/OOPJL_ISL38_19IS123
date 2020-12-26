import java.util.Scanner;

abstract class Vehicle{
	protected String name;
	protected short yearOfManufacture;
	public Vehicle(String name,short yearOfManufacture)throws IllegalArgumentException{
		if(yearOfManufacture>=0 && name!=null && name.length()>1){
			this.yearOfManufacture=yearOfManufacture;
			this.name=name;
		}
		else{
			throw new IllegalArgumentException("Invalid year of manufacture or name!");
		}
	}
	public abstract void getData();
	public abstract void putData();
}

class TwoWheeler extends Vehicle{
	public final short wheels=2;
	private short noOfEngines=0;
	public TwoWheeler(String name,short yearOfManufacture)throws IllegalArgumentException{
		super(name,yearOfManufacture);
	}
	public void getData()throws IllegalArgumentException{
		System.out.print("Enter the no of Engines for "+this.name+" - "); 
		Scanner sc=new Scanner(System.in);
		short noOfEngines=sc.nextShort();
		if(noOfEngines>0){
			this.noOfEngines=noOfEngines;
		}
		else{
			throw new IllegalArgumentException("Invalid no of engines!");
		}
	}
	public void putData(){
		System.out.println("Name : "+this.name);
		System.out.println("Year of Manufacture : "+this.yearOfManufacture);
		System.out.println("No of Wheels : "+this.wheels);
		if(this.noOfEngines>0){
			System.out.println("No of Engines : "+this.noOfEngines);
		}
	}
}
final class FourWheeler extends Vehicle{
	public final short wheels=4;
	private short noOfEngines=0;
	public FourWheeler(String name,short yearOfManufacture)throws IllegalArgumentException{
		super(name,yearOfManufacture);
	}
	public void getData()throws IllegalArgumentException{
		System.out.print("Enter the no of Engines for "+this.name+" - "); 
		Scanner sc=new Scanner(System.in);
		short noOfEngines=sc.nextShort();
		if(noOfEngines>0){
			this.noOfEngines=noOfEngines;
		}
		else{
			throw new IllegalArgumentException("Invalid no of engines!");
		}
	}
	public void putData(){
		System.out.println("Name : "+this.name);
		System.out.println("Year of Manufacture : "+this.yearOfManufacture);
		System.out.println("No of Wheels : "+this.wheels);
		if(this.noOfEngines>0){
			System.out.println("No of Engines : "+this.noOfEngines);
		}
	}
}

class MyTwoWheeler extends TwoWheeler{
	public MyTwoWheeler(String name,short yearOfManufacture){
		super(name,yearOfManufacture);
	}
}
