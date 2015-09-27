package main;

/**
 * This is a JUnit Test to make sure the Triangle class methods getArea()
 * and getPerimeter() are working properly.
 * 
 * There are 4 test cases:
 * A = sides of 1, 1, and 1
 * B = sides of 1, 2, and 2.5
 * C = sides of 2, 2, and 3
 * D = sides of 10, 5, and 8 
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	Triangle A = new Triangle();
	Triangle B = new Triangle(1, 2, 2.5);
	Triangle C = new Triangle(2, 2, 3);
	Triangle D = new Triangle(10, 5, 8);

	// Test the getArea() and getPerimeter() methods
	@Test
	public void test() {
		/*
		 * Test to make sure the getArea() method calculates the same area that
		 * Heron's formula does. Compare getArea() value to my calculated value
		 * to 4 decimal places and make sure the difference between the 2 is
		 * less than .001 (not exactly equal bc of rounding off and storage
		 * issues
		 */
		assertTrue(Math.abs(A.getArea() - .4330) < .001);
		assertTrue(Math.abs(B.getArea() - .9499) < .001);
		assertTrue(Math.abs(C.getArea() - 1.9843) < .001);
		assertTrue(Math.abs(D.getArea() - 19.8100) < .001);

		/*
		 * Test to make sure the getPerimeter method calculates the same
		 * perimeter as we get via basic addition. The numbers should be exactly
		 * equal because we are adding doubles, and no rounding error will occur
		 */
		assertTrue(A.getPerimeter() == 3.0);
		assertTrue(B.getPerimeter() == 5.5);
		assertTrue(C.getPerimeter() == 7.0);
		assertTrue(D.getPerimeter() == 23.0);
	}

}
