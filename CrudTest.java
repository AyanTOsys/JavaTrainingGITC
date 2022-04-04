import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CrudTest {
 public static void main(String[] args) {
	 System.out.println("Trying to read persistence.xml file...");
	 
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
	 System.out.println("EntityManagerFactory created...");
	 
	 
	 EntityManager em=emf.createEntityManager();
	 System.out.println("EntityManager created...");
	 
	 EntityTransaction et=em.getTransaction();
	 System.out.println("EntityTransaction created...");
	 
	 System.out.println("Trying to save the record");
	 Employee theEmp=new Employee();
	 
	 theEmp.setEmployeeNumber(101);
	 theEmp.setName("Jack");
	 theEmp.setJob("Manager");
	 theEmp.setJoiningDate(LocalDate.of(2025, 5, 25));
	 theEmp.setSalary(50000);
	 
	
	 
	 et.begin();
	 em.persist(theEmp);
	 et.commit();
	 
	 System.out.println("Record created");
 }
}
