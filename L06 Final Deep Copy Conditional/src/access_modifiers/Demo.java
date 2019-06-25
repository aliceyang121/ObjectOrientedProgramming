package access_modifiers;

public class Demo {

	private int n = 10;
	
	public static void main(String[] args) {
		Student s1= new Student("A", 3.5);
		Student s2= new Student("B", 2.5);

		System.out.println(s1.getClass().getName());
		System.out.println(s1 instanceof Student);
		System.out.println(s1 instanceof Person);
		System.out.println(s1 instanceof Object);
		
	}
}

//4 access modifiers: 
//	public: everyone can have access "public class Demo"
//	package access: only classes inside the same package can access (no keyword) "class Demo"
//	protected: package access + all the subclasses can have access "protected class Demo"
// 	private: only local class can access (look at Student class in this package access_modifiers) "private class Demo"
