package edu.vcentry.methods;

public class LeaderBoard {

	public static void main(String[] args) {
		leaderBoard(1000, "Mani");
		leaderBoard("Raj", 100);
		leaderBoard(400);
		//leaderBoard(400.0d);
	}
	
	public static void leaderBoard(String name, int score) {
		if(score >= 1000) {
			System.out.println(name + "'s" + "  Position in Leaderboard is 1");
		} else if(score < 1000 && score >= 500) {
			System.out.println(name + "'s" + " Position in Leaderboard is 2");
		}else if(score < 500 && score >= 100) {
			System.out.println(name + "'s" + " Position in Leaderboard is 3");
		}else {
			System.out.println(name + "'s" + " Position in Leaderboard is 4");
		}
	}
	
	public static void leaderBoard(int score, String name) {
		leaderBoard(name, score);
	}

	public static void leaderBoard(int score) {
		String name = "Un known";
		leaderBoard(name, score);
	}
	
	public static void leaderBoard(double score) {
		String name = "Un known";
		System.out.println("Double Method called");
		if(score >= 1000) {
			System.out.println(name + "'s" + "  Position in Leaderboard is 1");
		} else if(score < 1000 && score >= 500) {
			System.out.println(name + "'s" + " Position in Leaderboard is 2");
		}else if(score < 500 && score >= 100) {
			System.out.println(name + "'s" + " Position in Leaderboard is 3");
		}else {
			System.out.println(name + "'s" + " Position in Leaderboard is 4");
		}
	}

}
