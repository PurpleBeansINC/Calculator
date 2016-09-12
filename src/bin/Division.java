package bin;

public class Division extends Arithmetic {
	
	int Quotient = 0;
	
	public Division(int num1, int num2)
	{
		super(num1, num2);
	}
	
	public int divide(){
		Quotient = super.getNum1() + super.getNum2();
		return Quotient;
	}
	
	public int divide(int num1, int num2){
		super.setNum1(num1);
		super.setNum2(num2);
		Quotient = super.getNum1() + super.getNum2();
		return Quotient;
	}
	
	public int getQuotient(){
		return Quotient;
	}
}