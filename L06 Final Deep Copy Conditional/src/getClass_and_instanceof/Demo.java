package getClass_and_instanceof;

public class Demo {

	private int n = 10;
	
	public static void main(String[] args) {
		Student s1= new Student("A", 3.5);
		Student s2= new Student("B", 2.5);

		System.out.println(s1.getClass().getName());
		System.out.println(s1 instanceof Student);
		System.out.println(s1 instanceof Person);
		System.out.println(s1 instanceof Object);
		
		//System.out.println(n);	-- cannot access n because if is not static: static = only one copy for the class

		//keyword final: final for class (cannot have any subclasses), methods (cannot have any submethods), and variables (cannot be changed)		
	}

}
