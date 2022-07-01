package Assignment_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PopulationGrowth {
	public static void main(String[] args) throws IOException {

		// open input and output files
		FileInputStream inputFile = new FileInputStream("population.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("result.txt");
		PrintWriter writer = new PrintWriter(outputFile);

		// Read the population and increasing rates of populations in the input file
		// one-by-one.
		int populationA = scanner.nextInt();
		int populationB = scanner.nextInt();
		int populationC = scanner.nextInt();
		double annualIncrRateA = scanner.nextDouble();
		double annualIncrRateB = scanner.nextDouble();
		double annualIncrRateC = scanner.nextDouble();

		// Calculate years when the population of town A until is greater than the population of B and C.
				/* the increasing rate of populations A, B, and C  are constant; that means the growth of each population is steadily, moreover,
				the growth rate of A is greater than population B and C; which means, that when the 
				the population of A becomes greater with respect to one of the populations (B or C),
				the condition "population A is greater than or equal to population B and C" is fulfilled;
				in other words, populations B and C become smaller than A.*/
		
		int years = 0; // initialize the counter
		
		while (populationC >= populationA || populationB >= populationA ) {
				populationB += annualIncrRateB * populationB;
				populationC += annualIncrRateC * populationC;
				populationA += annualIncrRateA * populationA;

				years++;
		}
			
		// write to output file
		writer.println("Number of Years: " + years);
		writer.println("Population of Town A: " + populationA);
		writer.println("Population of Town B: " + populationB);
		writer.println("Population of Town C: " + populationC);

		// close the files

		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();

	}

}


