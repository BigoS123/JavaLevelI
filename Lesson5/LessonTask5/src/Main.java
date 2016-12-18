import java.util.Random;
import java.util.Scanner;

public class Main {

	static Random generator = new Random();
	static String sudokuBoard[][];

	public static void main(String[] args) {

		creatingSudokuBoard();
		fillingBoard();

	}

	public static void creatingSudokuBoard() {

		String sudokuBoard[][] = new String[9][9];

	}

	public static void fillingBoard() {

		for (int i = 0; i < 9; i++) {
			for (int a = 0; i < 9; a++) {

				boolean b = generator.nextBoolean();

				if (b == false) {
					sudokuBoard[i][a] = " # ";
				} else if (b == false) {
					int c = generator.nextInt(9);
					sudokuBoard[i][a] = c;

				}

			}

		}

	}

	public static void showingResults() {

		for (int i = 0; i < 9; i++) {
			System.out.println(
					sudokuBoard[i][1] + sudokuBoard[i][2] + sudokuBoard[i][3] + sudokuBoard[i][4] + sudokuBoard[i][5]
							+ sudokuBoard[i][6] + sudokuBoard[i][7] + sudokuBoard[i][8] + sudokuBoard[i][9]);

		}

	}

}
