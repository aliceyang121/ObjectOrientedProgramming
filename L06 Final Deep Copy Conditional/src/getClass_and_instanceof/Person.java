package getClass_and_instanceof;

public abstract class Person {
	//fields
	private String firstName;
	
	private static int idCounter = 0;
	
	//constructor
	public Person(String firstName) {
		this.firstName = firstName;
	}

	
	//methods
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String toString() {
		return "First name: " + firstName;
	}

}
