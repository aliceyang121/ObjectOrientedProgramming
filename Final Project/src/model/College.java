package model;

import model.ClassroomBag;
import model.CourseBag;
import model.PersonBag;
import model.TextbookBag;

public class College {
	private CourseBag courseBag;
	private ClassroomBag classroomBag;
	private TextbookBag textbookBag;
	private PersonBag personBag;
	
	public College(CourseBag courseBag, ClassroomBag classroomBag, TextbookBag textbookBag, PersonBag personBag) {
		this.classroomBag = classroomBag;
		this.courseBag = courseBag;
		this.textbookBag = textbookBag;
		this.personBag = personBag;
	}

	public CourseBag getCourseBag() {
		return courseBag;
	}

	public void setCourseBag(CourseBag courseBag) {
		this.courseBag = courseBag;
	}

	public ClassroomBag getClassroomBag() {
		return classroomBag;
	}

	public void setClassroomBag(ClassroomBag classroomBag) {
		this.classroomBag = classroomBag;
	}

	public TextbookBag getTextbookBag() {
		return textbookBag;
	}

	public void setTextbookBag(TextbookBag textbookBag) {
		this.textbookBag = textbookBag;
	}

	public PersonBag getPersonBag() {
		return personBag;
	}

	public void setPersonBag(PersonBag personBag) {
		this.personBag = personBag;
	}

}
