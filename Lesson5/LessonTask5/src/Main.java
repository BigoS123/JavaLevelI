import java.util.Random;
import java.util.Scanner;

public class Main {

	static Random generator = new Random();
	final static int WIDTH = 9;
	final static int HEIGHT = 9;
	static char sudokuBoard[][] = new char[WIDTH][HEIGHT];
	static char numbers[] = "123456789".toCharArray();

	public static void main(String[] args) {

		preparingSudokuBoard();
		showMenu();
		switch (chosingLevel()) {
		case 1:
			generatingSudokuBoard(50);
			break;
		case 2:
			generatingSudokuBoard(40);
			break;
		case 3:
			generatingSudokuBoard(30);
			break;
		case 4:
			generatingSudokuBoard(25);
			break;
		default:
			System.out.println("Program zostal zakonczony");
			break;
		}
		showingBoard();
		
	}

	public static void preparingSudokuBoard() {

		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < HEIGHT; j++) {
				sudokuBoard[i][j] = '#';

			}
		}

	}

	public static void showingBoard() {

		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < HEIGHT; j++) {
				System.out.print(sudokuBoard[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void showMenu() {
		System.out.println("Dostepne poziomy rozgrywki: ");
		System.out.println("1.Latwy");
		System.out.println("2.Trudny");
		System.out.println("3.Sredni");
		System.out.println("4.Hard");
		System.out.println("5.Zakoncz program");
		System.out.println();

	}

	public static int chosingLevel() {
		System.out.println("WYbierz poziom rozgrywki: ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public static void generatingSudokuBoard(int numberOfDraws) {
		Random generator = new Random();
		int x;
		int y;
		int number;
		
		while(numberOfDraws != 0){
			
			x = generator.nextInt(WIDTH);
			y = generator.nextInt(HEIGHT);
			
			if(sudokuBoard[x][y] == '#'){
				number = generator.nextInt(9);
				sudokuBoard[x][y] = numbers[number];
				numberOfDraws--;
			}
			
			
		}

	}

	public static void fillingBoard() {

	}
	//
	// cout << "Dostepne poziomy rozgrywki: " << endl;
	// cout << "1.Latwy" << endl;
	// cout << "2.Trudny" << endl;
	// cout << "3.Sredni" << endl;
	// cout << "4.Hard" << endl;
	// cout << "5.Zakoncz program" << endl;
	// cout << endl;

}
