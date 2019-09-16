package ticTacLossOfWillToLive;

public class Game {
	
	public static char[][] boardArray = new char[3][3];
	public static char winner = '0';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static void input(int x, int y, char player) {
		//handles player inputs
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
		
		gameAlgorithm(x,y,player);
	}
	
	public static void gameAlgorithm(int x, int y, char player) {
		//handles game board data
		// x is column number, y is row number
		
		boardArray[y][x] = player;
		if (checkWin()) {
			winner = player;
		}
		
		runCPU();
		if (checkWin()){
			if (player == 'x') {
				winner = 'o';
			}else
				winner = 'x';
		}
		
	}
	
	public static void runCPU() {
		//handles CPU
		
		
		
	}
	
	public static boolean checkWin() {
		//returns boolean "true" if x OR o has won, otherise returns false
		return false;
	}

}
