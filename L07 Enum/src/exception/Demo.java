package exception;

import enums.Person;	//this is the recommended way -- import all classes you need individually
import enums.Seasons;	// there is a minus sign to condense

import enums.*;		//this is importing the entire package

public class Demo {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(Seasons.values());
	}

}
