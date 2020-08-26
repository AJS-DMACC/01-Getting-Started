import java.util.ArrayList; // import the ArrayList class


class GradeBook {
	//private variables
	private ArrayList<Integer> testScores;//arrayList of test scores
	private ArrayList<Character> letterGrades;//the letter grades
	private String testName;//the name of the test
	
	GradeBook(){
		testScores  = new ArrayList<Integer>();
		letterGrades = new ArrayList<Character>();
	}
	
	GradeBook(ArrayList<Integer> grades, String name){
		testScores = grades;
		testName = name;
		letterGrades = new ArrayList<Character>();
		setLetterGrades();
	}
	
	public ArrayList<Integer> getTestScores() {
		return testScores;
	}

	public void setTestScores(ArrayList<Integer> testScores) {
		this.testScores = testScores;
	}

	private void setLetterGrades() {
		for(Integer s : testScores) {
			if(s >= 90) {
				letterGrades.add('A');
			}
			else if(s >= 80) {
				letterGrades.add('B');
			}
			else if(s >= 70) {
				letterGrades.add('C');
			}
			else if(s >= 60) {
				letterGrades.add('D');
			}
			else{
				letterGrades.add('F');
			}
		}
	}
	
	public ArrayList<Character> getLetterGrades() {
		return letterGrades;
	}

	public void setLetterGrades(ArrayList<Character> letterGrades) {
		this.letterGrades = letterGrades;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
}
