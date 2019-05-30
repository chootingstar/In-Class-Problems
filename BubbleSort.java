import java.util.Scanner;
public class BubbleSort {
	public static void main(String args[]) {
		int[] array = new int[30];
		
		boolean swapp = true;
		System.out.println("Enter the number of numbers you are sorting up to 30");
		int loop = scaning();
		
		System.out.println("Enter the numbers");
		int i = 0;
		while(loop > 0) {
			array[i] = scaning();
			loop--;
			i++;
		}
		
		System.out.println("Sorting...");
		int lastIndex = 0;
		while(swapp == true) {
			lastIndex += 1;
			swapp = false;
			int lef = 0;
		    int righ = 1;
				for(i = array.length - lastIndex;;) {
				        if(array[lef] > array[righ]) {
				            int temp = array[righ];
				            array[righ] = array[lef];
				            array[lef] = temp;
				            swapp = true;
				        lef += 1;
				        righ += 1;
				        }
				}
			
		}
		
		System.out.println("Done! Your sorted list of numbers is:\n" + array);
	}
	
	static int scaning() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
}
