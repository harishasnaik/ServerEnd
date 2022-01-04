package Q1;

public class Student {

	private static int count;
	
	public Student()   
	{  
	// increase the count variable by 1  
	count++;  
	}  

	public static void main(String[] args) {
		int id = 10;
		String name="harish";
		String address ="malgi";
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		s1.display(id,name,address);
		s2.display(id,name,address);
		s3.display(id,name,address);
		s4.display(id,name,address);
		System.out.println("number of object - > : "+Student.count);
	}

	void display(int id,String name,String address) {
		
		System.out.println("id->" + id + "name - > " + name + "address -> " + address);
		
		
	}


}
