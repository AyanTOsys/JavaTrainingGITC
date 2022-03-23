
public class AssignementDayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Here are the four types of functions....");
		
		branchIsOpen();
		
		updateNumber(45678);
		
		float updatedBal = updateBalance(1000.00f);
		System.out.println("Updated Balance is : "+updatedBal);
		
		float actualBalance = showBalance();
		System.out.println("Your Balance is : "+actualBalance);
	}
	
	static void branchIsOpen() {
		//Without Argument Without Return Value
		System.out.println("It's 10 AM. Branch is open now...");
	}
	
	static void updateNumber(int x) {
		//With Argument Without Return Value
		int mobNumber = 12345;
		mobNumber = x;
		System.out.println("Mobile Number Updated Successfully..");
	}
	
	static float updateBalance(float x) {
		//With Argument With Return Value
		float tillBalance = 9500.50f;
		float newBalance = tillBalance + x;
		return newBalance;		
	}
	
	static float showBalance() {
		//Without Argument With Return Value
		float balance = 7500.05f;
		return balance;
	}

}
