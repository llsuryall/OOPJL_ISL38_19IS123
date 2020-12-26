import java.util.Scanner;

class circle_impl{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Circle cir=null;Sector sec=null;Segment seg=null;
		double radius=0,angle_sub=0,length=0;
		boolean success=false;
		System.out.println("Enter details to create a circle,a sector and a segment -");
		while(!success){
			try{
				System.out.print("Enter the radius of circle - ");
				radius=sc.nextDouble();
				cir=new Circle(radius);
				System.out.print("Enter the angle subtended by the sector in radian - ");
				angle_sub=sc.nextDouble();
				sec=new Sector(radius,angle_sub);
				System.out.print("Enter the length of chord subtended by the segment - ");
				length=sc.nextDouble();
				seg=new Segment(radius,length);
				success=true;
			}
			catch(IllegalArgumentException e){
				e.printStackTrace();
				System.out.println("Try again...");
				success=false;
			}
		}
		System.out.println("The area of circle is "+Circle.Area(cir));
		System.out.println("The area of sector is "+Sector.Area(sec));
		System.out.println("The area of segment is "+Segment.Area(seg));
	}
}
