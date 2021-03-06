package p1;

import java.util.Scanner;
import java.lang.Math;

public class UsernameGenerator {

	private static String firstname;
	private static String lastname;
	private static String username;
	private static String password = "";
	private static String[][] storage = new String[50][2];
	private static int count=0;

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean isFinished = false;
		while (!isFinished) {
			System.out.println("Do you need to make an account? Say 'finished' when done");
			String reply = scanner.nextLine();
			
			if(reply.equalsIgnoreCase("finished"))
				break;
			
			generateUsername();
			generatePassword();
			storeInArray();
			count++;
		}
		scanner.close();
	}

	private static void generateUsername() {
		System.out.println("Insert your first name");
		firstname = scanner.nextLine().toLowerCase();
		System.out.println("Insert your last name");
		lastname = scanner.nextLine().toLowerCase();
		
		if (lastname.length() > 5)
			lastname = lastname.substring(0,5);
		
		username = lastname + firstname.charAt(0) + (int)(Math.random()*10) + (int)(Math.random()*10);
		System.out.println("This is your username: " + username);
	}
	
	private static void generatePassword() {
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890,.?&^#";
		char[] password_array = new char[8];
		password_array[0] = characters.charAt((int)(Math.random()*26));
		password_array[1] = characters.charAt((int)(Math.random()*26)+26);
		password_array[2] = characters.charAt((int)(Math.random()*10)+52);
		password_array[3] = characters.charAt((int)(Math.random()*6)+62);
		
		for (int i=4; i<8; i++) {
			password_array[i] = characters.charAt((int)(Math.random()*68));
		}
		
		//shuffle the order
		for (int i=0; i<password_array.length; i++) {
			int randomIndex = (int)(Math.random()*password_array.length);
			char charAtIndex = password_array[i];
			password_array[i] = password_array[randomIndex];
			password_array[randomIndex] = charAtIndex;
		}
		
		for (int i=0; i<password_array.length; i++) {
			password += password_array[i];
		}
		
		System.out.println("This is your password: " + password);
	}
	
	private static void storeInArray() {
		storage[count][0] = username;
		storage[count][1] = password;
	}
}
