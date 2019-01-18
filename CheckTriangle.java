import java.util.Scanner;
public class CheckTriangle {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		IsoscelesTri i = new IsoscelesTri();
		EquilTri e = new EquilTri();
		SkileneTri sk = new SkileneTri();
		System.out.println("Enter three angles");
		int a = s.nextInt();
		System.out.println("2 more 2 go");
		int b = s.nextInt();
		System.out.println("Enter the last angle");
		int c = s.nextInt();
		
		s.close();
		
		int triAng = (a + b + c);
		
		if (triAng != 180) {
			System.out.println("That isn't a triagle");
		} else {
			i.angleCheck(a, b, c);
			e.angleCheck(a, b, c);
			sk.angleCheck(a, b, c);
		}
		
		System.out.println("Thanks for using this program!");
		
	}
}
