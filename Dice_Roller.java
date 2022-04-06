import java.util.Scanner;

public class Dice_Roller {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grand Circus Casino!");
		Scanner scnr = new Scanner(System.in);
		String choice = "y";
		do {
			System.out.println("How many sides should each die have? ");
			int numSides = scnr.nextInt();
			int d1 = (int) (numSides * Math.random());
			int d2 = (int) (numSides * Math.random());
			System.out.println("Roll 1:" + "\n" + d1 + "\n" + d2);
			System.out.println("Roll again? (y/n)");
			choice = scnr.next();
		} while (choice.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Please come again.");

	}

}
