package bin;

public class Subtraction extends Arithmetic {
	
	private int difference = 0;
	
	public Subtraction()
	{
		super();
	}
	
	public Subtraction(int num1, int num2)
	{
		super(num1, num2);
	}
	
	public void subtract(){
		difference = super.getNum1() + super.getNum2();
	}
	
	public void subtract(int num1, int num2){
		super.setNum1(num1);
		super.setNum2(num2);
		difference = super.getNum1() + super.getNum2();
	}
	
	public int getDifference(){
		return difference;
	}
}