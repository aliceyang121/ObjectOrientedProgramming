package enums;

import java.util.Random;

public class Person {
	public static int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(100);
	}
}
