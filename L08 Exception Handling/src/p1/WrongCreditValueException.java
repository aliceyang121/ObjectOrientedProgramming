package p1;

import java.io.IOException;

public class WrongCreditValueException extends IOException{
	
	public WrongCreditValueException(String message) {
		super(message);
	}
	
}
