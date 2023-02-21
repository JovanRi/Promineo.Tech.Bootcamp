package Dice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	
	/*
	 * Gets the collection of players for the game.
	 * @param input The user input
	 * @return The configured players for the game.
	 */
	
	public static List<Player>	getPlayers(Scanner input) {
		System.out.println("Enter how many player?");
		int playerCount = input.nextInt();
		input.nextLine();
		
		List<Player> players = new ArrayList<Player>();
		for(int i = 0; i < playerCount; i++) {
			System.out.printf("Enter player %d name.%n", i + 1);
			String name = input.nextLine();
			if ((name == null) || (name.isEmpty())){
				name = String.format("Player %d",  i + 1);
			}
			
			Player player = new Player(name);
			player.addDice(new StandardDice());
			player.addDice(new StandardDice());
			player.addDice(new StandardDice());
			player.addDice(new StandardDice());
			players.add(player);
		}
		return players;
	}
	
	/**
	 * Gets the number of rounds for the input to play.
	 * @param input Rounds to play.
	 * @return The number of desired rounds.
	 */
	
	public static int getNumberOfRounds(Scanner input) {
		System.out.println("How many rounds do you want to play?");
		int rounds = input.nextInt();
		
		return rounds;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Player> players = getPlayers(input);
		
		Game game = new Game();
		game.addPlayers(players);
		
		int numberOfRounds = getNumberOfRounds(input);
		game.start(numberOfRounds);
		

	}

}
