
public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {
		radius = 1.0;
		color = "red";
		//what's the point
	}
	public Circle(double r) {
		radius = r;
		//of these??
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return (radius*radius*3.14);
	}
}
