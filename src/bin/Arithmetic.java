package bin;

public class Arithmetic {
	private int number1 = 0;
	private int number2 = 0;
	
	public Arithmetic() {
		this.number1 = 0;
		this.number2 = 0;
	}
	
	public Arithmetic(int num1, int num2) {
		this.number1 = num1;
		this.number2 = num1;
	}
	
	public void setNum1(int num1) {
		this.number1 = num1;
	}
	
	public void setNum2(int num2) {
		this.number2 = num2;
	}
	
	public int getNum1() {
		return this.number1;
	}
	
	public int getNum2() {
		return this.number2;
	}
}
