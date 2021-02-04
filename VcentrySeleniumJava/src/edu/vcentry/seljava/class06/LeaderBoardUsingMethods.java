package edu.vcentry.seljava.class06;

public class LeaderBoardUsingMethods {

	public static void main(String[] args) {
		int score = 2000;
		findPostion("Sethu", score);
		String playerName = "Rishi";
		score = 400;
		findPostion(playerName, score);
		
		findPostion();
	}
	
	public static void findPostion(String playerName, int score) {		
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
	
	public static void findPostion(int score, String playerName) {		
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
	
	public static void findPostion(int score, int playerName) {		
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
	
	public static void findPostion() {		
		String playerName = "Unknown";
		int score = -1;
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
}
