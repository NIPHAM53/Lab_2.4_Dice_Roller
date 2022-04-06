import java.util.Scanner;

public class Dice_Roller {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grand Circus Casino!");
		Scanner scnr = new Scanner(System.in);
		String choice = "y";
		boolean valid = false;
		do {
			System.out.println("How many sides should each die have? ");
			int numSides = scnr.nextInt();
			int d1 = (int) (numSides * Math.random()) + 1;
			int d2 = (int) (numSides * Math.random()) + 1;
			System.out.println("Roll result:" + "\n" + d1 + "\n" + d2);
			while (!valid) {
				System.out.println("Roll again? (y/n)");
				choice = scnr.next();
				if (choice.contains("y")) {
					valid = true;
					System.out.println("Next Round!");
				} else if (choice.contains("n")) {
					valid = true;
					System.out.println("Thank you for playing! See you next time");

				} else {
					System.out.println("Invalid input. Please type in y or n");
				}

			}

		} while (choice.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! See you next time");
	}
}
