package ticTacLossOfWillToLive;

public class Game {
	
	public char[][] boardArray = new char[3][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static void input(int x, int y) {
		if (x > 2) {
			System.out.println("invalid input. Please try again");
			return;
		}
		if (x < 0) {
			System.out.println("invalid input. Please try again");
			return;
		}
		if (y > 2) {
			System.out.println("invalid input. Please try again");
			return;
		}
		if (y < 0) {
			System.out.println("invalid input. Please try again");
			return;
		}
		
		gameAlgorithm(x,y);
	}
	
	public static void gameAlgorithm(int x, int y) {
		
	}

}
