package normalInterfaceImplementation;

public class Demo3 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator() {	//Anonymous class
			
			@Override
			public double compute(double a, double b) {
				return a + b;
			}

		};
		
		System.out.println(c1.compute(4, 5));
	}

}
