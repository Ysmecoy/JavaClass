package cars;

public abstract class RailroadCar {
	// Data Field
	private double length; // Represents the length of the railroad car.

	// Getters

	/**
	 * Returns the length of the railroad car
	 * 
	 * @return: the length of the railroad car
	 */
	public double getLength() {
		return length;
	}

	// Setters

	/**
	 * Updates the length of the railroad car
	 * 
	 * @param length: updated the length of the railroad car
	 */
	public void setLength(double valOfLength) {
		this.length = valOfLength;
	}

// Methods

	/**
	 * Calculates the volume of a railroad car
	 * 
	 * @return: calculated volume of a railroad car
	 */
	public abstract double volume();

}
