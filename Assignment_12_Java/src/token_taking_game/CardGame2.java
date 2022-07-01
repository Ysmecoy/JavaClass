package token_taking_game;

import java.util.ArrayList;

public class CardGame2 {
	// data fields

		private ArrayList<Integer> cards; // represents the number of the cards
		private int turns; // represents the number of turns left. it will decrease by 1 after each move
		//private int max; // the maximum value found.

		// constructor
		
		public CardGame2() {};

		public CardGame2(ArrayList<Integer> valOfCards, int valOfTurns) {
			setCards(valOfCards);
			setTurns(valOfTurns);
			//max = new ArrayList<Character>();
		}
		
		// getters
				/**
				 * Returns the list of the card numbers
				 * 
				 * @return: the list of the card numbers
				 */
				public ArrayList<Integer> getCards() {
					return cards;
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
				/*public ArrayList<Character> getPath() {
					return path;
				}*/

				// Setters
				/**
				 * Updates the value of the target
				 * 
				 * @param target: updated the value of the target
				 */
				public void setCards(ArrayList<Integer> cards) {
					this.cards = cards;
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
				 *
				/*public void setPath(ArrayList<Character> path) {
					this.path = path;
				}*/
				
				//Method

				
				public ArrayList<Integer> FindArrayWithMax(ArrayList<Integer> cards, int turns, ArrayList<Integer> arrMax){
					int i = 0;
					
					if(i == turns) {
						return arrMax;
					}
					ArrayList<Integer> copyArray = new ArrayList<Integer> (cards);
					arrMax.add(copyArray.get(0));
					copyArray.remove(copyArray.get(0));
					
					if(copyArray.get(0+i) > copyArray.get(copyArray.size() - 1)) {
						arrMax.add(copyArray.get(0+i));
						copyArray.remove(copyArray.get(0+i));
						
					} else {
						
						arrMax.add(copyArray.size() - 1);
						copyArray.remove(copyArray.size()-1);
					}
					
					return FindArrayWithMax(cards, turns, arrMax);
					
					
				}
}
