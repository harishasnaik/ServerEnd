package Q1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lowercase {

	public static void main(String[] args) {
		String[] names = { "karthik", "keerthi", "shamsuddin", "harish" };
		String[] arr = getResults(names);
		for (String ar : arr) {
			System.out.println(ar);
		}
	}

	public static String[] getResults(String names[]) {
		List<String> l1 = new LinkedList();
		List<String> l2 = new LinkedList();
		for (String s : names) {
			l1.add(s);
		}
		Collections.sort(l1);
	
		int len = l1.size();
		for(int i = 0;  i<len; i++) {
			String s = l1.get(i);
			if (i < len / 2) {
				l2.add(s.toLowerCase());
			} else {
				l2.add(s.toUpperCase());
			}
		}
		String[] res = l2.stream().toArray(String[]::new);
		return res;
	}
}