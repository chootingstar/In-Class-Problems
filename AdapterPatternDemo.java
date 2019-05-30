// Creating an ApaperPatternDemo class (CLIENT class)
// AdapterPatternDemo.java

public class AdapterPatternDemo{
	public static void main(String[] args) {
		CreditCard targetInterface = new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());	
	}
} // End of the the BankCustomer class