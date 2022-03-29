import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ObjectArrayTest {

	public static void main(String[] args) {
//		Employee staff[]=new Employee[5];  //Normal Array
//		staff[0]=new Employee(101,"Shashi",50000);
//		staff[1]=new Employee(102,"Ayan",40000);
//		staff[2]=new Employee(103,"Nimya",50000);
//		staff[3]=new Employee(104,"KrishnaKumar",55000);
//		staff[4]=new Employee(105,"Suraj",50000);
		
		ArrayList<Employee> staffObj = new ArrayList<Employee>();
		staffObj.add(new Employee(101,"Vishal",50000));
		staffObj.add(new Employee(102,"Shashi",50000));
		staffObj.add(new Employee(103,"Ayan",50000));
		staffObj.add(new Employee(106,"Nimya",50000));
		staffObj.add(new Employee(106,"KK",50000));
		staffObj.add(new Employee(106,"Suraj",50000));
		
//		for(int i=0;i<staff.length;i++) {//Normal Array
//			System.out.println("staff"+staff[i]);
//			
//		}
		
		Iterator staffIterator = staffObj.iterator();
		while(staffIterator.hasNext()) {
			System.out.println("Staff:  "+staffObj);
			break;
		}
		
		TreeSet primeNumbers = new TreeSet();
		System.out.println("Adding 1 prime");
		primeNumbers.add(2);
		System.out.println("Adding 2 prime");
		primeNumbers.add(3);
		System.out.println("Adding 3 prime");
		primeNumbers.add(5);
		System.out.println("Adding 4 prime");
		primeNumbers.add(7);
		System.out.println("Adding 5 prime");
		primeNumbers.add(11);
		System.out.println("Adding 6 prime");
		primeNumbers.add(13);
		System.out.println("Added all the primes");
		
		Iterator primeIterator = primeNumbers.iterator();
		while(primeIterator.hasNext()) {
			int prime=(int)primeIterator.next();
			System.out.println("Prime :"+prime);
		}
	}

}

class Employee{
	int empNumber;
	String empName;
	float salary;
	public Employee(int empNumber, String empName, float salary) {
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
}
