package distance;

public class Point {
	
	// Data fields

	private double coordX; // coordinate x of a point
	private double coordY; // coordinate y of a point
	private double coordZ; // coordinate z of a point

	// constructor

	public Point() {   // Default constructor
		
		this.coordX = 0.0;
		this.coordY = 0.0;
		this.coordZ = 0.0;

	} 

	public Point(double coordX, double coordY, double coordZ) {
		this.coordX = coordX;
		this.coordY = coordY;
		this.coordZ = coordZ;

	}

	// Getters

	/**
	 * Returns the coordX of the point.
	 * 
	 * @return: coordX of a point
	 */
	public double getCoordX() {
		return coordX;
	}

	/**
	 * Returns the coordY of the point.
	 * 
	 * @return: coordY of a point
	 */
	public double getCoordY() {
		return coordY;
	}

	/**
	 * Returns the coordZ of the point.
	 * 
	 * @return: coordZ of a point
	 */
	public double getCoordZ() {
		return coordZ;
	}

	// Setters

	/**
	 * Updates the coordX of the point.
	 * 
	 * @param coordX: Updated coordX of the point
	 */
	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}

	/**
	 * Updates the coordY of the point.
	 * 
	 * @param coordY: Updated coordY of the point
	 */
	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}

	/**
	 * Updates the coordZ of the point.
	 * 
	 * @param coordZ: Updated coordZ of the point
	 */
	public void setCoordZ(double coordZ) {
		this.coordZ = coordZ;
	}

	// Methods

	/**
	 * Calculates the distance between two points using the Cartesian formula.
	 * @param: a Point object
	 * @return: calculated distance between the current Point object and the Point
	 *          object passed in.
	 */
	public double distance(Point otherP) {
		double distanceTwoPoints;
		distanceTwoPoints = Math.sqrt(Math.pow((this.getCoordX() - otherP.getCoordX()), 2)
				+ Math.pow((this.getCoordY() - otherP.getCoordY()), 2)
				+ Math.pow((this.getCoordZ() - otherP.getCoordZ()), 2));
		return distanceTwoPoints;

	}

}
