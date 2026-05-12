package exam.prog2.sose25_01.quiz;

public class FreetextQuestion extends Question {

	private String answer ;
	
	public FreetextQuestion(String text  , String answer) {
		
		super(text);
		
		this.answer = answer ; 
		
	}

	public String getAnswer() {
		
		return answer;
		
	}

	public void setAnswer(String answer) {
		
		this.answer = answer;
		
	}

	@Override
	public boolean checkAnswer(String answerString) {
		
		return answer.equalsIgnoreCase(answerString);
	}

}
