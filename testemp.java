package Q1;

public class testemp {
	public static void main(String[] args) {
		emp1 e1 = new emp1("kav", "soft", 1);
		emp1 e2 = new emp1("kav1", "soft", 2);
		empcontainer e = new empcontainer();
		e.addEmployee(e2);
		e.addEmployee(e1);
		e.viewEmployees();
		e.deleteEmployee(1);
		e.viewEmployees();
	}
}
