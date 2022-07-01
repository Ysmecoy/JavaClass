package cars;

public class BoxCar extends RailroadCar { // derived class od the Railroad class , which has a cuboid shape.

	// Data fields
	private double width; // Represents the width of the box car.
	private double height; // Represents the height of the box car.

	// Constructors

	public BoxCar() {
	}; // default constructor

	public BoxCar(double valOfLength, double valOfWidth, double valOfHeight) {
		setLength(valOfLength);
		setWidth(valOfWidth);
		setHeight(valOfHeight);

	}

	// Getters

	/**
	 * Returns the width of the box car
	 * 
	 * @return: the width of the box car
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Returns the height of the box car
	 * 
	 * @return: the height of the box car
	 */
	public double getHeight() {
		return height;
	}

	// Setters

	/**
	 * Updates the width of the box car
	 * 
	 * @param width: updated the width of the box car
	 */
	public void setWidth(double valOfWidth) {
		width = valOfWidth;
	}

	/**
	 * Updates the height of the box car
	 * 
	 * @param height: updated the height of the box car
	 */
	public void setHeight(double valOfHeight) {
		height = valOfHeight;
	}

	// Methods

	/**
	 * Calculates the volume of a box car
	 * 
	 * @return: calculated volume of a box car
	 */

	@Override
	public double volume() {
		return getWidth() * getLength() * getHeight();
	}

}
