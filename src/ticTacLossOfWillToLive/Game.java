package ticTacLossOfWillToLive;

public class Game {
	
	public char[][] boardArray = new char[3][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println("lets Play TIC TAC TOE!");
				System.out.println("___|___|___");
				System.out.println("___|___|___");
				System.out.println("   |   |   ");
			}
			
	public static void display (char[][] arr) {
				
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (arr[i][j] != 0 && j!=2) 
					System.out.print(" " + arr[i][j] + " |");
				else if (arr[i][j] != 0 && j==2)
					System.out.print(" "+arr[i][j] + " ");
				else if (arr[i][j] == 0 && j!=2) 
					System.out.print(" " + arr[i][j] + " |");
				else if (arr[i][j] == 0 && j==2)
					System.out.print(" "+arr[i][j] + " "); 
			}
			System.out.println();
			if (i!=2)
				System.out.println("___________");
		}
				
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
