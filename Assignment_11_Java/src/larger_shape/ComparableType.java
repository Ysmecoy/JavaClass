package larger_shape;

public interface ComparableType<T> {
	/**
	 * compares this object with another object.
	 * @param other: another object to compare with this object
	 * @return: a negative integer if this object is smaller; a positive integer if
	 *          this object is greater; {0} if the two objects are equal.
	 */

	int compareTo(T other);

}
