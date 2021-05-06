
public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.id=1;
		student1.name="Özge";
		student1.lastName="İnan";
		student1.userName="ocimiks";
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		
		Course course1=new Course(1, "C#", 12.1);
		Course course2=new Course(1, "JAVA REACT", 6.3);
		
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course2);
	}

}
