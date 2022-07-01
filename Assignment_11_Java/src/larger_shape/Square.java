package larger_shape;

public class Square extends Shape {
	
	// data field
	private double side; // represents the side length of the Square

// default constructor
	public Square() {
	};

// constructor
	public Square(double valOfSide) {
		setSide(valOfSide);
	}

	// getter
	/**
	 * Returns the side of the square
	 * 
	 * @return: the side of the square
	 */
	public double getSide() {
		return side;
	}

	// Setter
	/**
	 * Updates the side of the square
	 * 
	 * @param length: updated the side of the square
	 */
	public void setSide(double valOfSide) {
		side = valOfSide;
	}

	// Method
	/**
	 * Calculates the area of a Square
	 * @return: calculated area of a Square
	 */

	@Override
	public double area() {
		return getSide() * getSide();
	}

	/**
	 * Calculates the area of a Square
	 * @return: calculated area of a Square
	 */

	@Override
	public String whatAmI() {
		return "Square";
	}

}
