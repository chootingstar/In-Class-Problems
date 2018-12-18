
public class evenlyDivisable {
	public static String stuff(String args[]) {
	int num1 = 17;
			
	int num2 = 7;
	String action;
	if(num1%num2 == 0) {
	action =	"Even Steven";
	} else {
		action = "Odd Todd";
	}
	
	return action;
	
}
	public static void main(String[] args) {
		String bob = stuff(args);
		System.out.println(bob);
	}
}