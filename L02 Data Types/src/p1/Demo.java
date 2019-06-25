// 5/31/19		primitive data

package p1;

import java.math.BigInteger;

public class Demo {
	
	public static void main(String[] args) {
		//int is 4 bytes = 32 bits, double is 8 bytes = 64 bits
		int number = 2147483647;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(2147483648l); 	// the l tells program the number is a long
		
		System.out.println(Double.MIN_VALUE);
		BigInteger big = new BigInteger("123123123123123123123"); 		// can be however long 
		
		char c = 'a';
		char b = 98;	//ASCII Table 98 = b
		System.out.println(b);
		
		System.out.println((char) 98);	//casting changes data types
		int i = 5;
		double di = i;	//widening -- cast int into double, there won't be anything lost
		double d = 1.9;
		int id = (int) d;		// this would not work without casting -- it just cuts off the decimals, no rounding
		System.out.println(id);
		
		int i1 = 5;
		int i2 = 6;
		System.out.println(5/6);
		System.out.println(5 * 1.0/6);
		System.out.println((double) (5/6)); 	// would still get 0
		
		boolean flag = true;
		System.out.println(!flag); 		// negates the value
		
		String fullName = "Alice Yang Yang";
		String [] names = fullName.split("Y");
		System.out.println(names[0].trim());	//removes the space after Alice
		System.out.println(names[1]);
		
		String [] names1 = fullName.split("[Y ]"); 		//regular expression
		// "Ya" --- will need both Ya consequetively
		System.out.println(names1[0]);
		System.out.println(names1[1]);
		System.out.println(names1[2]);
		
		System.out.println(fullName.substring(3, 5));
		
		String boysNames = " asdfa  asdf a asdf s asdf ";
		String girlsNames = "asdfasd asdfasdf asdfasd";
		
	}

}
