package inheritance;

public class Demo {

	public static void main(String[] args) {
//		Person p1 = new Person("Alan");	// bc person class is abstract class
//		System.out.println(p1);
//		Person p2 = new Person("Bill");
//		System.out.println(p2);
		
/**		Student s1 = new Student("Kathy", 3.5);
		System.out.println(s1);
		System.out.println(s1.getId());
		
		Faculty f1 = new Faculty("Dave", 100000);
		System.out.println(f1);
**/
		//polymorphism - variable of super class type can be used to reference objects of sub class types
		Person p01 = new Student("Alan", 3.5);
		Faculty p02 = new Faculty("Bill", 10000);
		
		Person[] persons = new Person[100];
		persons[0] = p01;
		persons[1] = p02;

//		Person p03 = persons[0];	this is ok
//		Student p3 = (Student) persons[0];	//however it will crash when it runs if this is wrong -- run time error
//		Student p4 = (Student) persons[1]; //this is wrong
		//curly red line: due to compiler detection: compiling error
		// runtime error errors occurs during program running time
		
		Person p3 = persons[0];	
		Person p4 = persons[1];
		
		System.out.println(p3.getId()); //all the methods can work
		
		if (p3 instanceof Student)
			System.out.println(((Student)p3).getGpa());
		else
			System.out.println(((Faculty)p3).getSalary());
		
	}

}
