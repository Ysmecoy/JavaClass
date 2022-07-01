package menu_generator;

	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class MenuGenerator {
		public static void main(String[] args) throws IOException {
			
			// Open the input and output file.
			FileInputStream inputFile = new FileInputStream("dishes.txt");
			Scanner scanner = new Scanner(inputFile);
			FileOutputStream outputFile = new FileOutputStream("menu.txt");
			PrintWriter writer = new PrintWriter(outputFile);

			// Create an ArrayList to store the dishType, DishPrice and dishName from the
			// input File

			ArrayList<Dish> appetizer = new ArrayList<>(); // empty ArrayList
			ArrayList<Dish> entree = new ArrayList<>(); // empty ArrayList
			ArrayList<Dish> dessert = new ArrayList<>(); // empty ArrayList

			// Read each row of the input file contains exactly 3 data fields, which are the type of the dish ("Appetizer", "Entree", or "Dessert"),
			//price of the dish (always a positive integer), and name of the dish (may contain spaces), in that order one-by-one.
			
			while (scanner.hasNext()) {
				
				String dishTypeS = scanner.next(); // Read the dishType
				int dishType = -1;
				switch (dishTypeS) {
				case "Appetizer":
					dishTypeS = "0";
					dishType = Integer.parseInt(dishTypeS);
					break;
				case "Entree":
					dishTypeS = "1";
					dishType = Integer.parseInt(dishTypeS);
					break;
				case "Dessert":
					dishTypeS = "2";
					dishType = Integer.parseInt(dishTypeS);
					break;
				}

				int dishPrice = scanner.nextInt(); // Read the dishPrice // *******I think I would need to change to string
				
				String dishNameInput = scanner.nextLine();
				String dishName = dishNameInput.trim(); // trim() to remove unwanted whitespaces at the beginning and the
														// end of the string.

				// Create a Dish Objects using the data fields read in

				Dish inputDish = new Dish(dishType, dishPrice, dishName);

				// Add each plate object to the appropriate ArrayLists to classify dishes in appetizer, entree, or dessert

				if (dishType == 0) {
					appetizer.add(inputDish);
				}
				if (dishType == 1) {
					entree.add(inputDish);
				}
				if (dishType == 2) {
					dessert.add(inputDish);

				}
			
			}

			// Write the menu in the output file
			writer.println("Menu");
			writer.println();
			writer.println("Appetizer");
			writer.println();
			for (Dish inputDish : appetizer) {
				writer.println(inputDish.toString());
			}
			writer.println();
			writer.println("Entree");
			writer.println();
			for (Dish inputDish : entree) {
				writer.println(inputDish.toString());
			}
			writer.println();
			writer.println("Dessert");
			writer.println();
			for (Dish inputDish : dessert) {
				writer.println(inputDish.toString());
			}

			// close the writer, outputFile, scanner, and inputFile.
			writer.close();
			outputFile.close();
			scanner.close();
			inputFile.close();
		}

	}
