package logging_system;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {

		// Open the input and output file.
		FileInputStream inputFile = new FileInputStream("users.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("log.txt");
		PrintWriter writer = new PrintWriter(outputFile);

		// create a RegularUser object and set it as null

		RegularUser user = null;

		// Read the data fields from the input file

		while (scanner.hasNext()) {
			// read the in/out operation (status), type of user, username, dateTime variables from the input file
			String status = scanner.next();
			String userType = scanner.next();
			String username = scanner.next();
			String dateTime = null;

			if (userType.equals("ADM")) {
				int id = scanner.nextInt();
				dateTime = scanner.nextLine();
				dateTime = dateTime.trim();

				// instantiate the object as Administrator
				user = new Administrator(username, id);
			}
               
			if (userType.equals("REG")) {
				dateTime = scanner.nextLine();
				dateTime = dateTime.trim();
				
				// instantiate the object as a new RegularUser
				user = new RegularUser(username);
			}

			// write the message to the output file by calling method signIn() or signOut(),
			// based on the type of current activity ("IN" or "OUT").

			if (status.equals("IN")) {
				user.signIn(dateTime, writer);

			} else {
				user.signOut(dateTime, writer);

			}

		}

		// close the writer, outputFile, scanner, and inputFile.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();

	}

}
