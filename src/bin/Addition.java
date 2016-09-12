package bin;

public class Addition extends Arithmetic {
	
	private int sum = 0;
	
	public Addition()
	{
		super();
	}
	
	public Addition(int num1, int num2)
	{
		super(num1, num2);
	}
	
	public void add(){
		sum = super.getNum1() + super.getNum2();
	}
	
	public void add(int num1, int num2){
		super.setNum1(num1);
		super.setNum2(num2);
		sum = super.getNum1() + super.getNum2();
	}
	
	public int getSum(){
		return sum;
	}
}