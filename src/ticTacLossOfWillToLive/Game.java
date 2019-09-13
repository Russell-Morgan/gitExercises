package ticTacLossOfWillToLive;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static void input(int x, int y) {
		if (x > 2) {
			System.out.println("invalid input. Please try again");
			display();
		}
		if (x < 0) {
			System.out.println("invalid input. Please try again");
			display();
		}
		if (y > 2) {
			System.out.println("invalid input. Please try again");
			display();
		}
		if (y < 0) {
			System.out.println("invalid input. Please try again");
			display();
		}
		
		algorithm(x,y)
	}

}
