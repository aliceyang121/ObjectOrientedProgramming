// 5/28/19 First lesson: rewrote the entire class (original at bottom)

package git;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BubbleTeaOrderingSystem 
{
	private final static String dashLine = "---------------------------------------";
	private final static String columnWidth = "\t\t";
	
	private static String[] flavors = new String[20];
	private static String[] sizes = new String[20];
	private static double[] prices = new double[20];
	private static int count = 0;
	private static double totalPrice = 0;
	private static double subTotalPrice = 0;
	private static double tax = 0;
	private static final double TAX_RATE = .0825;
	
	public static void main(String[] args)
	{
		showMenu();
		takeOrder();
		processOrder();
		showRecipt();
	}

	private static void showMenu()
	{
		System.out.println("\tAlice's Bubble Tea Stand");
		System.out.println("123 main Street, Stony Brook, NY 11790");
		System.out.println("\t\t631-123-4567");
		System.out.println(dashLine);
		System.out.println("1." + columnWidth + "Tea 1" + columnWidth + "$2.50");
		System.out.println("2." + columnWidth + "Tea 2" + columnWidth + "$3.50");
		System.out.println("3." + columnWidth + "Tea 3" + columnWidth + "$2.75");
		System.out.println("4." + columnWidth + "Tea 4" + columnWidth + "$2.25");
		System.out.println("5." + columnWidth + "Tea 5" + columnWidth + "$4.50");
		System.out.println(dashLine);
	}
	
	private static void takeOrder() 
	{
		String flavor;
		String size;
		String reply;
		boolean isFinished = false;
		Scanner scanner = new Scanner(System.in);
		
		while (!isFinished) 
		{
			System.out.println("What can I get you? Our flavors are Thai, Matcha, and Taro.");
			flavor = scanner.nextLine();
			flavors[count] = flavor;
	
			System.out.println("What size do you want? We have regular and large.");
			size = scanner.nextLine();
			sizes[count++] = size;
	
			System.out.println("Great! Is that all?");
			reply = scanner.nextLine();
			if (reply.equalsIgnoreCase("yes"))
				isFinished = true;
		}
	
		scanner.close();
	}
	
	private static void processOrder()
	{
		for (int itemNum = 0; itemNum < count; itemNum++) 
		{
			if (flavors[itemNum].equalsIgnoreCase("Tea 1")) /*&& sizes[itemNum].equalsIgnoreCase("regular") -- ignore size as of now*/
				prices[itemNum] = 2.50;
			else if (flavors[itemNum].equalsIgnoreCase("Tea 2"))
				prices[itemNum] = 3.50;
			else if (flavors[itemNum].equalsIgnoreCase("Tea 3"))
				prices[itemNum] = 2.75;
			else if (flavors[itemNum].equalsIgnoreCase("Tea 4"))
				prices[itemNum] = 2.25;
			else if (flavors[itemNum].equalsIgnoreCase("Tea 5"))
				prices[itemNum] = 4.50;
		}
		getSubTotalTaxTotal();
	}

	private static void getSubTotalTaxTotal() 
	{
		for (int i=0; i<count; i++)
		{
			subTotalPrice += prices[i];
		}
		
		tax = subTotalPrice * TAX_RATE;
		totalPrice = subTotalPrice + tax;
	}
	
	private static void showRecipt()
	{
//		DecimalFormat df = new DecimalFormat("###,###.00");
		
		System.out.println(dashLine);
		
		for(int i=0; i<count; i++)
		{
			System.out.println((i+1) + columnWidth + flavors[i] + columnWidth + sizes[i] + columnWidth + prices[i]);
		}
		
//		System.out.println("SUBTOTAL" + columnWidth + columnWidth + df.format(subTotalPrice));
//		System.out.println("TAX" + columnWidth + columnWidth + columnWidth + df.format(tax));
//		System.out.println("TOTAL" + columnWidth + columnWidth + columnWidth + df.format(totalPrice));
		
		System.out.printf("SUBTOTAL" + columnWidth + columnWidth + "%.2f\n", subTotalPrice);
		System.out.printf("TAX" + columnWidth + columnWidth + columnWidth + "%.2f\n", tax);
		System.out.printf("TOTAL" + columnWidth + columnWidth + columnWidth + "%.2f\n", totalPrice);
		System.out.println(dashLine);
	}
	
}

//package git;
//import java.util.Scanner;
//
//public class BubbleTeaOrderingSystem 
//{
//	public static void main(String[] args) 
//	{
//		String drink, size;
//		int numOrder;
//		double totalPrice = 0, tax = .05;
////		boolean finish = false;
//		
//		Scanner x = new Scanner(System.in);
//		
//		System.out.println("Welcome to Alice's BobaTopia! How many drinks will you be ordering?");
//		numOrder = x.nextInt();
//		String orders[] = new String [numOrder*2];
//		
//		for (int i=0; i<numOrder*2; i=i+2)
//		{
//			
//			System.out.println("What can I get you? Our flavors are Thai, Matcha, and Taro.");
//			drink = x.nextLine();
//			orders[i] = drink;
//			
//			System.out.println("What size do you want? We have regular and large.");
//			size = x.nextLine();
//			orders[i+1] = size;
//			
//			System.out.println("Alright! On to the next drink.");
//
//			
///*			IGNORE -- did this when attempting a while loop
// 			
// 			System.out.println("Great! Is that all?");
// 			reply = x.nextLine();
//			if (reply.equalsIgnoreCase("yes"))
//				finish = true;
//			else if (reply.equalsIgnoreCase("no"))
//				finish = false;
//			else
//				System.out.println("Please reply yes or no!");
//*/
//		}
//		
//		x.close();
//		
//		System.out.println("\nHere is your recipt!");
//		
//		for (int i=0; i<numOrder*2; i=i+2)
//		{
//			double price = 0.00;
//			if (orders[i].equals("Thai"))
//				price = 2.50;
//			else if (orders[i].equals("Matcha"))
//				price = 3.00;
//			else 
//				price = 3.50;
//			
//			if (orders[i+1].equals("regular"))
//				price += 1.00;
//			else
//				price += 2.00;
//
//			totalPrice += price;
//			
//			System.out.println("Drink: " + orders[i] + " Size: " + orders[i+1] + " Price: $" + price);
//		}
//		
//		System.out.println("Subtotal: $" + totalPrice);
//		System.out.println("Tax: $" + Math.round(totalPrice*tax));	//Not that familiar with Math.round (had to look it up)
//		System.out.println("Total: $" + totalPrice*(1+tax));
//		System.out.println("Have a wonderful day! :)");
//
//	}
//}
