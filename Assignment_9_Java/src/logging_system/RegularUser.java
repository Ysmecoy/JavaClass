package logging_system;

import java.io.PrintWriter;

public class RegularUser {
	
	// Data Field

	private String username;
	
	// Constructors
	
	public RegularUser() {  // Default constructor
		setUserName("");
	}
	
	public RegularUser(String valOfUserName) {
		setUserName(valOfUserName);
	}
	
	// Getter
	
	/**
	 * Returns the value of username.
	 * @return: the value of username
	 */
	public String getUserName() {
		return username;
	}
	
	// Setter
	
	/**
	 * Updates the value of username
	 * @param username: Update value of username
	 */
	public void setUserName(String username) {
		this.username = username;
	}
	
	// Methods
	
	/** Converts the RegularUser object to a string for output.
    @return: a string representing the RegularUser object when this is sign in.
   */
	
	public void signIn(String dateTime, PrintWriter writer) {
		
		writer.println("Regular user " + "["+ username + "] "+ "signed in @" + " [" + dateTime + "]");

	}
	
	
	/** Converts the RegularUser object to a string for output.
    @return: a string representing the RegularUser object when this is sign in.
    */
	
	public void signOut(String dateTime, PrintWriter writer) {

		writer.println("Regular user " +"["+ username + "] " + "signed out @" + " [" + dateTime + "]");
	}
}
