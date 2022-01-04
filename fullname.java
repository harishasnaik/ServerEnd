package Q1;

import java.util.Scanner;

public class fullname {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		String result = null;
		String Store = name.replaceAll(" ","-");
		System.out.print(Store);
	}
}
