package exam.prog2.sose25_01.quiz;

import java.util.Scanner;

import exam.prog2.soe25_01.container.EmptyQueueExeption;
import exam.prog2.soe25_01.container.Queue;
import exam.prog2.soe25_01.container.QueueList;

public class QuizRunner {
	
	Scanner scanner = new Scanner(System.in);
	
	private Queue<Answerable> questions ; 

	
	public QuizRunner( Queue <Answerable> questions) {
		
		this.questions = questions ; 
		
	}
	
	public void run() throws EmptyQueueExeption {
		
		while(questions.empty()) {
			
			Answerable  q = questions.Pop_back();
			
			q.ask();
			
			System.out.println("Answer : ");
			
			String userAnswer= scanner.next();
			
			if (q.checkAnswer(userAnswer)) {
				
				System.out.println("Richtig");
			}else {
				
				System.out.println("Falsch");
			}
			System.out.println();
		}
		
		scanner.close();
	}
	
	
	public static void main(String[] args) throws EmptyQueueExeption {
		
		Queue<Answerable> quiz = new QueueList<>();
		
		quiz.pusch_front(new FreetextQuestion("Hauptstadt von Frankreich ", "paris" ));
		
		quiz.pusch_front(new MultipleChoiceQuestion("2+2", new String[] {"3" , "4" ,"6"} , 2));
	
		
		QuizRunner runner = new QuizRunner(quiz);
		
		
			runner.run();
	
		
	}
}
