package normalInterfaceImplementation;


//PRETEND YOU DONT HAVE THE CALCULATORCONCRETE CLASS
public class Demo2 {

	public static void main(String[] args) {
		Calculator c1 = new CalculatorConcrete1();
		System.out.println(c1.compute(4, 5));
	}

}

class CalculatorConcrete1 implements Calculator {

	@Override
	public double compute(double a, double b) {
		return a + b;
	}
	
}
