package Q1;

import java.util.HashMap;
import java.util.Map;

public class Students {
	public static int id = 10000;

	private String name, email, course;

	static Map<Integer, Students> map = new HashMap();

	public Students(String name, String email, String course) {
		super();
		this.name = name;
		this.email = email;
		this.course = course;
		id++;
		addStudent(this);
	}

	public static void addStudent(Students s) {
		map.put(id, s);
	}

	public static int getId() {
		return id;
	}

	public static void viewStudents() {
		System.out.println(map);
	}

	public static void viewStudent(Integer id) {
		if (map.containsKey(id)) {
			System.out.println(map.get(id));
		}
		else {
			System.out.println("Student no present");
		}
	}
	@Override
	public String toString() {
		return "name=" + name + ", email=" + email + ", course=" + course + "";
	}

	public static void main(String[] args) {
		Students s1 = new Students("karthik", "kv@gmail.com", "mechanical");
		Students s2 = new Students("Shams", "sham@gmail.com", "cs");
		Students s3 = new Students("harish", "harish@gmail.com", "cs");
		Students.viewStudents();
		Students.viewStudent(10002);
		System.out.println(Students.getId());

	}
}

