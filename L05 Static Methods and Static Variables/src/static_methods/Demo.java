package static_methods;

public class Demo {

	public static void main(String[] args) {
		//show();		this doesn't work
		//this.show();	//this is for objects, cannot run non- static methods in the main 	
		Demo demo = new Demo();
		demo.show(); 	//this would work
	}
	
	public void show() {
		System.out.println("hi");
	}

}
