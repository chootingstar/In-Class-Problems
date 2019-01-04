import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class ArrayListing {
	
	public static void main(String[] args) {
		
		ArrayList<String> listTest = new ArrayList<String>();
		
		
		Scanner scan = new Scanner(System.in);
		int e;
		
		System.out.println("How many elements do we want?");
		e = scan.nextInt();
		
		System.out.println("Great! Now type out that many names");
		for (int i=0; i<e; i++) {
			String s = scan.next();
			listTest.add(s);
		}
		scan.close();
		System.out.println(listTest);
	}
	
	
}
