package inheritance;

public abstract class Person {	//abstract = this class cannot be used to create objects.
	private String name;
	private String id;
	
	private static int idCounter = 0;

	public Person(String name/**, String id**/) {		// created this from Source tab above
		this.name = name;
//		this.id = id;
//		idCounter++;
		id = String.valueOf(++idCounter);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

//	public void setId(String id) {
//		this.id = id;
//	}
	
	@Override
	public abstract String toString();
//	{
//		return "Person [name=" + name + ", id=" + id + "]";
//	}
	
	
}
