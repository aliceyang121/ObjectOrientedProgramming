package objectInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import objectOutput.Student;
import objectOutput.Person;

public class Demo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("student.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s = (Student) ois.readObject();
			System.out.println(s.getName());
			System.out.println(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
}