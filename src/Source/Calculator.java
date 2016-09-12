package Source;

public class Calculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.run();
	}

	public void run() {
		UserInput userInput = new UserInput();

		int input = 0;

		do {
			System.out.println("Welcome to PurpleBeans Calculator");
			System.out.println("Type 1: for Arithmetic Operators");
			System.out.println("Type 10: for exit");
			userInput.getInput();
			input = userInput.returnInt();
			if (input == 1) {
				Arithmetic_Operators();
			}
		} while (input != 10);
	}

	public void Arithmetic_Operators() {
		UserInput userInput = new UserInput();
		Addition addition = new Addition();
		Subtraction subtraction = new Subtraction();
		Multiplication multiplication = new Multiplication();
		Division division = new Division();

		int input = 0;
		int num1 = 0;
		int num2 = 0;

		System.out.println("Welcome to Arithmetic Operators");
		System.out.println("Type 1: Addition");
		System.out.println("Type 2: Subtraction");
		System.out.println("Type 3: Multiplication");
		System.out.println("Type 4: Division");
		System.out.println("Type 5: Exit");
		userInput.getInput();
		input = userInput.returnInt();

		if (input == 1) {
			System.out.println("Enter First Number");
			userInput.getInput();
			num1 = userInput.returnInt();
			System.out.println("Enter Second Number");
			userInput.getInput();
			num2 = userInput.returnInt();
			addition.add(num1, num2);
			System.out.println("The Sum of Two Numbers is: " + addition.getSum());
		} else if (input == 2) {
			System.out.println("Enter First Number");
			userInput.getInput();
			num1 = userInput.returnInt();
			System.out.println("Enter Second Number");
			userInput.getInput();
			num2 = userInput.returnInt();
			subtraction.subtract(num1, num2);
			System.out.println("The Difference of Two Numbers is: " + subtraction.getDifference());
		} else if (input == 3) {
			System.out.println("Enter First Number");
			userInput.getInput();
			num1 = userInput.returnInt();
			System.out.println("Enter Second Number");
			userInput.getInput();
			num2 = userInput.returnInt();
			multiplication.multiply(num1, num2);
			System.out.println("The Product of Two Numbers is: " + multiplication.getProduct());
		} else if (input == 4) {
			System.out.println("Enter First Number");
			userInput.getInput();
			num1 = userInput.returnInt();
			System.out.println("Enter Second Number");
			userInput.getInput();
			num2 = userInput.returnInt();
			division.divide(num1, num2);
			System.out.println("The Quotient of Two Numbers is: " + division.getQuotient());
		}
	}

}
