import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("DZIESIÊÆ LOSOWYCH LICZB W TABLICY");
		
		int[] board; 
		board = new int[9];
		int randomNumber;
		Random generator = new Random();
		
		for (int i = 0; i < 10; i++){
		randomNumber = generator.nextInt();
		board[i] = randomNumber;
        
		for (i = 0; i < 10; i++)
            System.out.println("Kolejna komórka to: " + board[i]);
			
			
		}
	}

}
