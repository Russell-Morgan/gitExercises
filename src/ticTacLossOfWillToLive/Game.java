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
		
		runCPU(player);
		if (checkWin()){
			if (player == 'x') {
				winner = 'o';
			}else
				winner = 'x';
		}
		
	}
	
	public static void runCPU(char player) {
		//handles CPU
		char cpuToken;
		if (player == 'x') {
			cpuToken = 'o';
		}else {
			cpuToken = 'x';
		}
		int turnCount = 0;
		
		for(int r = 0; r != 3; r++) {
			for(int c = 0; c != 3; c++) {
				if (boardArray[r][c] == player) {
					turnCount++;
				}
			}
		}
		
		if (boardArray == null) {
			boardArray[1][1] = cpuToken;
		}else if (turnCount >= 2) {
			
			//check to see if opponent has to be blocked, then block them.
			if (true) {
				
			}else {
				//if player doesnt have to be blocked
				
			}
			
		}else if (boardArray[1][1] == '\u0000') {
			boardArray[1][1] = cpuToken;
		}else if (boardArray[1][1] != '\u0000') {
			if (boardArray[0][0] == '\u0000') {
				boardArray[0][0] = cpuToken;
			}else if (boardArray[2][0] == '\u0000') {
				boardArray[2][0] = cpuToken;
			}else if (boardArray[2][2] == '\u0000') {
				boardArray[2][2] = cpuToken;
			}else if (boardArray[0][2] == '\u0000') {
				boardArray[0][2] = cpuToken;
			}
		}else {
			for(int g = 0; g == 3; g++) {
				for(int h = 0; h == 3; h++) {
					if (boardArray[g][h] == '\u0000') {
						boardArray[g][h] = cpuToken;
						return;
					}
				}
			}
		}
		
	}
	
	public static boolean checkWin() {
		//returns boolean "true" if x OR o has won, otherise returns false
		return false;
	}

}
