package assignment_5_grayscale;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ColorToGrayscale {
	public static void main(String[] args) throws IOException {

		// Open input File, Scanner, output file and PrintWriter
		FileInputStream inputFile = new FileInputStream("colorImage.ppm");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("grayscaleImage.ppm");
		PrintWriter writer = new PrintWriter(outputFile);

		// jump over the first 4 values in the input file

		// read the first three lines: 1st line ->P3 (id for ppm image);
		// 2nd line -> pixel per row in the image and number of rows in the image, and
		// 3rd line -> color depth

		String IdPPM = scanner.next();
		int pixelsPerRow = scanner.nextInt();
		int numRows = scanner.nextInt(); //
		int colorDepth = scanner.nextInt();

		// write the header in the output file.

		writer.printf("%s\n%d %d\n%d\n", IdPPM, pixelsPerRow, numRows, colorDepth);

		// reading or scanning the rest of values in the input file which represent the
		// values of color (red, green, and blue) per each pixel in the image.

		while (scanner.hasNextInt()) {
			int red, green, blue;
			red = scanner.nextInt();
			green = scanner.nextInt();
			blue = scanner.nextInt();

			// convert pixel's color to gray scale.
			// if red = x, green = y, and blue = z; then, after the conversion should be
			// red = green = blue = 0.3x + 0.59y + 0.11z

			red = green = blue = (int) ((0.3 * red) + (0.59 * green) + (0.11 * blue));

			// write the new values or the conversion to the output file

			writer.printf("%d\n%d\n%d\n", red, green, blue);

		}
// close writer, outputFile, scanner and inputFile
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();

	}

}
