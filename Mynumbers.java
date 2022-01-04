package Q1;

import java.awt.Label;
import java.util.Scanner;

public class Mynumbers {

	private int first_number,second_number;
    int option;
    int result = 0;
	public Mynumbers(int first_number,int second_number) {
		super();
		// TODO Auto-generated constructor stub

		this.first_number=first_number;
		this.second_number=second_number;
	}
	
	public void getOption(int opt)
	{
	this.option=opt;
	switch(option)
	{
	case 1:
		try
		{
		result=first_number+second_number;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("SUM "+result);
		break;
		
	case 2:
		try
		{
		result=first_number-second_number;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("SUB "+result);
		break;
		
	case 3:
		try
		{
			result=first_number*second_number;
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("MUL "+result);
			break;
			
	case 4:
		try
		{
			result=first_number/second_number;
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("DIV "+result);
			break;
			
	case 5:
			System.exit(0);;
		
		
	}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the first number");
		Scanner sc=new Scanner(System.in);
		int first_number=sc.nextInt();
		
		System.out.println("Enter the second number");
		int second_number=sc.nextInt();
		
		System.out.println("Enter your choice from the following menu:");
		System.out.println(" 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Exit");
		
		int opt=sc.nextInt();
		
		Mynumbers my=new Mynumbers(first_number, second_number);
		my.getOption(opt);
		
	}
	
	
	
}