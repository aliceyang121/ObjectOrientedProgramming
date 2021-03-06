package p1;

// 1. class name -- has to be unique within the same package
public class Person {
	
	// 2. attributes, fields, instance fields, instance variables
	private String firstName;	//private -- from outside the class, they cannot change the variables
	private String lastName;
	private String username;
	private String password;
	//static variable	-- not usually there to make Objects
	private static String schoolName = "WM";	// static means that the variable does not change throughout the class (all objects of this class will have WM as school)
												//static variable goes on the stack, not heap like everything else
	
	
	// 3. constructors
	public Person(String firstName, String lastName, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}
	public Person(String message) {
		System.out.println(message);
	}	// as soon as you write your own constructor, Java no longer provides a default
	public Person() {
		System.out.println("This is no-args constructor");
	}	
	//overloaded constructors = same name, but different parameters
	
	
	// 4. methods -- getters (accessor) , setter (mutator)
	public String getFirstName() {
		return firstName;	//only returning the reference variable (memory address) -- not actually the name itself
	}
	public String getLastName() {
		return lastName;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;	//newFirstName is not  blue, bc it is a local variable (brown color)
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;	//this.lastName indicates that that one is the instance variable
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "First name: " + firstName + "\tLast name: " + lastName;
	}
}
