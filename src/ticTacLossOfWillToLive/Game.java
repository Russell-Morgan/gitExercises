package ticTacLossOfWillToLive;

import java.util.Scanner;

public class Game {
	
	public static char[][] boardArray = new char[3][3];
	public static char winner = '0';
	static int row;
	static int column;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
			//printing the board to start the game
			System.out.println("lets Play TIC TAC TOE!");
			System.out.println("___|___|___");
			System.out.println("___|___|___");
			System.out.println("   |   |   ");
			System.out.println("Enter the row you want to play");
			row = scan.nextInt();
			System.out.println("Enter the column you want to play");
			column = scan.nextInt();
			
			
			while (!checkWin()) {
				checkWin();
				display(boardArray);
			}
			//scan
			//call input with x and y
			//loop
		}
			
	public static void display (char[][] arr) {
				
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				//checks what row is to be printed and prints _|_|_ or  | | 
				if (i!=2) {
					//checks if each tile is empty and prints accordingly
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
					//checks if each tile is empty and prints accordingly
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
		//returns boolean "true" if x OR o has won, otherwise returns false
		return false;
	}

}
