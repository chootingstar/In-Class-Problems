import java.util.Scanner;

public class MultiNonPurpose {
	public static int countA(String z) {
		int count = 0;
		for(int i=0;i<z.length();i++) {
			char o = z.charAt(i);
			if(o == 'a' || o == 'A') count++;
		}
		return count;
	}

	public static boolean evenlyDivisable(int x, int y) {
		int z,w;
		boolean goob = false;
		z = x%y;
		w = y%x;
		if(z==0 || w==0) goob = true;

		return goob;

	}

	public static float average(int a, int b, int c) {
		return (a + b + c)/3;
	}

	public static float average(int a, int b, int c, int d) {
		return (a + b + c + d)/4;
	}

	public static float average(int a, int b, int c, int d, int e) {
		return (a + b + c + d + e)/5;
	}
	
	public static void main(String args[]) {
		System.out.println("Welcome! What would you like to do? \n"
				+ "Enter '1' to count the number of times 'A' is in a sentence \n"
				+ "Enter '2' to figure out if two numbers can evenly divide into the other \n"
				+ "Enter '3' to get the average of 3-5 numbers");
		Scanner can = new Scanner(System.in);
		int choice = can.nextInt();
		if(choice == 1) {
			System.out.println("Awesome! Type in anything followed by the enter key, even a whole sentence.");
			can.nextLine();
			String waka = can.nextLine();
			System.out.println(waka);
			System.out.println(countA(waka));
		}
		if(choice == 2) {
			System.out.println("Great! Type in two numbers and we'll calculate if one divides the other evenly");
			int dan = can.nextInt();
			int pan = can.nextInt();
			System.out.println(evenlyDivisable(dan, pan));
		}
		int a,b,c,d,e;
		if(choice == 3) {
			System.out.println("Your the one! Type in 3 to 5 numbers to calculate their average.");
			a = can.nextInt();
			b = can.nextInt();
			c = can.nextInt();
			d = can.nextInt();
			e = can.nextInt();
			System.out.println(average(a,b,c,d,e));
			System.out.println(average(a,b,c,d));
			System.out.println(average(a,b,c));
		}
		can.close();
	}
}
