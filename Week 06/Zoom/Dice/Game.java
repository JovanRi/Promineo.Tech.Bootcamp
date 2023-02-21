package Dice;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private List<Player> players;
	
	public Game() {
		players = new ArrayList<Player>();
	}
	
	/**
	 * Adds the players to the game
	 * @param players The list of players.
	 */
	public void addPlayers(List<Player> players) {
		for(Player player : players) {
			addPlayer(player);
		}
	}
	
	/**
	 * Adds a player to the games.
	 * @param player the player to add.
	 */
	
	public void addPlayer (Player player) {
		if(player != null) {
			players.add(player);
		}
		
	}
	
	/**
	 * Starts the game
	 * @param numberOfRounds Number of rounds to play.
	 */

	public void start(int numberOfRounds) {
		//Loop through the rounds, stop wehn desired number finished.
		//For each round, keep track of the winner
		for(int round = 0; round < numberOfRounds; round++) {
			
			//Clear out / reset the winner for the current round.
			Player winner = null;
			
			
			/*Each round, each player will roll their dice
			We'll check the previous highest value to the
			current roll. If higher, this roll becomes the highest. 
			*/
			for(Player player : players) {
				int value = player.roll();
				System.out.printf("Round [%d]: %s  rolls a %d. Dice: %s%n",
									round + 1, player.getName(),
									value, player.getDice());
				/*If no winner yet (first roll of the round)
				//Or the previous highest roll is less than the
				current roll, then our current player is the new
				winner/highest roller. */
				if((winner == null) || (winner.getTotal() < value)) {
					winner = player;
				}
			}
			
			System.out.printf("Round [%d]: Winner is %s%n",
					round + 1, winner.getName()); 
			
		}
		
	}

}
