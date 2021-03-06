package objectOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("100001", "Alan", 3.5);
		try {
			FileOutputStream fos = new FileOutputStream("student.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);	//a wrapper class
			oos.writeObject(s1);
			oos.close();
			System.out.println("done writing object file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
