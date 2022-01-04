package Q1;

public class Employee1 {

	private static final int sal = 20000;
	public static void main(String[] args) {
		int id = 101;
		String name="harish";
		float sal=20000;
		Employee1 e1=new Employee1();

		e1.display(id,name);
		e1.display(id, name,sal);
		
	}
	void display(int a,String b){
		System.out.println("name : "+a + "id : "+ b + "salary : " + this.sal);
	}
	void display(int a,String b,float c) {
		System.out.println("name : "+a + "id : "+ b + "salary : "+ c);
	}
}
