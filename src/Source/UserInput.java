package Source;

import java.util.Scanner;

public class UserInput {

	private String userInput = "";
	
	public UserInput() {
		this.userInput = "";
	}
	
	public UserInput(String input) {
		this.userInput = input;
	}
	
	public UserInput(int input) {
		this.userInput = String.valueOf(input);
	}
	
	public void getInput(){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		userInput = scan.nextLine();
	}
	
	public String returnString(){
		return userInput;
	}
	
	public int returnInt(){
		int intUserInput = Integer.parseInt(userInput);
		return intUserInput;
	}
	
}
