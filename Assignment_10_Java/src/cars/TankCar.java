package cars;

public class TankCar extends RailroadCar {
	// Data field

	private double radius; // The tank car has the shape of a cylinder and the end of a cylinder is a
							// circle. radius represents the radius of the circle
// Constructor

	public TankCar() {
	}; // Default Constructor

	public TankCar(double valOfLength, double valOfRadius) {
		setLength(valOfLength);
		setRadius(valOfRadius);
	}

// Getters

	/**
	 * Returns the radius of the bottom of the cylinder
	 * 
	 * @return: the value of radius
	 */
	public double getRadius() {
		return radius;
	}

	// Setters

	/**
	 * Updates the value of the radius
	 * 
	 * @param radius: updated the value of the radius
	 */
	public void setRadius(double valOfRadius) {
		this.radius = valOfRadius;
	}

	// Methods

	/**
	 * Calculates the volume of a tank car
	 * 
	 * @return: calculated volume of a tank car
	 */

	@Override
	public double volume() {
		return Math.PI * Math.pow(getRadius(), 2) * getLength();
	}

}
