
public class Main {

	public static void main(String[] args) {
		
		  User user=new User();
	        user.setId(1);
	         user.setEmail("ozge.yurt@gmail.com");
	        user.setPassword("345rtyuty");
	         UserManager userManager=new UserManager();
	        userManager.add(user);
	        
	       
	        
	        Student student=new Student();
	        student.firstName="�zge";
	        student.lastName="�nan";
	        StudentManager studentManager=new StudentManager();
	        studentManager.delete(student);
	        
	        Course course= new Course();
	        course.courseName="C#";
	       CourseManager courcesManager=new CourseManager();
	       courcesManager.add(course);
	       
	       Instructor  instructor=new Instructor();
	       instructor.setFirstName("Engin");
	       instructor.setLastName("Demiro�");
	       instructor.setEmail("engindemiro��@gmail.com");
	       instructor.setPassword("789456");
	       InstructorManager instructorManager= new InstructorManager();
	       instructorManager.update(user);
	        
	    
	}

}
