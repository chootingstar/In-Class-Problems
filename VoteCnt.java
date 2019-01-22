import java.util.Scanner;
public class VoteCnt {
	public static void main(String args[]) {

		System.out.println("Vote on singers. There are two finalist 'A' and 'B'");
		System.out.println("You and your friends will each take a vote by typing in 'A' or 'B' then hitting the enter key.");
		System.out.println("When you're done voting, type done then hit enter.");
		//Say "Vote on singers"
		Scanner s = new Scanner(System.in);

		//counter for A
		//counter for B
		int cntA = 0;
		int cntB = 0;
		int instr = 0;

		while(cntA == 0 && cntB == 0) {
			while (5 < 6) {
				System.out.println("Vote:");
				String vote = s.next();

				if (vote.equals("B") || vote.equals("b")) {
					cntB++;
				} else if(vote.equals("A") || vote.equals("a")) {
					cntA++;
				} else {
					break;
				}


				if (instr == 5) {
					System.out.println("Remember, when you're done voting, type done then hit enter.");
					instr = 0;
				}

				instr++;
				//Display prompting to vote 'A' or 'B' in capital or lowercase
				//type anything else to tally votes.

			}
			if (cntA == 0 && cntB == 0) {
				System.out.println("Hey! Someone needs to win! Vote for either 'A' or 'B', you don't even need to have it uppercase!");
			}
		}

		s.close();
		//Say "And the winner of the 74th Annual Singer Games is..." + winner
		//or say "The singers have tied. There will be a rock concert battle next week

		int winr;

		if (cntA == cntB) {
			winr = cntA;
			System.out.println("The singers have tied with " + winr + " votes each. There will be a rock concert battle next week");
		} else {
			char win;
			char lose;

			if (cntA > cntB) {
				win = 'A';
				winr = cntA;
				lose = 'B';
			} else {
				win = 'B';
				winr = cntB;
				lose = 'A';
			}
			System.out.println("And the winner of the 74th Annual Singer Games is... " + win + " with " + winr + " out of " + (cntA + cntB) + " votes!");
			System.out.println(lose + " only recieved " + (cntA + cntB - winr) + " votes. They will be participating in the 73rd Annual Hunger Games"
					+ " as a consolation prize!");
		}

	}
}
