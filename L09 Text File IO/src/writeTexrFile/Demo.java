package writeTexrFile;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("Data.txt", true);
			PrintWriter pw = new PrintWriter(fw);	//a wrapper class
//			PrintWriter pw = new PrintWriter("data.txt");
			pw.print("hello");
			pw.println(5);
			pw.close();
			System.out.println("Done Writing");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}