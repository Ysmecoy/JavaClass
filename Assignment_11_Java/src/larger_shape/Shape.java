package larger_shape;

public abstract class Shape implements ComparableType<Shape> {

	// Methods

	/**
	 * Calculates the area of a Shape
	 * @return: calculated area of a Shape
	 */
	public abstract double area();

	/**
	 * Figure out what type of Shape
	 * @return: The type of Shape
	 */
	public abstract String whatAmI();

	/**
	 * Compares the size of this Shape with another Shape.
	 * @param other: another Shape to compare with
	 * @return: a negative integer if this Shape has smaller area than the other
	 *          Shape; a positive integer if this Shape has greater area than the
	 *          other Shape; {0} if this Shape has the same area as the other Shape
	 */
	@Override
	public int compareTo(Shape other) {
		
		return (int) (this.area() - other.area());

	};

}
