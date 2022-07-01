package menu_generator;

public class Dish {
	// Data Fields
	private String dishName; // The name of the dish ( e.g., "Chilled Cucumber Soup")
	private int dishType; // e.g appetizer (value 0), entree (value 1), or dessert (value 2)
	private int dishPrice; // the price (in USD) - always a positive integer

	// constructor

	public Dish() {
	} // Default constructor

	public Dish(int dishType, int dishPrice, String dishName) {
		this.dishName = dishName;
		this.dishType = dishType;
		this.dishPrice = dishPrice;
	}

	// Getters

	/**
	 * Returns the name of the dish.
	 * 
	 * @return: name of the dish
	 */
	public String getDishName() {
		return dishName;
	}

	/**
	 * Returns the type of dish
	 * 
	 * @return: The type of dish
	 */
	public double getdishType() {
		return dishType;
	}

	/**
	 * Returns the price of the dish.
	 * 
	 * @return: the price of the dish
	 */
	public double getdishPrice() {
		return dishPrice;
	}

	// Setters

	/**
	 * Updates the name of the dish
	 * 
	 * @param dishName: Updated the name of the dish
	 */
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	/**
	 * Updates the type of the dish.
	 * 
	 * @param dishType: Updated the type of the dish
	 */
	public void setdishType(int dishType) {
		this.dishType = dishType;
	}

	/**
	 * Updates the price of the dish
	 * 
	 * @param dishPrice: Updated the price of the dish
	 */
	public void setdishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}

	// Methods
	
	public void menu() {
		return;
	}

	@Override
	public String toString() {
		return String.format("%s $(%d)", dishName, dishPrice);
	}

}

