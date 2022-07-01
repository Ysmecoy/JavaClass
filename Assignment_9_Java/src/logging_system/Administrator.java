package logging_system;

import java.io.PrintWriter;

public class Administrator extends RegularUser {
	
// Data field

private int id;
	
// Constructors
	

	public Administrator() { // default constructor
		super();
		setID(0);
	};
	
	public Administrator(String valOfUserName, int valOfId) {
		super(valOfUserName);
		setID(valOfId);
	}
	
// Getter
    
    /** Returns the value of the id.
        @return: the value of the id
    */
    public int getID() { return id; }
    
    // Setter
    
    /** Updates the value of the id.
        @param id: updated the value of the id
    */
    public void setID(int id) {
        this.id = id;
    }
    
    
  // Method
    
    /** Converts the administrator object to a string for output.
        @return: a string representing the administrator object when this sign in
    */
    @Override
	public void signIn(String dateTime, PrintWriter writer) {
		
		writer.println("Administrator " + "["+ getUserName() + "] "+ "(" + id + ") " + "signed in @" + " [" + dateTime + "]");
	}
    
    /** Converts the administrator object to a string for output.
    @return: a string representing the administrator object when this sign out
    */
    @Override
    public void signOut(String dateTime, PrintWriter writer) {

		writer.println("Administrator " + "["+ getUserName() + "] "+ "(" + id + ") " + "signed out @" + " [" + dateTime + "]");
	}
    
    
}
