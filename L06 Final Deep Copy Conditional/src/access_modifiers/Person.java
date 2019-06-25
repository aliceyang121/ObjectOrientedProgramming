package access_modifiers;

public abstract class Person {
	//fields
	private String firstName;
	private Address address;	// this is a has - a relationship
	
	//constructor
	public Person(String firstName) {
		this.firstName = firstName;
		//as of now, the address will be null. Then you will have to set your address (so your constructor won't need that much
	}

	
	//methods
	public String getFirstName() {
		return firstName;
	}

	public Address getAddress() {
		return address;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setAddress(String stNumber, String stName, String city, String state, String zipCode) {
		this.address =  new Address(stNumber, stName, city, state, zipCode);
	}
	
	public String toString() {
		return "First name: " + firstName;
	}

}
