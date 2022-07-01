package cars;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {

		// Open the input and output file.
		FileInputStream inputFile = new FileInputStream("cars.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("volumes.txt");
		PrintWriter writer = new PrintWriter(outputFile);

		// create a RailroadCar object and set it as null

		RailroadCar storageCar = null;

		// data from the input file
		while (scanner.hasNext()) {

			String carType = scanner.next();
			if (carType.equals("Tank")) {
				double length = scanner.nextDouble();
				double radius = scanner.nextDouble();

				// instantiate the object as TankCar
				storageCar = new TankCar(length, radius);
			}

			if (carType.equals("Box")) {
				double length = scanner.nextDouble();
				double width = scanner.nextDouble();
				double height = scanner.nextDouble();

				// instantiate the object as BoxCar
				storageCar = new BoxCar(length, width, height);
			}

			if (carType.equals("Refrigerator")) {
				double length = scanner.nextDouble();
				double width = scanner.nextDouble();
				double height = scanner.nextDouble();
				int temperature = scanner.nextInt();

				// instantiate the object as RefrigeratorCar
				storageCar = new RefrigeratorCar(length, width, height, temperature);
			}

			// call method volume() to calculate the volume of each railroad car

			writer.printf("%.2f\n", storageCar.volume());

		}
		// close the writer, outputFile, scanner, and inputFile.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();

	}
}
