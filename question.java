package Q1;

public class question {
	String question, option1, option2, option3, option4, answer;

	public question(String question, String option1, String option2, String option3, String option4, String answer) {
		super();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [question=" + question + ", option1=" + option1 + ", option2=" + option2 + ", option3="
				+ option3 + ", option4=" + option4 + " ";
	}
	
	public String getAns() {
		return answer;
	}

	
}
