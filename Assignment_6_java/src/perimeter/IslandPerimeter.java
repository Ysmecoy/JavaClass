package perimeter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IslandPerimeter {

	public static int calcPerimeter(int[][] arrValues) {
		/*
		 * Calculates the perimeter of the island in the grid
		 * :param arrValues: two dimensional array of integers 
		 * :type arrValues: int[][]
		 * :rtype: int
		 */

        // First step: go through a for loop to find all the cell of lands.Then, keep a track and add to the countSide 4.
		//(the 4 sides of the square of side length 1)

		int countSide = 0;
		for (int i = 0; i < arrValues.length; i++) {
			for (int j = 0; j < arrValues[i].length; j++) {
				if (arrValues[i][j] == 1) {
					countSide += 4;
					// Second Step: the perimeter of the island is the count or measurement of the
					// outer sides in contact with the water.
					// so the program needs to subtract the sides of the cell that are connected to
					// other land.
					// with if conditional, the program will check if the cell above and to the left
					// is land. If these are squares of land, the program will subtract 2
					// because, for example, if the upper neighbor of cell [1][1] which is [0][1] is
					// ground; that means that cell [1][1] does not have the top side in contact
					// with the water and
					// cell [0][1] does not have the bottom in contact with the water. same
					// explanation for square of land with neighbor to the left

					// subtract sides from those squares connected to each other to the left and
					// above
					if (i > 0 && arrValues[i - 1][j] == 1) {
						countSide -= 2;
					}
					if (j > 0 && arrValues[i][j - 1] == 1) {
						countSide -= 2;
					}
				}
			}

		}
		return countSide;
	}

	public static void main(String[] args) throws IOException {

		// Open input File, Scanner, output file and PrintWriter
		FileInputStream inputFile = new FileInputStream("island.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("perimeter.txt");
		PrintWriter writer = new PrintWriter(outputFile);

		// read from the input files number of rows and number of columns
		int numRows;
		int numColumns;

		numRows = scanner.nextInt();
		numColumns = scanner.nextInt();

		// Create a 2-dimensional array of integers with the dimensions just read from
		// the input file

		int[][] arrGrids = new int[numRows][numColumns];

// Read the rest of values from the input file and store them in the 2-dimensional array just created.
		for (int i = 0; i < arrGrids.length; i++) {
			for (int j = 0; j < arrGrids[i].length; j++) {
				arrGrids[i][j] = scanner.nextInt();
			}
			System.out.print(arrGrids);
		}

// call  calcPerimeter method and write in the output file

		writer.printf("Perimeter: %d", calcPerimeter(arrGrids));
		
		System.out.print(arrGrids);

		// close the writer, outputFile, scanner, and inputFile.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();

	}

}
