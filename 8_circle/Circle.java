import java.lang.Math;

class Circle{
	protected double radius;
	public Circle(double radius)throws IllegalArgumentException{
		if(radius>0){
			this.radius=radius;
		}
		else{
			throw new IllegalArgumentException("Invalid value given for radius!");
		}
	}
	public static double Area(Circle cir){
		return Math.PI*cir.radius*cir.radius;
	}
}

class Sector extends Circle{
	private double angle_subtended;
	public Sector(double radius,double angle_subtended)throws IllegalArgumentException{
		super(radius);
		if(angle_subtended>=0 && angle_subtended<=2*Math.PI){
			this.angle_subtended=angle_subtended;
		}
		else{
			throw new IllegalArgumentException("Invalid value given for angle subtended!");
		}
	}
	public static double Area(Sector sec){
		return sec.radius*sec.radius*sec.angle_subtended/2;
	}
}

class Segment extends Circle{
	private double length;
	public Segment(double radius,double length)throws IllegalArgumentException{
		super(radius);
		if(length>0 && length<=this.radius*2){
			this.length=length;
		}
		else{
			throw new IllegalArgumentException("Invalid value given for length of segment!");
		}
	}
	public static double Area(Segment seg){
		return seg.radius*seg.radius*Math.asin(seg.length/(2*seg.radius))-seg.length*Math.sqrt(seg.radius*seg.radius-seg.length*seg.length/4)/2;
	}
}
