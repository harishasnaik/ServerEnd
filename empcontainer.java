package Q1;

import java.util.HashSet;
import java.util.Set;

public class empcontainer {

	Set<emp1> set = new HashSet<emp1>();

	void addEmployee(emp1 emp) {
		if (set.contains(emp)) {
			System.out.println(" employee already exists");
		} else {
			set.add(emp);
		}
	}

	void deleteEmployee(int empno) {
		for (emp1 e : set) {
			if (e.getEmpNo() == empno) {
				set.remove(e);
				return;
			}
		}
		System.out.println("Sorry! Employee is not found");

	}

	void viewEmployee(int empno) {
		for (emp1 e : set) {
			if (e.getEmpNo() == empno) {
				System.out.println(e);
				return;
			}
		}
		System.out.println("Sorry! Employee is not found");
	}

	void viewEmployees() {
		if (set.size() == 0) {
			System.out.println("No elements are added to the Set");
		} else {
			System.out.println(set);
		}
	}
}