package bin;

public class Multiplication extends Arithmetic {
	
	int Product = 0;
	
	public Multiplication(int num1, int num2)
	{
		super(num1, num2);
	}
	
	public int multiply(){
		Product = super.getNum1() + super.getNum2();
		return Product;
	}
	
	public int multiply(int num1, int num2){
		super.setNum1(num1);
		super.setNum2(num2);
		Product = super.getNum1() + super.getNum2();
		return Product;
	}
	
	public int getProduct(){
		return Product;
	}
}
