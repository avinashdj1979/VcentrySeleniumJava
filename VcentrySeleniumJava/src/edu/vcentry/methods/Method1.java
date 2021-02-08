package edu.vcentry.methods;

public class Method1 {

	public static void main(String[] args) {
		String playerName = "Player 1";
		int score = 1000;
		
		leaderBoardPosition("Player 1", 1000);
		
		playerName = "Player 2";
		score = 500;
		
		leaderBoardPosition(score, playerName);
		
		leaderBoardPosition(500);
		greetPlayers();
		
		leaderBoardPosition(500.0d, "Player Double");
		
		greetPlayers();
		greetPlayers();
		greetPlayers();
		greetPlayers();
		greetPlayers();
		greetPlayers();
		

	} // End of Scope
	
	public static void leaderBoardPosition( final String playerName, final int score) {
		greetPlayers();
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
	
	public static void leaderBoardPosition(int score) {
		String playerName = "Hidden";
		System.out.println("Second overloaded method");
		greetPlayers();
		leaderBoardPosition(playerName, score);

	}
	
	public static void leaderBoardPosition(int score, final String playerName) {
		System.out.println("Third overloaded method");
		greetPlayers();
		leaderBoardPosition(playerName, score);
	}
	
	public static void leaderBoardPosition(double score, final String playerName) {
		System.out.println("overloaded method with double");
		greetPlayers();
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
	
	public static void greetPlayers() {
		System.out.println("Welcome Player");
	}

}
