
public class SimpleTeam {

	public static void main(String[] args) {
		
		Player p1 = new Player("Thomas", "Full Back", "Runs Fast");
		Player p2 = new Player("Sally", "Quarter Back", "Throws Far");
		
		Team team = new Team("Really Good Football Team");	
		team.addPlayer(p1);
		team.addPlayer(p2);
		team.explain();
		
		team.removePlayer("Thomas");
		team.explain();
		

	}

}
