import java.util.Scanner;

public class Home {

	static int userVal;
	static int value = 0;
	static Boolean proceed = true;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (proceed) {

			System.out.println("Please enter an integer: ");

			userVal = Math.abs(scan.nextInt());

			System.out.printf("%-10s %-10s %-10s","Number", "Squared", "Cubed");
			System.out.println();
			
			
			System.out.printf("%-10s %-10s %-10s","=======", "=======", "=======");
			System.out.println();

			for (int i = userVal; i > 0; i--) {
				
				System.out.printf("%-10s %-10s %-10s",numberDisplay(userVal), squaredDisplay(value), cubedDisplay(value));
				System.out.println();

			}
			
			System.out.println();
			System.out.println("Continue? (y/n)");
			
			if (!scan.next().equalsIgnoreCase("y")) {
				proceed = false;
				
				System.out.println("Thank you for using the Grand Circus calculator!");
			}
			
			System.out.println();

		}
		scan.close();

	}

	public static String numberDisplay(int userVal) {

		value++;
		return String.valueOf(value);
	}

	public static String squaredDisplay(int value) {

		return String.valueOf((int)Math.pow(value, 2));
	}

	public static String cubedDisplay(int value) {

		return String.valueOf((int)Math.pow(value, 3));
	}

}
