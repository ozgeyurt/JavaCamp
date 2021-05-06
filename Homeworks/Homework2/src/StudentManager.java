
public class StudentManager {
	void add(Student student) {
		System.out.println(student.userName+" kullanýcýsý eklendi");
	}

	void update(Student student) {
		System.out.println(student.userName+" kullanýcý bilgileri güncellendi");
	}
	
	void delete(Student student) {
		System.out.println(student.userName+" kullanýcýsý silindi");
	}
}
