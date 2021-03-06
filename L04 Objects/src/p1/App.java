package p1;

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person("Own constructor");	//say new to create an Object
										//Person() is a constructor, a special type of method. Default constructor (no-arg constructor).
		Person person2 = new Person();
		
		person1.setFirstName("Alan");
		person2 = person1;	//shallow copy -- only copies the memory address
		System.out.println(person1.getFirstName());
		person2.setFirstName("Bill");
		System.out.println(person1.getFirstName());	//will say Bill because referencing the same object

		/**person1 = null;**/
		System.out.println(person2.getFirstName()); //will still be Bill bc person1 only contains the memory location
		System.out.println(person1.getFirstName()); //NullPointerException = the value of Object is null
		
		System.out.println(person2.toString());
		System.out.println(person2);	//Don't have to say toString()
		
		
		System.out.println("\nNEW PERSON");
		Person person3 = new Person("John", "Doe", "DoeJ12", "AbcDef12");
		System.out.println(person3);
		
		System.out.println("\n ARRAY OF PERSONS");
		Person[] persons = new Person[1000];
		Person person01 = new Person("John1", "Doe1", "DoeJ12", "AbcDef12");
		Person person02 = new Person("John2", "Doe2", "DoeJ12", "AbcDef12");
		Person person03 = new Person("John3", "Doe3", "DoeJ12", "AbcDef12");
		Person person04 = new Person("John4", "Doe4", "DoeJ12", "AbcDef12");
		persons[0] = person01;
		persons[1] = person02;
		persons[2] = person03;
		persons[3] = person04;
		for (Person p : persons) {
			System.out.println(p);
		}
		
		//Instead of doing the above with arrays... 
		System.out.println("\n FROM PERSONBAG CLASS");
		PersonBag theBag = new PersonBag(1000);
		theBag.insert(person01);
		theBag.insert(person02);
		theBag.insert(person03);
		theBag.insert(person04);
		theBag.display();
		System.out.println(theBag.search("Doe3"));
		System.out.println(theBag.search("Doe600")); //will return null
	}
}
