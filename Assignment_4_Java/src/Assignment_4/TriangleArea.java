package Assignment_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) throws IOException {
		// Open input and output files.
		FileInputStream inputFile = new FileInputStream("triangles.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("areas.txt");
		PrintWriter writer = new PrintWriter(outputFile);

		// Read the 3 data files or 3 side lengths of a (possible) triangle.
		
		while (scanner.hasNextDouble()) {

			double sideA = scanner.nextDouble();
			double sideB = scanner.nextDouble();
			double sideC = scanner.nextDouble();
			double s; // half perimeter of a triangle
			double areaTriangle;

			if ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA) {
				
				s = (sideA + sideB + sideC) / 2; // half perimeter of a triangle

				areaTriangle = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // triangle's area - Heron's formula
				
				// write the area of a valid triangle with 2 decimal places and in a new line
				writer.printf("%.2f\n", areaTriangle);
			}
			else {
				writer.println("Invalid Triangle"); // output when the 3 side lengths in the input file cannot form a triangle
			}

		}
		// Close the files.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();
	}
}

