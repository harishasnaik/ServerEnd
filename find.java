package Q1;

import java.util.Scanner;

public class find {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String find = scan.nextLine();
		String userinput = scan.nextLine();
		String[] words = find.split(" ");
		boolean flag = false;
		int count = 0;
		for(String value:words) {
			count +=1;
			if(value.equals(userinput)) {
				System.out.println("hai");
				flag = true;
				break;
			}
		}
		if(flag == true){
		System.out.println("found at position in "+ count);
		}else
		{
			System.out.println("not found");
		}
	}
}
