package Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questionconatiner {
	
	List<question> list = new ArrayList<question>();
	int ccount, wcount;
	private Scanner sc = new Scanner(System.in);
	
	void addQuestion(question q) {
		list.add(q);
	}
	
	void beginTest( ){
		
		String s;
		for(question q : list)
		{
			System.out.println("\n"+q);
			System.out.println("\nEnter Your Answer ");
			s = sc.next();
			while(!s.equalsIgnoreCase("A") && !s.equalsIgnoreCase("B") && !s.equalsIgnoreCase("C") && !s.equalsIgnoreCase("D"))
			{
				System.out.println("\nEnter the Valid Option");
				s = sc.next();
			}
			if(s.equalsIgnoreCase(q.getAns()))
			{
				++ccount;
			}
			else
			{
				++wcount;
			}
		}
		
	}
	
	void showResult(){
		System.out.println("\nTotal Questions : "+list.size());
		System.out.println("\nCorrect Answers :"+ccount);
		System.out.println("\nWrong Attempts :"+wcount);
		if((((double)ccount/list.size())*100) > 40.00)
			System.out.println("\nResult is : Pass");
		else
			System.out.println("\nResult is : Fail");
	}
}