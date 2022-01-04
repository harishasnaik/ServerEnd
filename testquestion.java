package Q1;

public class testquestion {
	public static void main(String[] args) {
	question q = new question("java is programming or platform","A. Programming","B. Platform","C.Both","D.None of the above","C");
	question q1 = new question("kart", "a", "b", "c", "d", "d");
	question q2 = new question("kart", "a", "b", "c", "d", "c");
	question q3 = new question("kart", "a", "b", "c", "d", "a");
	
	questionconatiner qc = new questionconatiner();
	qc.addQuestion(q);
	qc.addQuestion(q1);
	qc.addQuestion(q2);
	qc.addQuestion(q3);
	
	
	qc.beginTest();
	qc.showResult();

		
	}
}

