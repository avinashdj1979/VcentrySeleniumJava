package edu.vcentry.methods;

public class Methods {
	
	public static void main(String[] arr) {
		
		leaderBoardPosition("Mansoor", 2000);
		
		String playerName = "Player2";
		leaderBoardPostion(1000);
		
		int score = 500;
		leaderBoardPostion(500, "Player3");

	}
	
	public static void leaderBoardPosition(final String playerName, final int score) {
		if (score >= 1000) {
			System.out.println(playerName + " is holding postion 1");
		} else if (score >= 500){
			System.out.println(playerName + " is holding postion 2");
		} else if (score >= 100){
			System.out.println(playerName + " is holding postion 3");
		} else {
			System.out.println(playerName + " is holding postion 4");
		}
	}
	
	public static void leaderBoardPostion(final int score) {
		greetPlayers();
		String playerName = "Spl Player";
		leaderBoardPosition(playerName, score);
	}
	
	public static void leaderBoardPostion(final int score, final String playerName) {
		greetPlayers();
		leaderBoardPosition(playerName, score);
	}
	
	public static void greetPlayers() {
		System.out.println("Welcome to my Club!! ");
	}
}
