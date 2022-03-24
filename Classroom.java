import javax.management.remote.SubjectDelegationPermission;

public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Teacher tObj1 = new Teacher();
//		Teacher tObj2 = new Teacher();
		
//		TeacherQualification qualObj1 = new TeacherQualification();
//		qualObj1.teaching();
//		qualObj1.setTeacherDetails("Java", "Ayan Ghosh", 8, "B.Tech");
		
//		tObj1.teaching();
		
//		tObj1.setTeacherDetails("Java", "Vishshal", 9);
//		tObj2.setTeacherDetails("C++","Vignesh", 7.5f);
		
		TeacherFees tfObj = new TeacherFees("Java", "Ayan", 8, "B.Tech", 6);
		
	}

}

class Teacher{
	
	private String subject;
	private String teacherName;
	private float teachingTime;
	
	void teaching() {
		System.out.println("Teachers have started offline classes..");
	}
	
	
	public Teacher(String subject, String teacherName, float teachingTime) {
		super();
		this.subject = subject;
		this.teacherName = teacherName;
		this.teachingTime = teachingTime;		
	}


	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", teacherName=" + teacherName + ", teachingTime=" + teachingTime + "]";
	}


//	void setTeacherDetails(String subject, String teacherName, float teachingTime) {
//		this.subject = subject;
//		this.teacherName = teacherName;
//		this.teachingTime = teachingTime;			
//	}
}

class TeacherQualification extends Teacher{
	private String qualification;
	
	
	public TeacherQualification(String subject, String teacherName, float teachingTime, String qualification) {
		super(subject, teacherName, teachingTime);
		this.qualification = qualification;
	}


	@Override
	public String toString() {
		return "TeacherQualification [qualification=" + qualification + "]";
	}


//	void setTeacherDetails(String subject, String teacherName, float teachingTime,String qualification) {
//		super.setTeacherDetails(subject, teacherName, teachingTime);
//		this.qualification = qualification;		
//	}
}

class TeacherFees extends TeacherQualification{
	private float experienceInYears;
	private float salaryPerDay;
	


	public TeacherFees(String subject, String teacherName, float teachingTime, String qualification,
			float experienceInYears) {
		super(subject, teacherName, teachingTime, qualification);
		this.experienceInYears = experienceInYears;
		if (experienceInYears > 10)
			salaryPerDay = 2000;
		else if (experienceInYears > 5)
			salaryPerDay = 1000;
		else
			salaryPerDay = 500;
		
		System.out.println("Teacher Details are captured successfully as below..");
		System.out.println("Subject                         : "+subject);
		System.out.println("Name of Teacher                 : "+teacherName);
		System.out.println("Time can be spent in institute  : "+teachingTime+" Hours");
		System.out.println("Teacher qualification is        : "+qualification);
		System.out.println("Projected salary per day will be: "+salaryPerDay);
		
		
	}



	@Override
	public String toString() {
		return "TeacherFees [experienceInYears=" + experienceInYears + ", salaryPerDay=" + salaryPerDay + "]";
	}

	


//	void setTeacherDetails(String subject, String teacherName, float teachingTime,String qualification, float experienceInYears) {
//		super.setTeacherDetails(subject, teacherName, teachingTime, qualification);
//		this.experienceInYears = experienceInYears;
//		
//		if (experienceInYears > 10)
//			salaryPerDay = 2000;
//		else if (experienceInYears > 5)
//			salaryPerDay = 1000;
//		else
//			salaryPerDay = 500;
//		
//		System.out.println("Teacher Details are captured successfully as below..");
//		System.out.println("Subject                         : "+subject);
//		System.out.println("Name of Teacher                 : "+teacherName);
//		System.out.println("Time can be spent in institute  : "+teachingTime+" Hours");
//		System.out.println("Teacher qualification is        : "+qualification);
//		System.out.println("Projected salary per day will be: "+salaryPerDay);
//	}
}
