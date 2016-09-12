package bin;

public class Subtraction extends Arithmetic {
	
	int difference = 0;
	
	public Subtraction(int num1, int num2)
	{
		super(num1, num2);
	}
	
	public int subtract(){
		difference = super.getNum1() + super.getNum2();
		return difference;
	}
	
	public int subtract(int num1, int num2){
		super.setNum1(num1);
		super.setNum2(num2);
		difference = super.getNum1() + super.getNum2();
		return difference;
	}
	
	public int getSubtract(){
		return difference;
	}
}