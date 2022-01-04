package Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testphone {
	public static void main(String[] args) {
		phonebook contacts = new phonebook();
		Scanner sc1 = new Scanner(System.in);
		int ch = 0;
		while (ch != 3) {
			System.out.println("Press 1 to add Phone Number");
			System.out.println("Press 2 to get User Name");
			System.out.println("Press 3 to exit ");
			System.out.println("");
			ch = sc1.nextInt();
			{
				switch (ch) {
				case 1:
					String str;
					String str1;
					Scanner sc2 = new Scanner(System.in);
					System.out.println("Enter the Phone Number");
					str = sc2.nextLine();
					Scanner sc3 = new Scanner(System.in);
					System.out.println("Enter the User Name");
					str1 = sc3.nextLine();
					contacts.addDetails(str, str1);
					break;
				case 2:
					Scanner sc4 = new Scanner(System.in);
					System.out.println("Enter the Phone Number");
					String number = sc4.nextLine();
					String res = contacts.getName(number);
					System.out.println("User Name of the give number is : "+res);
					break;
				case 3:
					break;
				}
			}
		}
	}
}
