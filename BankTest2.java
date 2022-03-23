import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc baObj1 = new BankAcc();
		BankAcc baObj2 = new BankAcc();
		BankAcc baObj3 = new BankAcc();
		
		baObj1.openBankAccount(1001, "Ayan", 1000.0f, 94322, LocalDate.of(2013, 5, 6), LocalDate.of(1989, 9, 24));
		baObj2.openBankAccount(1002, "Shashi", 2000.0f, 94444, LocalDate.of(2015, 5, 6), LocalDate.of(1993, 1, 22));
		baObj3.openBankAccount(1003, "Ashish", 1000.0f, 99555, LocalDate.of(2018, 5, 6), LocalDate.of(1988, 10, 24));
		
		/*
		baObj1.printBankDetails();
		baObj2.printBankDetails();
		baObj3.printBankDetails();
		
		baObj1.printBankDetails();
		baObj1.changeAccountHolderName("AYAN GHOSH");
		
		*/
//		baObj1.printBankDetails();
//		
//		baObj1.deposit(5000);
//		baObj1.printBankDetails();
//		
//		baObj1.withdraw(8000);
	}

}

class BankAcc{
	//Global variables
	private int accNumber;
	private String accName;
	private float accBalance;
	private int mobNumber;
	private LocalDate accOpeningDate;
	private LocalDate accHolderBirthdate;
	private int age;
	

	
	void openBankAccount(int accNumber,String accName,float accBalance,int mobNumber,LocalDate accOpeningDate, LocalDate accHolderBirthdate) {
		this.accNumber = accNumber;
		this.accName = accName;
		this.accBalance = accBalance;
		this.mobNumber = mobNumber;
		this.accOpeningDate = accOpeningDate;
		this.accHolderBirthdate = accHolderBirthdate;
		
		LocalDate todaysDate = LocalDate.now();
		this.age = todaysDate.getYear() - accHolderBirthdate.getYear();
	}
	
	
	void printBankDetails() {
		float simpInt = calcSimpleInt();
		
		System.out.println("Account Number              : "+accNumber);
		System.out.println("Account Holder              : "+accName);
		System.out.println("Account Balance             : "+accBalance);
		System.out.println("Customer mobile             : "+mobNumber);
		System.out.println("Customer Account Opened On  : "+accOpeningDate);
		System.out.println("Customer Date of Birth      : "+accHolderBirthdate);
		System.out.println("Customer Age is             : "+age);
		System.out.println("Simple Interest in the acc  :"+simpInt);
		System.out.println("-------------------------------");
	}
	
	private float calcSimpleInt() {
		float si = (accBalance * 1 * 3.7f) / 100;
		return si;
	}
	
	void changeAccountHolderName(String newName) {
		System.out.println("changing the account holder's name to "+newName);
		accName = newName;
	}
	
	float withdraw(float amtToWithdraw) {
		System.out.println("Withdrawing Rs."+amtToWithdraw);
		
		if(amtToWithdraw>accBalance){
			System.out.println("Insufficient Funds!!");
		}
		else {
			accBalance = accBalance - amtToWithdraw;
		}
		return amtToWithdraw;
	}
	
	float deposit(float amtToDeposit) {
		System.out.println("Depositing Rs."+amtToDeposit);
		
		if(amtToDeposit>=50000) {
			System.out.println("Please produce your income proof!!");
		}
		else {
			accBalance = accBalance + amtToDeposit;
		}
		return amtToDeposit;
	}
}

class MovieTicket{
	private int ticketNumber;
	private String movieName;
	private float ticketCost;
	private int seatNumber;
	private LocalDateTime movieDateTime;
	
	public void setMovieTicket(int ticketNumber, String movieName, float ticketCost, int seatNumber,
			LocalDateTime movieDateTime) {
		this.ticketNumber = ticketNumber;
		this.movieName = movieName;
		this.ticketCost = ticketCost;
		this.seatNumber = seatNumber;
		this.movieDateTime = movieDateTime;
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public float getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(float ticketCost) {
		this.ticketCost = ticketCost;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public LocalDateTime getMovieDateTime() {
		return movieDateTime;
	}

	public void setMovieDateTime(LocalDateTime movieDateTime) {
		this.movieDateTime = movieDateTime;
	}

	@Override
	public String toString() {
		return "MovieTicket [ticketNumber=" + ticketNumber + ", movieName=" + movieName + ", ticketCost=" + ticketCost
				+ ", seatNumber=" + seatNumber + ", movieDateTime=" + movieDateTime + "]";
	}
}