
public class IsoscelesTri {
	public void angleCheck(int x, int y, int z) {
		
	if( x == y && y != z && z != x) {System.out.println("Isosceles Triangle");}
	
	if( x != y && y == z && z != x) {
		System.out.println("Isosceles Triangle");}
	
	 if(x != y && y != z && z == x) {System.out.println("Isosceles Triangle");}
		
	}
}
