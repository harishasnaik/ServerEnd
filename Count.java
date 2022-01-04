package Q1;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String user = scan.nextLine();
		char [] temp= user.toCharArray();
		int space = 0;
		int number = 0;
		int letter =0;
		for(int i=0;i<user.length()-1;i++) {
			if (Character.isDigit(temp[i])) {
				number +=1;
			}
			else if (Character.isSpaceChar(temp[i])) {
				space +=1;
			}
			else if (Character.isLetter(temp[i])) {
				letter +=1;
			}
			
			
		}
		System.out.println(space+"-"+number+"-"+letter);
	}
}
