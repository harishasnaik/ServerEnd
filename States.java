package Q1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class States {
	DescendingOrderComparator d1 = new DescendingOrderComparator();
	private Set<String> states = new TreeSet();// Create Object, which is required for you
	

	public void addState(String name) {
		states.add(name);
	}

	public void viewStates() {
		System.out.println(states);
	}
	
	public static void main(String[] args) {
		String[] a = {"karnataka", "maharastra","kerla","a", "x"};
		States s1 = new States();
		for(String s:a) {
		s1.addState(s);
		}
		s1.viewStates();
	}

}
