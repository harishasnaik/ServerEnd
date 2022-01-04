package Q1;

import java.util.*;

public class Listex {
	public static void main(String[] args) {
		String s1 = "k";
		String s2 = "A";
		String s3 = "R";
		String s4 = "T";
		String s5 = "H";
		List <String> list2 = new LinkedList();  
		list2.add(s1);
		list2.add(s2);
		list2.add(s3);
		list2.add(s4);
		list2.add(s5);
		showElements(list2);
	}
	
	
	public static void showElements(List<String> list){
		
		if(list.isEmpty() == true) {
			System.out.println("list is empty");
		}
		else {
			for(String s:list) {
				System.out.println("list data : "+s);
			}
		}
	}

}
