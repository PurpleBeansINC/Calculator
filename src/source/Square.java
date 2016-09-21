package source;

public class Square extends Shape {

	private double side = 0;
	
	public Square(double side){
		super();
		this.side = side;
	}
	
	public Square(double side, double area, double perimeter){
		super(area, perimeter);
		this.side = side;
	}
	
	public void solve(){
		super.setPerimeter(4*side);
		super.setArea(side*side);
	}	
}
