package cars;

public class RefrigeratorCar extends BoxCar {

	// Data field

	private int temperature; // Represents the internal temperature of the refrigerator car.

	// Constructor

	public RefrigeratorCar() {
	}; // Default constructor

	public RefrigeratorCar(double valOfLength, double valOfWidth, double valOfHeight, int valOfTemp) {
		setLength(valOfLength);
		setWidth(valOfWidth);
		setHeight(valOfHeight);
		setTemperature(valOfTemp);
	}

	// Getters

	/**
	 * Returns the temperature of the refrigerator car
	 * 
	 * @return: the value of temperature of the refrigerator car
	 */
	public double getTemperature() {
		return temperature;
	}

	// Setters

	/**
	 * Updates the temperature of the refrigerator car
	 * 
	 * @param temperature: updated the value of temperature of the refrigerator car
	 */
	public void setTemperature(int valOfTemp) {
		temperature = valOfTemp;
	}

}
