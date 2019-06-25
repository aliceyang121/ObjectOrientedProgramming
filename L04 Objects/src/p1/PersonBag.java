package p1;

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
	
	public Person search(String lastName) {
		for (int i=0; i<nElems; i++) {
			if (persons[i].getLastName().equals(lastName)) {
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
