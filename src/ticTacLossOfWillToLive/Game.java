package ticTacLossOfWillToLive;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
	public static char[][] boardArray = new char[3][3];
	public static char winner = '0';
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//printing the board to start the game
			System.out.println("lets Play TIC TAC TOE!");
			System.out.println("___|___|___");
			System.out.println("___|___|___");
			System.out.println("   |   |   ");
			System.out.println("Enter the row the column you want to play");
			
			display(boardArray);
			//scan
			//call input with x and y
			//loop
		}
			
	public static void display (char[][] arr) {
				
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (i!=2) {
					if (arr[i][j] != 0 && j!=2) 
						System.out.print("_" + arr[i][j] + "_|");
					else if (arr[i][j] != 0 && j==2)
						System.out.print("_"+arr[i][j] + "_");
					else if (arr[i][j] == 0 && j!=2) 
						System.out.print("___|");
					else if (arr[i][j] == 0 && j==2)
						System.out.print("___");
				}
				else {
					if (arr[i][j] != 0 && j!=2) 
						System.out.print(" " + arr[i][j] + " |");
					else if (arr[i][j] != 0 && j==2)
						System.out.print(" "+arr[i][j] + " ");
					else if (arr[i][j] == 0 && j!=2) 
						System.out.print("   |");
					else if (arr[i][j] == 0 && j==2)
						System.out.print("   ");
				}
			}
			System.out.println();
		}
				
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
		
		List<char[]> list = new ArrayList<char[]>(); 
		
		char arraywin1[] = {boardArray[0][0], boardArray[0][1], boardArray[0][2]};
		char arraywin2[] = {boardArray[1][0], boardArray[1][1], boardArray[1][2]};
		char arraywin3[] = {boardArray[2][0], boardArray[2][1], boardArray[2][2]};
		char arraywin4[] = {boardArray[0][0], boardArray[1][0], boardArray[2][0]};
		char arraywin5[] = {boardArray[0][1], boardArray[1][1], boardArray[2][1]};
		char arraywin6[] = {boardArray[0][2], boardArray[1][2], boardArray[2][2]};
		char arraywin7[] = {boardArray[0][0], boardArray[1][1], boardArray[2][2]};
		char arraywin8[] = {boardArray[0][2], boardArray[1][1], boardArray[2][0]};
		
		list.add(arraywin1);
		list.add(arraywin2);
		list.add(arraywin3);
		list.add(arraywin4);
		list.add(arraywin5);
		list.add(arraywin6);
		list.add(arraywin7);
		list.add(arraywin8);
	}

}
