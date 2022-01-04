//1. Write a program to accept a String from user and display the length of the string. Also display
//the string in uppercase and lowercase and check whether it is a palindrome or not.

package Q1;

import java.util.Scanner;

public class palendrom {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Userinput = scan.nextLine();
		palendrom s1 = new palendrom();
		s1.Checklen(Userinput);
		s1.palendromcheck(Userinput);
	}

	private void Checklen(String userinput) {
		System.out.println(userinput.length());
		System.out.println(userinput.toUpperCase());
		System.out.println(userinput.toLowerCase());
	}
	private void palendromcheck(String userinput) {
		char[] str = userinput.toCharArray();
		String store = null;
		for(int i = 0;i<=str.length-1;i++) {
			store = str[i]+store;
		}
		if(userinput==store) {
			System.out.println("given string is palendrom ");
		}
		else {
			System.out.println("this is not palendrom");
		}
	}
}

