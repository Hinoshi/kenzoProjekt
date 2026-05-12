package exam.prog2.sose25_01.quiz;

import java.util.Iterator;
import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {
	 
	
	Scanner keyboard = new Scanner (System.in);
	
	 String [] choices ;
	 
	 int correctindex ;
	 
	 

	public MultipleChoiceQuestion( String text , String [] choices , int correctindex) {
		
		super(text);
		
		this.choices = choices ; 
		
		this.correctindex = correctindex ; 
		

	}

	@Override
	
	public void ask() {
		
		super.ask();
		
		for (int i = 0; i < choices.length; i++) {
			
			System.out.println((i +1) + " " + choices);
			
		}
	}

	public String[] getChoices() {
		
		return choices;
	}



	public void setChoices(String[] choices) {
		
		this.choices = choices;
		
		String zahl [] = choices ; 
		
		System.out.println("Die Mäögliche Antwort  sind ");

		for (int i = 0; i < choices.length; i++) {
			 
			choices[i] =keyboard.next();
			
		}
		
	}



	public int getCorrectindex() {
		return correctindex;
	}



	public void setCorrectindex(int correctindex) {
		this.correctindex = correctindex;
	}


	@Override
	public boolean checkAnswer(String answerString) {
		try {
			
			int index = Integer.parseInt(answerString);
			
			return index == correctindex ; 
			
		} catch (NumberFormatException e) {

			return false;
		}
		
	}

}
