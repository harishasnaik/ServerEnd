package Q1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Q1.MapString;

public class TestMap {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		System.out.print("Enter id- ");
		int a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in); 
		System.out.print("Enter name- ");
		String b = sc1.next();
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(a, b);
		map.put(101, "swan");
		map.put(102, "ran");
		map.put(103, "fan");
		map.put(104, "ban");
		map.put(105, "gan");	
		map.put(106, "tan");
		MapString.viewElements(map);
		
	}
}

