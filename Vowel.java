package Q1;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userinput = scan.nextLine();
		Vowel s1= new Vowel();
		s1.check(userinput);
	}
	public void check(String value) {
		String vowel="aeiou";
		int count = 0;
		for(int i=0;i<=value.length()-1;i++){
			for(int j=0;j<=vowel.length()-1;j++){
				if(value.charAt(i)==vowel.charAt(j)) {
					count +=1;	
				}
			}
			
		}
		System.out.println("total number of vowels: - > "+count);
	}

	}

