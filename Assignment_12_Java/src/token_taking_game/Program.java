package token_taking_game;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		
		

		// Open the input and output file.
		FileInputStream inputFile = new FileInputStream("games.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("result.txt");
		PrintWriter writer = new PrintWriter(outputFile);
		
		


		// data from the input file
		while (scanner.hasNext()) {

			int target = scanner.nextInt();
			int turns = scanner.nextInt();
			
			// create a Game object
			
			Game tokenGame = new Game(target, turns);
			
			// call method 
			
			tokenGame.play(target, turns);
			
			
			// write code to the outputfile
			
			tokenGame.printResult(writer);
	
			}
		
		// close the writer, outputFile, scanner, and inputFile.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();

	}

}
