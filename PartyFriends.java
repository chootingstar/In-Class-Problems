import java.util.ArrayList;
import java.util.Scanner;

public class PartyFriends {
	
	public static void main(String args[]) {
		System.out.println(" How many friends are there?");
		ArrayList<String> friends = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("\n \n Great! Now type in their names one at a time!");
		friends.add(iterationInator(n-1));
		
		System.out.println("Wait wait wait! You can't invite that many people!"
				+ "\n Your going to need to eliminate some friends from the list."
				+ "\n Don't worry, just tell me the some information for getting"
				+ "\n rid of your friends! First the number of rounds of elimination"
				+ "\n to cycle through. Second you'll tell me the number we'll count to every nth"
				+ "\n friend to eliminate. Third you'll type another number to eliminate every"
				+ "\n inth friend and so on. \n \n How many elimination rounds will their be?");
		ArrayList<Integer> eliminate = new ArrayList<Integer>();
		int r = s.nextInt();
		for(int nth = r; nth >= 1; nth--) {
			System.out.println("Which every 'nth' friend will we eliminate this round?");
			eliminate.add(s.nextInt());
		}
		s.close();
		
		for(int m = 0; m <= r-1; m++) {
			friends.remove(eliminate.get(m));
		}
		System.out.println("Done");
	}

	public static String iterationInator(int x) {
		Scanner k = new Scanner(System.in);

		k.next();
		System.out.println(x);

	}

}
