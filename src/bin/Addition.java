package bin;

public class Addition extends Arithmetic {
	
	int sum = 0;
	
	public Addition(int num1, int num2)
	{
		super(num1, num2);
	}
	
	public int add(){
		sum = super.getNum1() + super.getNum2();
		return sum;
	}
	
	public int add(int num1, int num2){
		super.setNum1(num1);
		super.setNum2(num2);
		sum = super.getNum1() + super.getNum2();
		return sum;
	}
	
	public int getSum(){
		return sum;
	}
}