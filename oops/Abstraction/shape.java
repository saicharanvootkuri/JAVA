abstract class Shape { 
	private String name; 

	public Shape(String name) { this.name = name; } 

	public abstract double calculateArea(); 

	public String getName() { return name; } 
} 


class Circle extends Shape { 
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	} 

	public double calculateArea() 
	{ 
		return Math.PI * radius * radius; 
	} 
} 

class Rectangle extends Shape { 
	private double length;
	private double width;

	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	} 

	public double calculateArea() 
	{ 
		return length * width; 
	} 
} 

class HelloWorld {  
	public static void main(String[] args) 
	{ 
		Shape myCircle = new Circle("Circle", 5.0); 
		Shape myRectangle = new Rectangle("Rectangle", 4.0, 6.0); 

		System.out.println("Area of " + myCircle.getName() + ": " + myCircle.calculateArea());
		System.out.println("Area of " + myRectangle.getName() + ": " + myRectangle.calculateArea());
	} 
}