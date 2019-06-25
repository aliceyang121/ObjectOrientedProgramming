package model;

public abstract class Person {
	//fields
	private String firstName;
	private String lastName;
	private int id;
	
	private static int idCounter = 0;
	
	//constructor
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = ++idCounter;
	}
	
	//methods
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getId() {
		return id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "First name: " + firstName + "\tLast name: " + lastName + "\tID: " + id;
	}

}
