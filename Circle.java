
public class Circle extends Point{
	protected double radius;
	
	public Circle() {
		super();
		setRadius(0);
	}
	
	public Circle(double r, int a, int b) {
		super(a, b);
		setRadius(r);
	}

	private void setRadius(double r) {
		radius = (r >= 0.0 ? r : 0.0);
	}

	public double getRadius() { return radius; }

	public double area() { return Math.PI * radius * radius; }
	
	@Override
	public String toString() {
		return "Center: " + "[" + x + ", " + y + "]; Radius: " + radius;
	}
}//public class Circle {
//	private double radius = 1.0;
//	private String color = "red";
//	
//	public Circle() {
//		radius = 1.0;
//		color = "red";
//		//what's the point
//	}
//	public Circle(double r) {
//		radius = r;
//		//of these??
//	}
//	
//	public double getRadius() {
//		return radius;
//	}
//	
//	public double getArea() {
//		return (radius*radius*3.14);
//	}
//}
