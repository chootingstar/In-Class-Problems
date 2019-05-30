import java.util.Scanner;
public class BubbleSort {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int[] array = new int[30];
		
		boolean swapp = true;
		System.out.println("Enter the number of numbers you are sorting up to 30");
		int loop = scan.nextInt();
		int len = loop;
		
		System.out.println("Enter the numbers");
		int i = 0;
		while(loop > 0) {
			array[i] = scan.nextInt();
			loop--;
			i++;
		}
		scan.close();
		
		System.out.println("Sorting...");
		int lastIndex = 0;
		while(swapp == true) {
			lastIndex += 1;
			swapp = false;
			int lef = 0;
		    int righ = 1;
		    //Previously the for loop was working from the last to the first, which the if statement logic
		    //was not equip to handle
				for(i = 0; i < len - lastIndex; i++) {
				        if(array[lef] > array[righ]) {
				            int temp = array[righ];
				            array[righ] = array[lef];
				            array[lef] = temp;
				           // System.out.println(temp);
				            swapp = true;
				        //I left the lef and righ counters on the inside of the if statement.
				        //making it impossible to continue without the statement being true.
				        }
				        lef += 1;
				        righ += 1;
				        //System.out.print(array[lef] + ", ");
				}
				//System.out.println("----");
			
		}
		
		System.out.println("Done! Your sorted list of numbers is:");
		//I had this for loop backwards too. I ended up with the correct answer backwards
		//When I realized this, I fixed it quickly and later realized my mistake above
		//This lead to me copying this for loop condition and modifying it to suit the needs
		//of the bubble logic
		for(i = 0; i < len; i++) {
			System.out.print(array[i] + ", ");
		}
		
	}
	

}
