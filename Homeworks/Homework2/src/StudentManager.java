
public class StudentManager {
	void add(Student student) {
		System.out.println(student.userName+" kullan�c�s� eklendi");
	}

	void update(Student student) {
		System.out.println(student.userName+" kullan�c� bilgileri g�ncellendi");
	}
	
	void delete(Student student) {
		System.out.println(student.userName+" kullan�c�s� silindi");
	}
}
