package token_taking_game;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Game {
	// data fields
	private int target; // represents the number of tokens to reach
	private int turns; // represents the number of turns left. it will decrease by 1 after each move
	private ArrayList<Character> path; // this stores the path to reach the winning state. it will be empty if
										// it is impossible to win the game.

	// constructor

	public Game(int valOfTarget, int valOfTurns) {
		setTarget(valOfTarget);
		setTurns(valOfTurns);
		path = new ArrayList<Character>();
	}

	// getters
	/**
	 * Returns the value of the target
	 * 
	 * @return: the value of the target
	 */
	public int getTarget() {
		return target;
	}

	/**
	 * Returns the value of the turns
	 * 
	 * @return: the value of the turns
	 */
	public int getTurns() {
		return turns;
	}

	/**
	 * Returns the values of the path
	 * 
	 * @return: the values of the path
	 */
	public ArrayList<Character> getPath() {
		return path;
	}

	// Setters
	/**
	 * Updates the value of the target
	 * 
	 * @param target: updated the value of the target
	 */
	public void setTarget(int target) {
		this.target = target;
	}

	/**
	 * Updates the value of maximum turns
	 * 
	 * @param target: updated the value of maximum turns
	 */
	public void setTurns(int turns) {
		this.turns = turns;
	}

	/**
	 * Updates the values in the ArrayList or path
	 * 
	 * @param target: updated the value of the path
	 */
	public void setPath(ArrayList<Character> path) {
		this.path = path;
	}

	// Method

	/**
	 * Finds a valid path to match or find a target value in a token-taking game.
	 * 
	 * @param tokens: an integer. the current value to compare with the target value
	 * @return: returns a boolean, where a true means that a valid path is found and
	 *          false means that a dead end is reached.
	 */

	int tokens = 27;



	public boolean play(int tokens) {
		
		System.out.print(turns + " turns before conditional");

		// Base cases
		if (tokens == target) {
			return true;
		}
		if (turns == 0) {
			return false;
		}

		// recursive approach

		tokens = tokens + 39;
		path.add('A');
		turns--;
		System.out.print(turns + " turns before conditional");

		if (play(tokens)) { // check if the condition or token match the target value
			return true;
// restore the previous state if the condition return false; that means, remove the last element in the path, subtract 39, and decrease the turns
		} else {
			path.remove(path.size() - 1);
			tokens = tokens - 39;
			turns++;
		}

		if (tokens % 2 == 0) {
			tokens = tokens / 2;
			path.add('B');
			turns--;
			if (play(tokens)) {
				return true;
// restore the previous state if the condition return false; that means, remove the last element in the path, multiply by 2, and decrease the turns
			} else {
				path.remove(path.size() - 1);
				tokens = tokens * 2;
				turns++;
			}

		}

		return false;
	}

	// wrapper method

	/**
	 * Solve the token-taking game using as parameters a target value and the number
	 * of turns
	 */

	public boolean play(int target, int turns) {
		System.out.print(turns);
		return play(tokens);
	}

	/**
	 * Print a "path" to reach exactly K tokens within N turns.
	 * 
	 * @param writer: a PrintWriter object that writes to output file
	 */

	public void printResult(PrintWriter writer) {

		if (getPath().isEmpty()) {
			writer.println("Dead End");
		} else {

			for (Character p : path) {
				writer.print(p.toString());

			}
			writer.println();

		}

	}

}
