
public class Point{
	protected int x, y;
	public Point() {
		System.out.println("Get the point?");
		setPoint(0, 0);
	}
	
	public Point(int a, int b) {
		setPoint(a, b);
	}
	
	private void setPoint(int i, int j) {
		x = i;
		y = j;
	}
	
	public int getX() { return x;}
	public int getY() { return y;}
	
	public String toString() {
		return "Point: " + "[" + x + ", " + y + "]";
	}
}


