
public class SumOneHundred {
	
	public static void main(String args[]) {
		System.out.println("What is the sum of all the numbers from 1 to 100?");
		System.out.println((100/2)*(1+100));
		//I used a method I learned in math class above
		int checker = 100;
		int ansCheck = 0;
		//I needed a way to check my math method was correct, so I createc the checking variables
		do {
			ansCheck = ansCheck + checker;
			--checker;
			//ansCheck will come out as the sum of all the numbers between 1 and 100
			/*This is because ansCheck starts at 0 then is added 100 by checker. checker is then reduced by 1
			 * and the loop repeats with checker 1 less than the previous loop. Going 99, 98, 97, 96... and adding
			 * each number to ansCheck. When checker reaches 0 the loop stops because there is nothing else to add
			 * effectively adding all the numbers from 1 to 100 to prove my original method*/
		} while (checker >0);
		System.out.println(ansCheck);
	}
}
