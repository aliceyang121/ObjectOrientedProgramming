package app;

import model.ClassroomBag;
import model.College;
import model.Course;
import model.CourseBag;
import model.PersonBag;
import model.TextbookBag;
import utils.ClassroomFactory;
import utils.CourseFactory;
import utils.PersonFactory;
import utils.TextbookFactory;

public class Factory {

	public static College emitCollege() {
		CourseBag courseBag = new CourseBag(2000);
		CourseFactory.emitCourses(courseBag);
		
//		Course course = courseBag.returnRandomCourse();
//		String courseNumber = course.getCourseNumber();
//		System.out.println(courseNumber);
//		
//		courseBag.display();
//		
//		ClassroomBag classroomBag = new ClassroomBag(100);
//		ClassroomFactory.emitClassrooms(classroomBag);
//		classroomBag.display();
//		
//		TextbookBag textbookBag = new TextbookBag(2000);
//		TextbookFactory.emitTextBooks(textbookBag);
//		textbookBag.display();
		
		PersonBag personBag = new PersonBag(2000);
		PersonFactory.emitPersons(personBag, courseBag);
		personBag.display();
		
		College college = new College(courseBag, classroomBag, textbookBag, personBag);
		return college;
		
//		AppOld.changeBag(theBag);
	}
}
