package p1;

public class Demo {

	public static void main(String[] args) {
		Course course1 = null;
		try {
			course1 = new Course("CSE148", 4.5);
		} catch (WrongCreditValueException e) {
			System.out.println(e.getMessage());
//			getNewCreditValue();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of bounds exception");
		} catch (RuntimeException e) {
			System.out.println("Exception occurred");
		} finally {		//this will be executed even if it doesn't crash
			
		}
		System.out.println(course1);
	}

}
