
public class WeddingExceptionTest {

	public static void main(String[] args) {
		System.out.println("Begin Main...");
		try {
			Wedding wedObj = new Wedding("Sita", 18, "Ram", 21);
			System.out.println("Welcome to wedding ceremony between.."+wedObj);
		} 
		catch (BrideNotFoundException e) {
			System.out.println("Exception handler 1 will handle this..");
			e.printStackTrace();
		} 
		catch (BridegroomNotFoundException e) {
			System.out.println("Exception handler 2 will handle this..");
			e.printStackTrace();
		} 
		catch (BrideUnderAgeException e) {
			System.out.println("Exception handler 3 will handle this..");
			e.printStackTrace();
		} 
		catch (BridegroomUnderAgeException e) {
			System.out.println("Exception handler 4 will handle this..");
			e.printStackTrace();
		} 
		catch (BrideNameInvalidException e) {
			System.out.println("Exception handler 5 will handle this..");
			e.printStackTrace();
		} 
		catch (BridegroomNameInvalidException e) {
			System.out.println("Exception handler 6 will handle this..");
			e.printStackTrace();
		}
		
		System.out.println("End Main..");
	}

}
class BrideNotFoundException extends Exception{
	
	public BrideNotFoundException(String str) {
		super(str);
	}
}
class BridegroomNotFoundException extends Exception{
	
	public BridegroomNotFoundException(String str) {
		super(str);
	}
}

class BrideUnderAgeException extends Exception{
	
	public BrideUnderAgeException(String str) {
		super(str);
	}
}
class BridegroomUnderAgeException extends Exception{
	
	public BridegroomUnderAgeException(String str) {
		super(str);
	}
}
class BrideNameInvalidException extends Exception{
	BrideNameInvalidException(String str){
		super(str);
	}
}
class BridegroomNameInvalidException extends Exception{
	BridegroomNameInvalidException(String str){
		super(str);
	}
}

class Wedding{
	String brideName;
	String bridegroomName;
	int brideAge;
	int bridegroomAge;
	public Wedding(String brideName,int brideAge, String bridegroomName,int bridegroomAge) throws BrideNotFoundException,BridegroomNotFoundException,BrideUnderAgeException,BridegroomUnderAgeException, BrideNameInvalidException, BridegroomNameInvalidException{
		super();
		System.out.println("Wedding Ctor started...");
		
		
		if (brideName.isEmpty())
			throw new BrideNotFoundException("Please enter bride name..");
		else if (brideName.matches("[a-zA-Z]+"))
			this.brideName = brideName;
		else 
			throw new BrideNameInvalidException("Enter valid bride name..");
		
		
		
		if (bridegroomName.isEmpty())
			throw new BridegroomNotFoundException("Please enter bridegroom name..");
		else if (bridegroomName.matches("[a-zA-Z]+"))
			this.bridegroomName = bridegroomName;
		else 
			throw new BridegroomNameInvalidException("Enter valid bridegroom name..");
		
		
		if (brideAge < 18)
			throw new BrideUnderAgeException("Bride can not be under 18");
		else 
			this.brideAge = brideAge;
		
		
		if (bridegroomAge < 21)
			throw new BridegroomUnderAgeException("Bridegroom can not be under 21");
		else 
			this.bridegroomAge = bridegroomAge;
		
		System.out.println("Wedding Ctor finished...");
		
	}
	@Override
	public String toString() {
		return "[Bride=" + brideName + ", Bride Age=" + brideAge+", Bridegroom=" + bridegroomName + 
				 ", BridegroomAge=" + bridegroomAge + "]";
				
		
	}		
}