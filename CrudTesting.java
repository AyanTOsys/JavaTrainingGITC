import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrudTesting {
	EntityManagerFactory emf;
	EntityManager em;
	
	public CrudTesting() {
		
		 System.out.println("Trying to read persistence.xml file...");
		 
		 emf=Persistence.createEntityManagerFactory("MyJPA");
		 System.out.println("EntityManagerFactory created...");
		 
		 
		 em=emf.createEntityManager();
		 System.out.println("EntityManager created...");
	}
	
	
	@Test
	public void createEmployeeTest() {
		 		 
		 EntityTransaction et=em.getTransaction();
		 System.out.println("EntityTransaction created...");
		 
		 System.out.println("Trying to save the record");
		 Employee theEmp=new Employee();
		 
		 theEmp.setName("Jacky");
		 theEmp.setJob("Clerk");
		 theEmp.setJoiningDate(LocalDate.of(2022, 1, 2));
		 theEmp.setSalary(15000);
		 
		
		 
		 et.begin();
		 em.persist(theEmp);
		 et.commit();
		 
		 System.out.println("Record created");
	 }
	
	@Test
	public void findEmpTest() {
		 
		 System.out.println("Trying to read the record");
		 Employee theEmp=em.find(Employee.class, 6);
		 Assertions.assertTrue(theEmp!=null);
		 System.out.println("Emp number:"+theEmp.getEmployeeNumber());
		 System.out.println("Emp name:"+theEmp.getName());
		 System.out.println("Emp job:"+theEmp.getJob());
		 System.out.println("Emp doj:"+theEmp.getJoiningDate());
		 System.out.println("Emp salary:"+theEmp.getSalary());

		 System.out.println("Record fetched");
	}
	
	@Test
	public void updateEmpTest() {
	 
		 EntityTransaction et=em.getTransaction();
		 System.out.println("EntityTransaction created...");
		 
		 System.out.println("Current record-----------");
		 Employee theEmp=em.find(Employee.class, 6);
		 Assertions.assertTrue(theEmp!=null);
		 System.out.println("Emp number:"+theEmp.getEmployeeNumber());
		 System.out.println("Emp name:"+theEmp.getName());
		 System.out.println("Emp job:"+theEmp.getJob());
		 System.out.println("Emp doj:"+theEmp.getJoiningDate());
		 System.out.println("Emp salary:"+theEmp.getSalary());
		 
		 et.begin();
		 	theEmp.setName("Jakson");
		 	theEmp.setJob("Sr Clerk");
		 	theEmp.setSalary(theEmp.getSalary()+1000);
		  	em.merge(theEmp);
		 et.commit();
		 
		 System.out.println("Record updated as below...");
		 System.out.println("Emp number:"+theEmp.getEmployeeNumber());
		 System.out.println("Emp name:"+theEmp.getName());
		 System.out.println("Emp job:"+theEmp.getJob());
		 System.out.println("Emp doj:"+theEmp.getJoiningDate());
		 System.out.println("Emp salary:"+theEmp.getSalary());
	}
	
	@Test
	public void findAllEmpTest() {
	
		 Query q=em.createQuery("from Employee");
		 List<Employee> staffList=q.getResultList();
		 
		 Assertions.assertTrue(staffList.size()>0);
		 
		 for (Employee theEmp : staffList) {
			 System.out.println("Emp number:"+theEmp.getEmployeeNumber());
			 System.out.println("Emp name:"+theEmp.getName());
			 System.out.println("Emp job:"+theEmp.getJob());
			 System.out.println("Emp doj:"+theEmp.getJoiningDate());
			 System.out.println("Emp salary:"+theEmp.getSalary());
			 System.out.println("==============================================");
		}	 
		 
	}
}
