
public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher tObj1 = new Teacher();
		Teacher tObj2 = new Teacher();
		
		tObj1.teaching();
		
		tObj1.setTeacherDetails("Java", "Vishshal", 9);
		tObj2.setTeacherDetails("C++","Vignesh", 7.5f);
	}

}

class Teacher{
	
	private String subject;
	private String teacherName;
	private float teachingTime;
	
	void teaching() {
		System.out.println("Teachers have started offline classes..");
	}
	
	void setTeacherDetails(String x, String y, float z) {
		subject = x;
		teacherName = y;
		teachingTime = z;
		System.out.println("Teacher Details are captured successfully as below..");
		System.out.println("Subject                         : "+subject);
		System.out.println("Name of Teacher                 : "+teacherName);
		System.out.println("Time can be spent in institute  : "+teachingTime+" Hours");
		System.out.println("-----------------------------------------------");
	}
}
