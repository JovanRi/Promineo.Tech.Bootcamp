package Dice;

import java.util.ArrayList;
import java.util.List;

/*
 * Represnts a player in the game.
 */

public class Player implements Rollable{
	private String name;
	private List<Dice> dices;
	
	public Player(String name) {
		dices = new ArrayList<Dice>();
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Adds the dice for the player
	 * @param dice The dice to add.
	 */
	public void addDice(Dice dice) {
		if(dice != null) {
			dices.add(dice);
		}
		
	}
		
	/**
	 * Rolls the dice and returns the sum of the dice.
	 * @return The sum.
	 */

	public int roll() {
		int total = 0;
		for(Dice dice : dices) {
			int value = dice.roll();
			total += value;
		}
		return total;
	}
	
	/**
	 * Gets the value of all the dice as a comma separated string.
	 * e.g. 4,4,2,6.
	 * @return The face value of the dice.
	 */

	public Object getDice() {
		StringBuilder output = new StringBuilder();
		for(Dice dice : dices) {
			output.append(dice.getValue());
			output.append(",");
		}
		return output.toString();
	}
	
	/**
	 * Gets the total value of all the dice faces.
	 * @return The total value.
	 */

	public int getTotal() {
		int total = 0;
		for(Dice dice : dices) {
			total += dice.getValue();
		}
		return total;
	}

}
