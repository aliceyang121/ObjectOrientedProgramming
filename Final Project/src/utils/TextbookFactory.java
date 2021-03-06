package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Textbook;
import model.TextbookBag;

public class TextbookFactory {
	
	private static File textbook_isbns = new File("textbookIsbns.txt");
	private static File textbook_titles = new File("textbookTitles.txt");
	private static File last_names = new File("lastNames.txt");
	private static Scanner scanner1 = null;
	private static Scanner scanner2 = null;
	private static Scanner scanner3 = null;
	private static String bookTitle;
	private static String isbn;
	private static String author;
	private static double price;
	
	public static void emitTextBooks(TextbookBag textbookBag) {
		try {
			scanner1 = new Scanner(textbook_isbns);
			scanner2 = new Scanner (textbook_titles);
			scanner3 = new Scanner (last_names);
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found.");
//			e.printStackTrace();
		}
		
		for (int i=0; i<1000; i++) {
			isbn = scanner1.nextLine();
			bookTitle = scanner2.nextLine();
			author = scanner3.nextLine();
			price = (double)((int) (Math.random() * 50) + 10);
			
			Textbook textbook = new Textbook(bookTitle, isbn, author, price);
			textbookBag.insert(textbook);
			
			//for author see if you can separate the PersonFactory with a nameFactory() so it can be its own method without using the same name.
		}
	}

}
