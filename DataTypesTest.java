
public class DataTypesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte playerNumber=10;
		System.out.println("Player Number :"+playerNumber);
		System.out.println("Byte min value:"+Byte.MIN_VALUE);
		System.out.println("Byte max value:"+Byte.MAX_VALUE);
		System.out.println("Byte size is  :"+Byte.SIZE+"bits");
		System.out.println("----------------------------------");
		
		short rollNumber=12312;
		System.out.println("Roll Number    :"+rollNumber);
		System.out.println("Short min value:"+Short.MIN_VALUE);
		System.out.println("Short max value:"+Short.MAX_VALUE);
		System.out.println("Short size is  :"+Short.SIZE+"bits");
		System.out.println("----------------------------------");
		
		int consumerNumber=2147483647;
		System.out.println("Consumer Number    :"+consumerNumber);
		System.out.println("Integer min value  :"+Integer.MIN_VALUE);
		System.out.println("Integer max value  :"+Integer.MAX_VALUE);
		System.out.println("Integer size is    :"+Integer.SIZE+"bits");
		System.out.println("----------------------------------");
		
		long mobileNumber=9494949494l;
		System.out.println("Mobile Number :"+mobileNumber);
		System.out.println("Long min value:"+Long.MIN_VALUE);
		System.out.println("Long max value:"+Long.MAX_VALUE);
		System.out.println("Long size is  :"+Long.SIZE+"bits");
		System.out.println("----------------------------------");
		
		float interestRate=3.7f;
		System.out.println("Interest Rate :"+interestRate);
		System.out.println("float min value:"+Float.MIN_VALUE);
		System.out.println("float max value:"+Float.MAX_VALUE);
		System.out.println("float size is  :"+Float.SIZE+"bits");
		System.out.println("----------------------------------");
		
		double divisionResult=3.333333333d;
		System.out.println("Division result :"+divisionResult);
		System.out.println("Byte min value  :"+Double.MIN_VALUE);
		System.out.println("Byte max value  :"+Double.MAX_VALUE);
		System.out.println("Byte size is    :"+Double.SIZE+"bits");
		System.out.println("----------------------------------");
		
		char itemGroup='A';
		System.out.println("Item Group    :"+itemGroup);
		System.out.println("Char min value:"+Character.MIN_VALUE);
		System.out.println("Char max value:"+Character.MAX_VALUE);
		System.out.println("Char size is  :"+Character.SIZE+"bits");
		System.out.println("----------------------------------");
		
		boolean isCertifiedInJava=false;
		System.out.println("Java Certified   :"+isCertifiedInJava);
		
		if(isCertifiedInJava) 
		System.out.println("Wow! Certified in Java!!");
		
		else
		System.out.println("You can become java certified");
	}

}
