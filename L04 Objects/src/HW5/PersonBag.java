package HW5;


public class PersonBag {
	private Person[] persons;
	private int nElems = 0;
	
	public PersonBag (int maxSize) {
		persons = new Person[maxSize];
	}

	public void insert(Person person) {
		persons[nElems] = person;
		nElems++;
	}
	
	public Person deleteByUsername(String username) {
		int i=-1;
		for (i=0; i<nElems; i++) {
			if (persons[i].getUsername().equalsIgnoreCase(username))
				break;
		}
		
		if (i == nElems)
			return null;
		else {
			Person temp = persons[i];
			for (int j=i; j<nElems-1; j++) {	//nElems-1 bc if the array is full. 
				persons[j] = persons[j+1];
			}
			nElems--;
			return temp;
		}
	}
	
	public Person search1(String lastName) {
		for (int i=0; i<nElems; i++) {
			if (persons[i].getLastName().equals(lastName)) {
				return persons[i];
			}
		}
		return null;
	}
	
	public Person search2(String username, String password) {
		for (int i=0; i<nElems; i++) {
			if (persons[i].getPassword().equals(password) || persons[i].getUsername().equalsIgnoreCase(username)) {
				return persons[i];
			}
		}
		return null;
	}
	
	public void display() {
		for (int i=0; i<nElems; i++) {
			System.out.println(persons[i]);
		}
	}
}
