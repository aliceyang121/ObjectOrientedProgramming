package model;

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
	
	public Person deleteById(int id) {
		int i=-1;
		for (i=0; i<nElems; i++) {
			if (persons[i].getId() == id)
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
	
	public Person search(int id) {
		for (int i=0; i<nElems; i++) {
			if (persons[i].getId() == id) {
				return persons[i];
			}
		}
		return null;
	}
	
	public void update(int id, String firstName, String lastName,PersonBag theBag) {
		if (search(id) instanceof Student) {
			Student s = (Student) search(id);
			s.setFirstName(firstName);
			s.setLastName(lastName);
		}	
		else {
			Faculty f = (Faculty) search(id);
			f.setFirstName(firstName);
			f.setLastName(lastName);
		}	
	}
	
	public void display() {
		for (int i=0; i<nElems; i++) {
			System.out.println(persons[i]);
		}
	}
}
