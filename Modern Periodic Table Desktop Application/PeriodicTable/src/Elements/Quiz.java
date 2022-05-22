package Elements;

import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;

public class Quiz {
	
	private static int marks =  0;
	public ArrayList<String> question = new ArrayList<>();
	public ArrayList<String> answer = new ArrayList<>();
	
	public Quiz() throws Exception {
		
		try {
			File file = new File("Question.txt");
			
			if(!file.exists())
					throw new Exception ("Error! File not found");
			Scanner input = new Scanner(file);
			
			// taking input from file [ Questions ]
			while(input.hasNext()) {
				question.add(input.nextLine());
			}
			// Opening the file containing answers
			File ansfile = new File("Answers.txt");
		
			if(!ansfile.exists())
				throw new Exception ("Error! File not found");
			
			Scanner inputAnsfile = new Scanner(ansfile);
			
			// taking input from file [ Answers ]
			while(inputAnsfile.hasNext()) {
				answer.add(inputAnsfile.nextLine());
			}
			
			// calling QuizTest Frame
			    try {
			    	     QuizTest quizTest = new QuizTest(question,answer);
					     quizTest.setVisible(true);
			    }
			    catch(Exception ex) {
				    JOptionPane.showMessageDialog(null, "Error");
			    }
		  } catch (IOException e) {
			  JOptionPane.showMessageDialog(null, "File missing.");
		  }
		
	}
	public static int getMarks() {
		return marks;
	}
	public static void updateMarks() {
		marks++;
	}
	public static void setMarkstoZero() {
		marks = 0;
	}

}
