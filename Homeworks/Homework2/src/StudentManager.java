
public class StudentManager {
	void add(Student student) {
		System.out.println(student.userName+" kullanıcısı eklendi");
	}

	void update(Student student) {
		System.out.println(student.userName+" kullanıcı bilgileri güncellendi");
	}
	
	void delete(Student student) {
		System.out.println(student.userName+" kullanıcısı silindi");
	}
}
