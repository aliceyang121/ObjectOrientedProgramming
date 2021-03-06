package model;

public class CourseBag {
	private Course[] courses;
	private int nElems = 0;
	
	public CourseBag (int maxSize) {
		courses = new Course[maxSize];
	}

	public void insert(Course course) {
		courses[nElems] = course;
		nElems++;
	}
	
	public Course delete(String courseNumber) {
		int i=-1;
		for (i=0; i<nElems; i++) {
			if (courses[i].getCourseNumber().equals(courseNumber))
				break;
		}
		
		if (i == nElems)
			return null;
		else {
			Course temp = courses[i];
			for (int j=i; j<nElems-1; j++) {	//nElems-1 bc if the array is full. 
				courses[j] = courses[j+1];
			}
			nElems--;
			return temp;
		}
	}
	
	public Course search(String courseNumber) {
		for (int i=0; i<nElems; i++) {
			if (courses[i].getCourseNumber().equals(courseNumber)) {
				return courses[i];
			}
		}
		return null;
	}
	
	public Course returnRandomCourse() {
		return courses[(int) (Math.random() * courses.length)];
	}
	
	public void display() {
		for (int i=0; i<nElems; i++) {
			System.out.println(courses[i].toString());
		}
	}
}
