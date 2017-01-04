import java.util.Random;

public class Main {

	public static void main(String[] args) {

		System.out.println("DZIESIEC LOSOWYCH LICZB W TABLICY");

		int[] board;
		board = new int[10];
		int randomNumber;
		Random generator = new Random();
		System.out.println( board.length );
		
		for (int i = 0; i < board.length; i++) {
			randomNumber = generator.nextInt();
			board[i] = randomNumber;
			System.out.println("Kolejna komorka to: " + board[i]);
		

		}
	}

}
