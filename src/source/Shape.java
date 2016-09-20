package source;

public class Shape {
	private double area;
	private double perimeter;
	
	public Shape() {
		this.setArea(0);
		this.setPerimeter(0);
	}
	
	public Shape(double area,double perimeter) {
		this.setArea(0);
		this.setPerimeter(0);
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
}
