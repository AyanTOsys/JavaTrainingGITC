
public class Contacts {
	String contactname;
	double mobileNumber;
	String emailAddress;
	public Contacts(String contactname, double mobileNumber, String emailAddress) {
		super();
		this.contactname = contactname;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public double getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "Contacts [contactname=" + contactname + ", mobileNumber=" + mobileNumber + ", emailAddress="
				+ emailAddress + "]";
	}
	
}
