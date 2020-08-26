import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Declaring variables
		Scanner scanner = new Scanner(System.in);
		GradeBook gradeBook;
		String testName;
		int amountOfTests;
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		//getting user input
		System.out.print("What is the name of the test? ");
		testName = scanner.nextLine();
		System.out.print("How many test scores are there? ");
		amountOfTests = scanner.nextInt();
		for(int i = 0; i < amountOfTests; i++) {
			System.out.print("What is the test score? ");
			scores.add(scanner.nextInt());
		}
		
		//initialize the grade book
		gradeBook = new GradeBook(scores, testName);
		
		//output the grade book's results
		testName = gradeBook.getTestName();//redundant, but shows working getter method
		scores = gradeBook.getTestScores();
		ArrayList<Character> grades = gradeBook.getLetterGrades();
		System.out.println("\n\n-----"+ testName + "-----");
		System.out.println("Score -------- Grade");
		for(int i = 0; i < scores.size(); i++) {
			System.out.println(scores.get(i) +"     --------  " + grades.get(i));
		}
		
		scanner.close();
	}

}
