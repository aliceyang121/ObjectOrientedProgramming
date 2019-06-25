package model;

public class MiniFacultyCourseBag {
	private MiniFacultyCourseInfo[] miniFacultyCourseInfos;
	private int nElems = 0;
	
	public MiniFacultyCourseBag (int maxSize) {
		miniFacultyCourseInfos = new MiniFacultyCourseInfo[maxSize];
	}

	public void insert(MiniFacultyCourseInfo miniFacultyCourseInfo) {
		miniFacultyCourseInfos[nElems] = miniFacultyCourseInfo;
		nElems++;
	}

	public void display() {
		for (int i=0; i<nElems; i++) {
			System.out.println(miniFacultyCourseInfos[i]);
		}
	}
}
