package hw06;

public abstract class Person {
	//fields
	private String firstName;
	private String lastName;
	private int id;
	private long phoneNumber;
	
	private static int idCounter = 0;
	
	//constructor
	public Person(String firstName, String lastName, long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = ++idCounter;
		this.phoneNumber = phoneNumber;
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
	public long getPhoneNumber() {
		return phoneNumber;
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
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return "First name: " + firstName + "\tLast name: " + lastName + "\tID: " + id + "\tPhone Numbe: " + phoneNumber;
	}

}
