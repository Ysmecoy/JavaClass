package larger_shape;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {

		// Open the input and output file.
		FileInputStream inputFile = new FileInputStream("shapes.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("result.txt");
		PrintWriter writer = new PrintWriter(outputFile);

		// create 2 Shape objects and set it as null

		Shape shapeCircle = null;
		Shape shapeSquare = null;

		// data from the input file
		while (scanner.hasNext()) {

			String firstShape = scanner.next();
			if (firstShape.equals("SQUARE")) {
				double side = scanner.nextDouble();
				shapeSquare = new Square(side);
			} else {
				double radius = scanner.nextDouble();
				shapeCircle = new Circle(radius);
			}

			String secondShape = scanner.next();
			if (secondShape.equals("SQUARE")) {
				double side = scanner.nextDouble();
				shapeSquare = new Square(side);
			} else {
				double radius = scanner.nextDouble();
				shapeCircle = new Circle(radius);
			}

			// call method compareTo() to figure out what the larger shape is and whatAmI()
			// to write in the outputfile

			if (firstShape.equals("SQUARE")) {
				if (shapeSquare.compareTo(shapeCircle) < 0) {
					writer.println(shapeCircle.whatAmI());
				} else {
					writer.println(shapeSquare.whatAmI());
				}
			}

			if (firstShape.equals("CIRCLE")) {
				if (shapeCircle.compareTo(shapeSquare) < 0) {
					writer.println(shapeSquare.whatAmI());
				} else {
					writer.println(shapeCircle.whatAmI());
				}
			}

		}
		// close the writer, outputFile, scanner, and inputFile.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();

	}

}
