
public class InheritanceTest {
	public static void main(String args[]) {
		Point pointRef, p;

		Circle circleRef, c;
		String output;

		p = new Point(30, 50);
		c = new Circle(2.7, 120, 89);

		output = "Point p: " + p.toString() + "Circle c: " + c.toString();
		System.out.println(output);
		
		pointRef = c;
	//	circleRef = p;
		output = "Point pointRef: " + pointRef.toString();
		System.out.println(output);
	}
}