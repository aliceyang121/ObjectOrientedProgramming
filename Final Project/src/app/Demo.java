package app;

import model.PersonBag;
import utils.Utility;

public class Demo {

	public static void main(String[] args) {
		PersonBag theBag = new PersonBag(2000);
		Utility.generatePersons(theBag);
		Application.changeBag(theBag);
	}
}
