package app;

import model.PersonBag;
import model.Student;
import model.Faculty;
import java.util.Scanner;

public class AppOld {
	public static void changeBag(PersonBag theBag) {
		
		boolean isFinished = false;
		
		Scanner scanner = new Scanner(System.in);
		while(!isFinished) {
			System.out.println("Would you like to 1. insert person 2. find person 3. delete person 4. update person?");
			int reply = scanner.nextInt();
			scanner.nextLine();

			switch (reply) {
			case 1:
				System.out.println("Are they a student or faculty?");
				String typeOfPerson = scanner.nextLine();
				if(typeOfPerson.equalsIgnoreCase("student")) {
					System.out.println("Type their first name, last name, phone number, gpa, major, and course");
					String fn = scanner.next();
					String ln = scanner.next();
					long pn = Long.parseLong(scanner.next());
					double gpa = Double.parseDouble(scanner.next());
					String m = scanner.next();
					String c = scanner.next();
				
					Student s = new Student(fn, ln, pn, gpa, m, c);
					theBag.insert(s);
				}
				else {
					System.out.println("Type their first name, last name, phone number, salary, rank, and discipline");
					String fn = scanner.next();
					String ln = scanner.next();
					long pn = Long.parseLong(scanner.next());
					double s = Double.parseDouble(scanner.next());
					String r = scanner.next();
					String d = scanner.next();
					scanner.nextLine();
					Faculty f = new Faculty(fn, ln, pn, s, r, d);
					theBag.insert(f);
				}
				break;
					
			case 2:
				System.out.println("What is the id of the person?");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println(theBag.search(id));
				break;
				
			case 3:
				System.out.println("What is the id of the person?");
				int id1 = scanner.nextInt();
				scanner.nextLine();
				theBag.deleteById(id1);
				break;
			case 4:
				System.out.println("What is the id of the person?");
				int id2 = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Please print the new first and last name of the person");
				String fn = scanner.next();
				String ln = scanner.next();
				scanner.nextLine();
				theBag.update(id2, fn, ln, theBag);
				break;
			default: 
				isFinished = true;
			}
		}
	}
}
