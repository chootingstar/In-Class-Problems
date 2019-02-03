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
		if (month == 2) {

			dayOfMonth += 31;

		} else if (month == 3) {

			dayOfMonth += 59;

		} else if (month == 4) {

			dayOfMonth += 90;

		} else if (month == 5) {

			dayOfMonth += 31 + 28 + 31 + 30;

		} else if (month == 6) {

			dayOfMonth += 31 + 28 + 31 + 30 + 31;

		} else if (month == 7) {

			dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30;

		} else if (month == 8) {

			dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31;

		} else if (month == 9) {

			dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;

		} else if (month == 10) {

			dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;

		} else if (month == 11) {

			dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;

		} else if (month == 12) {

			dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31;

		}
		if(year%4 == 0) {
			if(month >= 2) dayOfMonth += 1;
		}

		return dayOfMonth;

	}
}
