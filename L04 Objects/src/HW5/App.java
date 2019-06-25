package HW5;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		PersonBag theBag = new PersonBag(1000);
		
		//first, generate other accounts
		Utils.generateAccounts(theBag);

		//Start the actual login
		Scanner scanner = new Scanner(System.in);
		boolean isFinished = false;
		
		while(!isFinished) {
			System.out.println("Would you like to create an user account, log in, or delete an account? If finished, reply 'finished'.");
			String reply = scanner.nextLine();
			if (reply.equalsIgnoreCase("create an user account"))
				createUserAccount(theBag);
			if (reply.equalsIgnoreCase("log in"))
				logIn(theBag);
			if (reply.equalsIgnoreCase("delete an account"))
				deleteAccount(theBag);
			if (reply.equalsIgnoreCase("finished"))
				isFinished = true;
		}
	}
	
	private static void deleteAccount(PersonBag theBag) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the username of the account you want to delete");
		String reply = scanner.nextLine();
		theBag.deleteByUsername(reply);
	}

	private static void createUserAccount(PersonBag theBag) {	// passing theBag (passing the reference/memory address)
		Scanner scanner = new Scanner(System.in);
		
		String firstName;
		String lastName;
		String username;
		String password;
		
		System.out.println("Please insert the first name");
		firstName = scanner.nextLine();
		System.out.println("Please insert the last name");
		lastName = scanner.nextLine();
		System.out.println("Please insert your username");
		username = scanner.nextLine();
		System.out.println("Please insert your password");
		password = scanner.nextLine();
		Person p = new Person(firstName, lastName, username, password);
		theBag.insert(p);
	}
	
	private static void logIn(PersonBag theBag) {	//have to pass -- explain why later
		Scanner scanner = new Scanner(System.in);
		
		String username;
		String password;
		
		System.out.println("Please insert your username");
		username = scanner.nextLine();
		System.out.println("Please insert your password");
		password = scanner.nextLine();
		
		Person p = theBag.search2(username, password);
		System.out.println(p);
	}

}
