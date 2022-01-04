
package Q1;

import java.util.Scanner;

public class Studentdetails {

	public static void main(String[] args) {
		int id = 0;
		String name;
		int[] sub=new int[5];
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter the id ");
		id = scan.nextInt();
		System.out.println("enter the name ");
		name = scan1.nextLine();
		System.out.println("enter the subject marks ");
		for(int i=0;i<5;i++){
			sub[i]= scan.nextInt();
		}
		
		Studentdetails s1 = new Studentdetails();
		int total = s1.calsum(sub);
		s1.display(id,name,total);
		

	}
	public void display(int a,String b,int total)
	{	
		int val = total;
		int id= a;
		String name = b;
		System.out.println("name : " + name + "id : " + id + "total marks are : " + val);
	}
	public int calsum(int a[])
	{	
		int store=0;
		for(int i=0;i<a.length-1;i++) {
			store +=a[i];
		}
		return store;
	}
	
	

}
