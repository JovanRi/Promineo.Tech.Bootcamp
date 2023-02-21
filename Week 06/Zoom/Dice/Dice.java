package Dice;

/**
 * Represents common features of dice.
 */

public abstract class Dice implements Rollable{
	private int value;
	private int sides;
	
	protected Dice(int sides) {
		this.sides = sides;
		
	}
	
	public int getValue() {
		return value;
	}
	
	protected void setValue(int value) {
		this.value = value;
	}

	public int getSides() {
		return sides;
	}
	
	@Override
	public String toString() {
		return String.valueOf(getValue());
	}

}
