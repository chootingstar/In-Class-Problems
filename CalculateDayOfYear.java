import java.util.Scanner;

public class CalculateDayOfYear {
	static int thisMonth;
	static int thisDay;
	static int thisYear;
	
	public static void main(String [] args) {
		System.out.println("Want to know what day of the year it is? \n Then type in the month day and year followed by the enter/return key");
		Scanner dan = new Scanner(System.in);
		thisMonth = dan.nextInt();
		thisDay = dan.nextInt();
		thisYear = dan.nextInt();
		dan.close();
		
		int doy = dayOfYear(thisMonth, thisDay, thisYear);
		
		String sD;
		int mod = doy%10; //This works to find the last digit because the remainder of the number is always the last digit.
		//Learned that from an answer to a question Similar to mine
		switch(mod) {
		case 1:
		sD = "st";
			break;
		case 2:
			sD = "nd";
			break;
		case 3:
			sD = "rd";
			break;
		default:
			sD = "th";
		}
		
		System.out.println("It is the " + doy + sD + " day of the year " + thisYear);
	}
	
	public static int dayOfYear(int month, int dayOfMonth, int year) {
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		
		for(int m = 0; m < month-1; m++) {
//			System.out.print(dayOfMonth + " ");
			dayOfMonth += months[m];
//			System.out.print(dayOfMonth + " ");
			//Needed some sysouts to tell me what was happening with the math
		}
		if(year%4 == 0) {
			if(month >= 2) dayOfMonth += 1;//For leap years of course. Thankfully all of those years are divisable by 4
		}

		return dayOfMonth;

	}
}
