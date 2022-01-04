package Q1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setname {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		String s1 = "karthik";
		String s2 = "kiran";
		String s3 = "riik";
		String s4 = "ram";
		String s5 = "ika";
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		System.out.println(set);
		Set<String>s = checkName(set, s1);
		System.out.println(s);
	}
	
	public static Set<String> checkName(Set<String> set, String name){
		Iterator<String> itr = set.iterator(); 
		boolean flag = false;
		while(itr.hasNext()) {
			if(itr.next().equals(name)) {
				flag = true;
			}
		}
		if(flag == true) {
			set.remove(name);
		}
		else {
			System.out.println("Name is not found");
		}
		return set;
	}
}

