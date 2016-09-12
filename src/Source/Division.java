package Source;

public class Division extends Arithmetic {
	
	private int Quotient = 0;
	
	public Division()
	{
		super();
	}
	
	public void divide(){
		Quotient = super.getNum1() + super.getNum2();
	}
	
	public void divide(int num1, int num2){
		super.setNum1(num1);
		super.setNum2(num2);
		Quotient = super.getNum1() + super.getNum2();
	}
	
	public int getQuotient(){
		return Quotient;
	}
}