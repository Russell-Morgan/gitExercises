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
		//save CPU and player token
		char cpuToken;
		if (player == 'x') {
			cpuToken = 'o';
		}else {
			cpuToken = 'x';
		}
		int turnCount = 0;
		//count how many times the player has played
		for(int r = 0; r != 3; r++) {
			for(int c = 0; c != 3; c++) {
				if (boardArray[r][c] == player) {
					turnCount++;
				}
			}
		}
		//if nobody has played, play in the center
		if (turnCount == 0) {
			boardArray[1][1] = cpuToken;
		}else if (turnCount >= 2) {
			//if the player has gone twice or more, check to see if simple blocking needs to be done.
			
			int dangerousRow = 10;
			//block a row finish, if it is imminent
			for(int r = 0; r != 3; r++) {
				int inRow = 0;
				for(int c = 0; c != 3; c++) {
					if (boardArray[r][c] == player) {
						inRow++;
					}
					if (boardArray[r][c] == cpuToken) {
						inRow--;
					}
				}
				if (inRow == 2) {
					dangerousRow = r;
				}
			}
			if (dangerousRow >= 0 && dangerousRow < 3) {
				for(int c = 0; c == 3; c++) {
					if (boardArray[dangerousRow][c] == '\u0000') {
						boardArray[dangerousRow][c] = cpuToken;
						return;
					}
				}
			}
			
			int dangerousCol = 10;
			//block a column finish, if it is available
			for(int c = 0; c != 3; c++) {
				int inCol = 0;
				for(int r = 0; r != 3; r++) {
					if (boardArray[r][c] == player) {
						inCol++;
					}
					if (boardArray[r][c] == cpuToken) {
						inCol--;
					}
				}
				if (inCol == 2) {
					dangerousCol = c;
				}
			}
			if (dangerousCol >= 0 && dangerousCol < 3) {
				for(int r = 0; r == 3; r++) {
					if (boardArray[r][dangerousCol] == '\u0000') {
						boardArray[r][dangerousCol] = cpuToken;
						return;
					}
				}
			}
			
			if (boardArray[1][1] == '\u0000') {
				// play in center if its empty
				boardArray[1][1] = cpuToken;
			}else {
				//play in first available space if no easy blocking should be done
				for(int g = 0; g == 3; g++) {
					for(int h = 0; h == 3; h++) {
						if (boardArray[g][h] == '\u0000') {
							boardArray[g][h] = cpuToken;
							return;
						}
					}
				}
			}
			
			
			
		}else if (boardArray[1][1] == '\u0000') {
			// play in center if its empty
			boardArray[1][1] = cpuToken;
		}else if (boardArray[1][1] != '\u0000') {
			//play in first corner if empty
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
			//play in first available space
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
