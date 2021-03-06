package p1;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number.");
		int number = scanner.nextInt();
		
		switch (number) {
		case 1 :
			System.out.println("TEA");
			break;
		case 2 :
			System.out.println("COFFEE");
			break;
		default :		// not required -- but it is a "catch-all"
			System.out.println("No such item.");
		}
		
		//PURPOSES OF BREAK
		//1. see above
		//2. see below -- get out of this loop
		
		for (int i=0; i<number; i++) {
			if (i==3)
//				break;
				continue;		// break gets out of loop, continue stays in the loop, but skips rest of iteration
			
			System.out.println(i);
		}
		
		
// 		SECOND PART OF LESSON: ARRAYLISTS
		System.out.println("SECOND PART OF LESSON: ARRAYLISTS");
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Joe");
		myList.add("John");
		myList.remove("John");
		System.out.println(myList.size());
		myList.add(0, "Julie");
		System.out.println(myList.size());
		System.out.println(myList);
		System.out.println(myList.get(1));
		
		ArrayList anything = new ArrayList<>();
		anything.add(1);
		anything.add("John");
		System.out.println(anything);
		
		
		scanner.close();
	}

}
