package larger_shape;

public class Circle extends Shape {
	
	// data field
	private double radius; // represents the radius of a circle

	// constructors
	public Circle() {
	}; // default constructor

	public Circle(double ValOfRadius) {
		setRadius(ValOfRadius);
	}

	// getter

	/**
	 * Returns the radius of the circle
	 * 
	 * @return: the radius of the circle
	 */
	public double getRadius() {
		return radius;
	}

	// Setter

	/**
	 * Updates the radius of the circle
	 * 
	 * @param radius: updated the radius of the circle
	 */
	public void setRadius(double valOfRadius) {
		radius = valOfRadius;
	}

	// Method
	/**
	 * Calculates the area of a circle
	 * @return: calculated area of a circle
	 */

	@Override
	public double area() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	/**
	 * The type or identity of the Shape
	 * @return: The type of Shape
	 */

	@Override
	public String whatAmI() {
		return "Circle";
	}

}
