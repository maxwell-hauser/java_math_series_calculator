import javax.swing.JOptionPane;

public class MathSeriesCalculator {
	// Determines the math series the user will use.
	public static int seriesSelect() {
		int seriesSelection = 0;
		boolean receivedValidInput = false;

		do {
			String input = JOptionPane.showInputDialog(
					null,
					"Math Series Calculator\n" +
					"-----------------------\n" +
					"Select a series (1-5):\n" +
					"  1) 1 + 2 + 3 + ... + n\n" +
					"  2) 1 + 8 + 27 + ... + n^3\n" +
					"  3) 1/3 + 2/5 + ... + n/(2n+1)\n" +
					"  4) 1/2! + 2/4! + ... + n/(2n)!\n" +
					"  5) Exit",
					"Math Series",
					JOptionPane.QUESTION_MESSAGE);

			if (input == null) {
				// Treat cancel/close as exit
				System.exit(0);
			}

			input = input.trim();
			receivedValidInput = input.matches("[1-5]");

			if (!receivedValidInput) {
				JOptionPane.showMessageDialog(
						null,
						"Please enter a number between 1 and 5.",
						"Invalid Input",
						JOptionPane.ERROR_MESSAGE);
			} else {
				seriesSelection = Integer.parseInt(input);
			}
		} while (!receivedValidInput);

		return seriesSelection;
	}
	
	//Determines the integer that will be used for calculations.
	public static int numberSelect(int seriesSelection) {
		boolean receivedValidInput;
		int numberSelection = 0;
		switch (seriesSelection) {
			case 1:
			case 2:
			case 3:
			case 4:
				do {
					receivedValidInput = false;
					String selection = JOptionPane.showInputDialog(
							null,
							"Enter a positive integer for n:",
							"Math Series",
							JOptionPane.QUESTION_MESSAGE);

					if (selection == null) {
						System.exit(0);
					}

					selection = selection.trim();
					receivedValidInput = selection.matches("[1-9]\\d*");
					if (!receivedValidInput) {
						JOptionPane.showMessageDialog(
								null,
								"Please enter a positive integer (n >= 1).",
								"Invalid Input",
								JOptionPane.ERROR_MESSAGE);
					} else {
						numberSelection = Integer.parseInt(selection);
					}
				} while (!receivedValidInput);
				break;

			default:
				JOptionPane.showMessageDialog(
						null,
						"Thank you for using the Math Series Calculator.",
						"Goodbye",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				break;
		}
		return numberSelection;
	}
	
	//Conducts calculations.
	public static double mathSeries(int seriesSelection, int numberSelection) {
		double sum = 0.0;
		switch (seriesSelection) {
			case 1:
				for (int i = 1; i <= numberSelection; i++) {
					sum += i;
				}
				break;

			case 2:
				for (int i = 1; i <= numberSelection; i++) {
					sum += Math.pow(i, 3);
				}
				break;

			case 3:
				for (int i = 1; i <= numberSelection; i++) {
					sum += i / (double) (2 * i + 1);
				}
				break;

			case 4:
				for (int i = 1; i <= numberSelection; i++) {
					sum += i / factorial(2 * i);
				}
				break;

			default:
				// Should not be reached due to prior validation
				break;
		}
		return sum;
	}
	
	//Finds factorials.
	public static double factorial(int n) {
		if (n < 0) throw new IllegalArgumentException("n must be >= 0");
		double result = 1.0;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	//Displays results.
	public static void displayResult(int seriesSelection, int numberSelection, double result) {
		String message;
		switch (seriesSelection) {
			case 1:
				message = String.format("1 + 2 + 3 + ... + %d = %.0f", numberSelection, result);
				break;
			case 2:
				message = String.format("1 + 8 + 27 + ... + %d^3 = %.0f", numberSelection, result);
				break;
			case 3:
				message = String.format("1/3 + 2/5 + ... + %d/(2*%d+1) = %.6f", numberSelection, numberSelection, result);
				break;
			default:
				message = String.format("1/2! + 2/4! + ... + %d/(2*%d)! = %.6f", numberSelection, numberSelection, result);
				break;
		}
		JOptionPane.showMessageDialog(null, message, "Math Series", JOptionPane.INFORMATION_MESSAGE);
	}
	
	//Main method.
	public static void main(String[] args) {
		while (true) {
			int result0 = seriesSelect();
			int result1 = numberSelect(result0);
			double result2 = mathSeries(result0, result1);
			displayResult(result0, result1, result2);
		}
	}
}