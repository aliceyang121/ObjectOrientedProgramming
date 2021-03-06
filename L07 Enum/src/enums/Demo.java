package enums;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
//		String season = "Spring";
//		String[] seasons = {"Spring", "Summer", "Fall", "Winter"};
		Seasons[] s = Seasons.values();
		System.out.println(s[0]);
		System.out.println(Arrays.toString(s));	//static method is italicized.
		System.out.println(s.toString()); // will give you half of the memory address (hexadecimal) (hash code of memory address)
		
		ArrayList<Integer> myList = new ArrayList<>();
		ArrayList<Integer> myBabyList = new ArrayList();
		myBabyList.add(2);
		myBabyList.add(14);
		myList.add(1);
		myList.add(5);
		myList.add(7);
		myList.addAll(myBabyList);	//addAll
		System.out.println(myList);
		
		Person p = new Person();
		p.toString();	//not a static method, so not italicized.
		
		System.out.println(Person.getRandomNumber());	//static method italicized
	}

}
