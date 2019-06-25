package model;

public class MiniStudentCourseBag {
	private MiniStudentInfo[] miniStudentInfos;
	private int nElems = 0;
	
	public MiniStudentCourseBag (int maxSize) {
		miniStudentInfos = new MiniStudentInfo[maxSize];
	}

	public void insert(MiniStudentInfo miniStudentInfo) {
		miniStudentInfos[nElems] = miniStudentInfo;
		nElems++;
	}

	public void display() {
		for (int i=0; i<nElems; i++) {
			System.out.println(miniStudentInfos[i]);
		}
	}
	
	public double calculateGpa() {
		double sum = 0.0;
		for (int i=0; i<nElems; i++) {
			sum += convertGrade(miniStudentInfos[i]) * miniStudentInfos[i].getNumberOfCredits();
		}
		
		double gpa = sum / nElems;
		return gpa;
	}
	
	public double convertGrade(MiniStudentInfo miniStudentInfo) {
		double numGrade = 0.0;
		if (miniStudentInfo.getLetterGrade().equals(LetterGrades.A))
			numGrade += 4.0;
		else if (miniStudentInfo.getLetterGrade().equals(LetterGrades.B_PLUS))
			numGrade += 3.5;
		else if (miniStudentInfo.getLetterGrade().equals(LetterGrades.B))
			numGrade += 3.0;
		else if (miniStudentInfo.getLetterGrade().equals(LetterGrades.C_PLUS))
			numGrade += 2.5;
		else if (miniStudentInfo.getLetterGrade().equals(LetterGrades.C))
			numGrade += 2.0;
		else if (miniStudentInfo.getLetterGrade().equals(LetterGrades.D_PLUS))
			numGrade += 1.5;
		else if (miniStudentInfo.getLetterGrade().equals(LetterGrades.D))
			numGrade += 1.0;
		else 
			numGrade += 0;
		return numGrade;
	}
}
