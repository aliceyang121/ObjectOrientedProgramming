package interfaces1;

public class Demo {

	public static void main(String[] args) {
		RedHeadDuck rhd = new RedHeadDuck("Bill", 2);
		rhd.fly();
		rhd.quack();
		rhd.swim();
		GreenHeadDuck ghd = new GreenHeadDuck("Steven", 3);
		ghd.fly();
//		ghd.flyDefault();
		ghd.quack();
		ghd.swim();
	}

}
