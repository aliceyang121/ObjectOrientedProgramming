package normalInterfaceImplementation;

public class Demo {

	public static void main(String[] args) {
//		CalculatorConcrete c1 = new CalculatorConcrete();
//		System.out.println(c1.compute(4,5));
		
		Calculator c2 = (a,b) -> {	//lambda expression
			return a + b;
		};
		
		System.out.println(c2.compute(4, 5));
	}
		

}
