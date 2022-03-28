import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.BadStringOperationException;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I started for office");
		System.out.println("I am booking an Ola cab");
		Scanner scan = new Scanner(System.in);

		
		
		try {
			System.out.println("Enter pickup location:");
			String pickup = scan.next();
			System.out.println("From : "+ pickup);
			
			System.out.println("Enter drop location:");
			String drop = scan.next();
			System.out.println("To:"+drop);
			
			System.out.println("Cab booked..");
		}

		catch(InputMismatchException e) {
			System.out.println("Please select from available locations");
		}
		catch(RuntimeException e) {
			System.out.println("Im here for any runtime exception");
		}
		catch(Exception e) {
			System.out.println("Im here for any exception");
		}
		catch(Throwable e) {
			System.out.println("Im here for any error/exception");
		}
	}

}
