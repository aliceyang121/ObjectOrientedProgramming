// 5/31/19

package git;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TranscriptMaker {
	private final static String dashLine = "---------------------------------------------------";
	private final static String columnWidth = "\t\t";
	
	private static String[] courses = new String[20];
	private static double[] credits = new double[20];
	private static String[] letterGrades = new String[20];
	private static double[] convertedGrades = new double [20];
	
	private static int count = 0;
	private static double gpa;
	private static String studentName;
	private static String gradeYear;
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Hello! Welcome to the transcript maker.");
		System.out.println("What is your name?");
		studentName = scanner.nextLine();
		System.out.println("What grade year are you in?");
		gradeYear = scanner.nextLine();

		takeInput();
		processInput();
		showTranscript();

	}

	private static void takeInput() {
		boolean isFinished = false;
//		String courseName;
//		double creditNum;
//		String courseGrade;
		
		while (!isFinished){
			System.out.println("Please input your course, the course's credits, and your grade for that course.");
			System.out.println("Example: English 4 A");
//			courseName = scanner.next();
			courses[count] = scanner.next();
//			creditNum = Double.parseDouble(scanner.next());
			credits[count] = Double.parseDouble(scanner.next());
//			courseGrade = scanner.next();
			letterGrades[count++] = scanner.next();
			scanner.nextLine();
			
			System.out.println("Great! Is that all of your courses?");
			if (scanner.nextLine().equalsIgnoreCase("yes"))
				isFinished = true;
		}
		scanner.close();
	}
	
	private static void processInput() {
		convertGrade();
		
		double totalSum=0;
		double creditSum =0;
		for (int i=0; i<count; i++) {
			totalSum += credits[i] * convertedGrades[i];
			creditSum += credits[i];
		}
		
		gpa = totalSum/creditSum;
	}
	
	private static void convertGrade() {
		for (int i=0; i<count; i++) {
			if (letterGrades[i].equalsIgnoreCase("A"))
				convertedGrades[i] = 4.00;
			else if (letterGrades[i].equalsIgnoreCase("B"))
				convertedGrades[i] = 3.00;
			else if (letterGrades[i].equalsIgnoreCase("C"))
				convertedGrades[i] = 2.00;
			else if (letterGrades[i].equalsIgnoreCase("D"))
				convertedGrades[i] = 1.00;
			else if (letterGrades[i].equalsIgnoreCase("F"))
				convertedGrades[i] = 0.00;
		}
	}
	
	private static void showTranscript() {
		System.out.println("\t\t" + studentName + "'s Transcript");
		System.out.println("\t\tGrade Year: " + gradeYear);
		System.out.println(dashLine);
		for(int i=0; i<count; i++)
		{
			System.out.println((i+1) + columnWidth + courses[i] + columnWidth + credits[i] + columnWidth + letterGrades[i]);
		}
		
		DecimalFormat df = new DecimalFormat("###.00");
		System.out.println("GPA\t\t\t\t" + df.format(gpa));
	}

}
