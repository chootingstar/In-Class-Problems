import java.util.Scanner;

public class SumOfRange {
	public static void main(String args[]) {
		SumOfRange sor = new SumOfRange();
		Scanner f1st = sor.userNum1();
		Scanner s2nd = sor.userNum2();
		//Made two calls for two inputs
		
		
		
		//Made new variables to store the inputs
		
		System.out.println("Enter a number");
		int fst = f1st.nextInt();
		//First input
		System.out.println("Enter a second number");
		int snd = s2nd.nextInt();
		//Second input
		
		//Deleted the code fst = f1st.nextInt(); and the snd variant to fix a problem with inputting the numbers
		// before the prompt, then inputting junk 
		
		int sumOfInput = 0;
		//needed to store the sum of the range
		
		int larger;
		int smaller;
		if (fst > snd) {
			larger = fst;
			smaller = snd;
		} else {
			larger = snd;
			smaller = fst;
		}
		//Checks which number is bigger than the other then defines the larger number to... larger
		
		do {
			sumOfInput = sumOfInput + larger;
			--larger;
		} while (larger > (smaller-1));
		//Altered choice of method to this hard count method when the math equation took to long to solve		
		
		
		/*int chkEven = (fst - snd)%2;
		//chkEven is needed to detect odd numbers. If there is a remainder of 1, then the number is odd
		
		
		
		if (chkEven == 1) {
			sumOfInput = (((larger-smaller)+1)/2)*(fst + snd);
			//Just needed to copy the previous equation, get rid of +1 and change the 2 to 1
			//the equation takes the smaller number and adds it to the larger, then multiplies it by half the range
			
		} else {
			sumOfInput = (((larger+1)-smaller)/2)*((smaller + 1) + larger) + smaller;
			//I needed to create 2 new variable just to complete this equation
			//changed fst and snd to larger and smaller
			//switched equatins as 7 - 5 divided... by 2... has no remainder. Oh.
		}
		Too much effort was put into equations that I couldn't consistantly get the right answer*/
		
		System.out.println("The sum of the range between " + fst + " and " + snd + " is: " + sumOfInput);
		//Really long conotation for the result
	}
	
	Scanner userNum1() {
		Scanner userInput= new Scanner(System.in);
		return userInput;
		//Taken from another program of mine
	}
	
	Scanner userNum2() {
		Scanner userInput= new Scanner(System.in);
		return userInput;
		//Duplicated and changed names of functions for dual input use.
	}
}
