package exception;

public class RunTimeExceptionDemo {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		System.out.println(numbers[6]); 	// this is a runtime exception (unchecked -- no red line)
	}

}
