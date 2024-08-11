package triviaGame;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class triviaGame {
	
	Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args){

		//Send out messages to the user for the beginning of the game
		JOptionPane.showMessageDialog(null, "Welcome to the trivia game. Please answer 5 questions");
		
	 	//Define the values of the program	
		int userInput;
		int[] answers = {0, 0, 0, 0, 0};
		int answerTotal = 0;
		Scanner keyboard = new Scanner(System.in);
		
		//Send an understanding message to the user
		System.out.println("Please type 0 to start the triva game");
		userInput = keyboard.nextInt();
	
		//Use while loop to confirm user activity
		while(userInput != 0){
			System.out.println("This is not correct. Please type the correct number");
			userInput = keyboard.nextInt();
		}
		
		//Execute methods
		questionOne(answers);
		questionTwo(answers);
		questionThree(answers);
		questionFour(answers);
		questionFive(answers);
		
		//Print results to the screen 
		System.out.println("Your answer for Question 1 is " + answers[0]);
		System.out.println("Your answer for Question 2 is " + answers[1]);
		System.out.println("Your answer for Question 3 is " + answers[2]);
		System.out.println("Your answer for Question 4 is " + answers[3]);
		System.out.println("Your answer for Question 5 is " + answers[4] + "\r");
		
		//Get user answers
		if(answers[0] == 2){
			System.out.println("Number 1: You are correct");
			answerTotal += 1;
		}
		else{
			System.out.println("Number 1: your answers is incorrect");
		}
		
		if(answers[1] == 3){
			System.out.println("Number 2: You are correct");	
			answerTotal += 1;
		}
		else{
			System.out.println("Number 2: Your answer is incorrect");
		}
		
		if(answers[2] == 1){
			System.out.println("Number 1: You are correct");	
			answerTotal += 1;
		}
		else{
			System.out.println("Number 1: your answers is incorrect");
		}
		
		if(answers[3] == 4){
			System.out.println("Number 1: You are correct");	
			answerTotal += 1;
		}
		else{
			System.out.println("Number 1: Your answer is incorrect");
		}
		
		if(answers[4] == 3){
			System.out.println("Number 1: You are correct");
			answerTotal += 1;
		}
		else{
			System.out.println("Number 1: Your answers is incorrect");
		}
		
		//Calculate percentage with conditionals
		if(answerTotal == 5){
			System.out.println("You have scored 100%. To exit, type 0.");
		}
		else if(answerTotal == 4){
			System.out.println("You have scored 80%. To exit, type 0.");
		}
		else if(answerTotal == 3){
			System.out.println("You have scored 60%. To exit, type 0.");
		}
		else if(answerTotal == 2){
			System.out.println("You have scored 40%. To exit, type 0.");
		}
		else if(answerTotal == 1){
			System.out.println("You have scored 20%. To exit, type 0.");
		}
		else if(answerTotal == 0){
			System.out.println("You have scored 0%. To exit, type 0.");
		}	
		
		//Exit program
		userInput = keyboard.nextInt();
		while(userInput != 0){
			System.out.println("Type 0 to exit");
			if(userInput == 0){
				System.exit(0);
			}
		}
	}
	
	public static int questionOne(int[] answers){
		
		//Define another Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Get an answer from the user
		System.out.println("Question 1: What is the name of the program that is written first when learning a programming language?");
		System.out.println("1: javaBasics  2: helloWorld  3: randomNumberGenerator 4: fibonacciSequence");
		answers[0] = keyboard.nextInt();
		
		//Return the answer to the first question to the main method
		return answers[0];
	}
	
	public static int questionTwo(int[] answers) {
		
		//Define Scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Question 2: Every value in programming is represented by...");
		System.out.println("1: an array  2: a value  3: a variable  4: a name");
		answers[1] = keyboard.nextInt();
		
		//Return the answer to the first question to the main method
		return answers[1];
	}
	
	public static int questionThree(int[] answers) {
		
		//Define Scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Question 3: What OBJECT is represented by a variable?");
		System.out.println("1: String  2: Integer  3: Double  4: Any Number");
		
		answers[2] = keyboard.nextInt();
		
		//Return the answer to the first question to the main method
		return answers[2];
	}
	
	public static int questionFour(int[] answers) {
		
		//Define the Scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Question 4: What kind of loop in programming completes in iteration before doing the loop?");
		System.out.println("1: For Loop  2: While Loop  3: Any Loop  4: Do While Loop");
		
		answers[3] = keyboard.nextInt();
		
		//Return the answer to the first question to the main method
		return answers[3];
	}
	
	public static int questionFive(int[] answers) {
		
		//Define Scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Question 5: In programming, one letter is defined as what in a variable?");
		System.out.println("1: Character  2: String  3: Char  4: Integer");
		
		answers[4] = keyboard.nextInt();
		
		//Return the answer to the first question to the main method
		return answers[4];
	}
}
