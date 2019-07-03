package functionalInterface;

public class Demo {

	public static void main(String[] args) {
		Calculator add = (a, b) -> {	//lambda expression
			return a + b;
		};
		
		Calculator subtract = (a, b) -> {
			return a - b;
		};
		
		Calculator multiply = (a, b) -> {
			return a * b;
		};
		
		Calculator divide = (a, b) -> {
			return a / b;
		};
		
		System.out.println(add.compute(2, 4));
		System.out.println(subtract.compute(2, 4));
		System.out.println(multiply.compute(2, 4));
		System.out.println(divide.compute(2, 4));
		
	}

}
