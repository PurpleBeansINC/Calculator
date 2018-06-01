package source;

public class Triangle extends Shape {

	private double sideA = 0;
	private double sideB = 0;
	private double sideC = 0;
	//TODO
	//height and base
	
	public Triangle(double sideA,double sideB,double sideC){
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	public Triangle(double sideA,double sideB,double sideC, double area, double perimeter){
		super(area, perimeter);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	//setArea
	public void solve(){
		super.setPerimeter(sideA+sideB+sideC);
		super.setArea(side*side);
	}	
}
