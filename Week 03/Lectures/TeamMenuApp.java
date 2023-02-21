import java.util.Scanner;

public class TeamMenuApp {
	
	static Scanner s = new Scanner(System.in); //for user input; scanner is inside the class but outside the methods to be used by every method.
	static int addingIndex = 0; //class created to keep track of index when adding a member

	public static void main(String[] args) {
		
		/*
		 * Add team member
		 * View team member
		 * View all team members
		 * Delete team member by position
		 * Delete all team members
		 */
		
		
		String[] team = new String[5];
		int decision = 0; //Store whatever the user passes in for user input
		
		while(decision != -1){//keeps application running until user exits
			//TOP-DOWN APPPROACH: Write what a method is supposed to do, and then write the actual method afterwards.
			showMenu();
			decision = s.nextInt();
			
			if (decision < -1 || decision > 5) {
				System.out.println("Please pick a valid option");
			}else if (decision == 1) {
				showTeam(team);
			}else if (decision == 2) {
				showTeamMember(team);
			}else if (decision == 3) {
				addTeamMember(team);
			}else if (decision == 4) {
				deleteTeamMember(team);
			}else {
				deleteTeam(team);
			}
			
				
		
		}
		

	}
	
	public static void showMenu() {
		System.out.println("Please pick and option or enter -1 to exit.");
		System.out.println("1) Show Team");
		System.out.println("2) Show Team Member");
		System.out.println("3) Add a Team Member");
		System.out.println("4) Delete Team Member");
		System.out.println("5) Delete Team");
	}
								
	public static void showTeam(String[] method1){
		
		System.out.println("Team:");
		for (int i = 0; i < method1.length; i++) {
			System.out.println(i + ": " + method1[i]);
		}
		
	}
	
	public static boolean isValid(int input) {
		if (input >= 0 && input < 5) {
			return true;
		}else {
				System.out.println("Invalid input.");
			return false;
		}
	}

	public static void showTeamMember(String[] method2) {
		System.out.print("Which team member would you like to see? ");
		int teamNumber = s.nextInt();
		if (isValid(teamNumber)) {
		System.out.println(teamNumber + ": " + method2[teamNumber]);
		}
	}
	
	public static void addTeamMember(String[] method3) {
		System.out.print("Enter new member name: ");
		String newMember = s.next();
		if(isValid(addingIndex)) {
		method3[addingIndex++] = newMember;
		}
	}
	
	public static void deleteTeamMember(String[] method4) {
		System.out.println("Which team member would you like to delete?");
		int memberToDelete = s.nextInt();
		if (isValid(memberToDelete)) {
			method4[memberToDelete] = null;
			
		}
	}

	public static void deleteTeam(String[] method5) {
		for (int i = 0; i < method5.length; i++) {
			method5[i] = null;
		}
	}
	
}
