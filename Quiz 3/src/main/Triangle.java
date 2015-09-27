package main;

/**
 * @author Lia Dawson
 * 
 *         The class Triangle is a subclass of GeometricObject.
 * 
 *         Triangle has 3 private attributes: side1, side2 and side3, each is a
 *         double.
 * 
 *         There is an accessor method for each attribute.
 * 
 *         The default triangle is an equilateral triangle with all three sides
 *         equal to 1
 * 
 *         The no args constructor creates a default triangle, and the
 *         parameters of the arguments constructor are (double side1, double
 *         side2, double side3). This sets the sides equal to their respective
 *         indicated parameter. Both constructors create a Triangle that
 *         inherits the default attributes of a GeometricObject.
 * 
 *         You cannot mutate one of the sides; once a triangle is created using
 *         the args constructor, its side lengths are fixed.
 *
 *         Methods getArea() and getPerimeter() return a double value, the area
 *         and perimeter of the triangle, respectively. getArea is an Overridden
 *         method.
 *
 *         Method toString() returns a string statement of the 3 sides of the
 *         triangle, and overrides the toString() method in the superclass.
 */
public class Triangle extends GeometricObject {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	// no args constructor, creates default triangle
	public Triangle() {
		super();
	}

	// Constructor with side 1, side 2, side 3 as parameters
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Getter for side 1
	public double getSide1() {
		return side1;
	}

	// Getter for side 2
	public double getSide2() {
		return side2;
	}

	// Getter for side 3
	public double getSide3() {
		return side3;
	}

	// calculate and return the area of the triangle using Heron's formula
	@Override
	public double getArea() {
		double p = this.getPerimeter() / 2;
		double A = Math.pow(p * (p - this.getSide1()) * (p - this.getSide2()) * (p - this.getSide3()), 0.5);
		return A;
	}

	// calculate and return the perimeter of the triangle
	public double getPerimeter() {
		return this.getSide1() + this.getSide2() + this.getSide3();
	}

	// return a string declaring the 3 sides of the triangle
	@Override
	public String toString() {
		return ("This triangle has sides of length " + getSide1() + ", " + getSide2() + ", and " + getSide3());

	}

}
