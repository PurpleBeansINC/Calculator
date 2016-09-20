package source;

public class Rectangle extends Shape {

	private double length = 0;
	private double width = 0;
	
	public Rectangle(double lenght,double width){
		super();
		this.length = lenght;
		this.width = width;
	}
	
	public Rectangle(double lenght, double width, double area, double perimeter){
		super(area, perimeter);
		this.length = lenght;
		this.width = width;
	}
	
	public void solve(){
		super.setPerimeter(2*(length+width));
		super.setArea(length*width);
	}	
}
