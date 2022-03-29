import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class MobileCollectionTest {

	public static void main(String[] args) {
		
		//Arraylist for Call logs start
		ArrayList<CallLog> callObj=new ArrayList<CallLog>();
		
		callObj.add(new CallLog("Missed","Baba",LocalDate.of(2022, 3, 11)));
		callObj.add(new CallLog("Received","Ma",LocalDate.of(2022, 3, 16)));
		callObj.add(new CallLog("Dialled","Wife",LocalDate.of(2022, 3, 24)));
		
		Iterator logIterator=callObj.iterator();
		while(logIterator.hasNext()) {
			System.out.println("Call logs: "+callObj);
			break;
		}
		//Arraylist for Call logs end
		
		//Linkedlist for Contacts start
		LinkedList<Contacts> contactObj=new LinkedList<Contacts>();
		
		contactObj.add(new Contacts("Baba", 8961653494d , "abcd@gmail.com"));
		contactObj.add(new Contacts("Ma", 8999969894d , "xyz@gmail.com"));
		contactObj.add(new Contacts("Wife", 4649797943d , "weqweqe@gmail.com"));
		
		Iterator contactIterator = contactObj.iterator();
		while(contactIterator.hasNext()) {
			System.out.println("Contacts: "+contactObj);
			break;
		}
		//Linkedlist for Contacts end
		
		
		//HashSet for ChemicalElements start
		HashSet<ChemicalElement> chemObj = new HashSet<ChemicalElement>();
		chemObj.add(new ChemicalElement(1,"Hydrogen","H",1.00797f));
		chemObj.add(new ChemicalElement(2,"Helium","He",4.00260f));
		chemObj.add(new ChemicalElement(3,"Lithium","Li",6.941f));
		
		Iterator chemIterator=chemObj.iterator();
		while(chemIterator.hasNext()) {
			System.out.println("Chemical elements: "+chemObj);
			break;
		}
		//HashSet for ChemicalElements end
		
		
		//TreeSet for ChemicalElements start
		TreeSet<Book> bookObj=new TreeSet<Book>();
		bookObj.add(new Book(973264664644d,"Immortals of Meluha","Amish Tripathi",400,1,525));
		bookObj.add(new Book(972453553554d,"Secrets of Nagas","Amish Tripathi",375,1,475));
		bookObj.add(new Book(973290990644d,"Oath of Vayuputras","Amish Tripathi",465,1,600));
		
		Iterator bookIterator=bookObj.iterator();
		while(bookIterator.hasNext()) {
			System.out.println("Books: "+bookObj);
			break;
		}
	}

}
