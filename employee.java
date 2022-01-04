package Q1;

public class employee {

	public static void main(String[] args) {
		display obj= new display();
		obj.id=401;
		obj.name="harish";
		obj.salary=1000;
		obj.dis();
		display obj1= new display();
		obj1.id=407;
		obj1.name="subhash";
		obj1.salary=20000;
		obj1.dis();

	}

}

class display{
	int id;
	String name;
	int salary;
	public void dis() {
		System.out.println(" name : " + name +"\n"+ " salary : " + salary +"\n"+ " id : " + id);
	}
}
