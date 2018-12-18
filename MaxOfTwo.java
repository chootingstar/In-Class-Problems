import java.util.Scanner;

public class MaxOfTwo {
	

	Scanner userNum1() {
		Scanner userInput= new Scanner(System.in);
		return userInput;
		
	}
	
	Scanner userNum2() {
		Scanner userInput= new Scanner(System.in);
		return userInput;
		
	}
	
	public static void main(String[] args) {
		MaxOfTwo mot = new MaxOfTwo();
		Scanner in1 = mot.userNum1();
		Scanner in2 = mot.userNum2();
while (6>5) {
		int in11 = in1.nextInt();
		int in22 = in2.nextInt();
		
		System.out.println("Added together make: " + (in11 +in22));
	
	}
	}
}

