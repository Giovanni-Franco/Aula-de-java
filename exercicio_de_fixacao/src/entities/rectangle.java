package entities;

public class rectangle {
	public double width;
	public double height;

	public double area() {
		double result1 = width * height;
		return result1;
	}

	public double perimeter() {
		double result1 = (width * 2) + (height * 2);
		return result1;
	}

	public double diagonal() {
		double result1= Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return result1;
	}
}