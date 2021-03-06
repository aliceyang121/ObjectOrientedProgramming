package interfaces1;

public class RedHeadDuck implements Duckable {
	private String name;
	private int age;
	
	public RedHeadDuck(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "RedHeadDuck [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void fly() {
		System.out.println("Fly like a redheadduck!");
	}

	@Override
	public void quack() {
		System.out.println("quack like a redheadduck");
	}

	@Override
	public void swim() {
		System.out.println("swim like a redheadduck");		
	}
	
}
