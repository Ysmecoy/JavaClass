package distance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) throws IOException {
		// Open the input and output file.
		FileInputStream inputFile = new FileInputStream("points.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("distances.txt");
		PrintWriter writer = new PrintWriter(outputFile);

		// Read the 6 data fields which represents 2 points per row stored in the input
		// file one-by-one.
		while (scanner.hasNextDouble()) {
			double coordX1 = scanner.nextDouble(); // Read the coordX of the first point.
			double coordY1 = scanner.nextDouble(); // Read the coordY of the first point.
			double coordZ1 = scanner.nextDouble(); // Read the coordZ of the first point.
			double coordX2 = scanner.nextDouble(); // Read the coordX of the second point.
			double coordY2 = scanner.nextDouble(); // Read the coordY of the second point.
			double coordZ2 = scanner.nextDouble(); // Read the coordZ of the second point.

			// Create a 2 Point Objects using the data fields read in

			Point p1 = new Point(coordX1, coordY1, coordZ1);
			Point p2 = new Point(coordX2, coordY2, coordZ2);

			// Write the distance between the two points to the output file
			writer.printf("%.2f\n", p1.distance(p2));
		}

		// close the writer, outputFile, scanner, and inputFile.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();
	}

}

