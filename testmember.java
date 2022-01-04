package Q1;

import java.util.Scanner;

public class testmember {
public static void main(String[] args) {
		
		int ch = 1;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		MemberConatiner mc = new MemberConatiner();
		while(ch!=6)
		{
			System.out.println("\nEnter One of the Following Options");
			System.out.println("\n1.Addmember\n"+"2.deleteMember\n"+ "3.SearchById\n"+ "4.searchByNameAndId\n"+"5.displaySortingOrder\n"+ "6.exit ");
			ch = sc1.nextInt();
			
			switch(ch)
			{
				case 1 : System.out.println("\n Enter Member Name , City and Country");
						String name = sc2.next();
						String city = sc1.next();
						String country =  sc2.next();
						mc.addMember(name, city, country);
						mc.displayList();
						break;
				case 2 : System.out.println("\nEnter the Id to Delete Member");
						 String id = sc1.next();
						 mc.deleteMember(id);
						 break;
				case 3 : System.out.println("\nEnter The Id to Search the Members");
						 id = sc2.next();
						 mc.searchById(id);
						 break;
				case 4 : System.out.println("\nEnter the Name and Id to be Searched");
						 name = sc1.next();
						 id = sc2.next();
						 mc.searchMember(id, name);
						 break;
				case 5 : System.out.println("\nEnter the sorting order to view the members 'Asen' or 'Desen'");
						 String sort = sc1.next();
						 mc.displaySortingOrder(sort);
						 break;
				case 6 : System.out.println("Exit");
						 break;
			}
		}
	}

}