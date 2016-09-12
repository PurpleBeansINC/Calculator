package Source;

public class Multiplication extends Arithmetic {
	
	private int Product = 0;
	
	public Multiplication()
	{
		super();
	}
	
	public Multiplication(int num1, int num2)
	{
		super(num1, num2);
	}
	
	public void multiply(){
		Product = super.getNum1() + super.getNum2();
	}
	
	public void multiply(int num1, int num2){
		super.setNum1(num1);
		super.setNum2(num2);
		Product = super.getNum1() + super.getNum2();
	}
	
	public int getProduct(){
		return Product;
	}
}
