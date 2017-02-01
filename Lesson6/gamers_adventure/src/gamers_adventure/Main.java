package gamers_adventure;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

//TODO 1) Usunac niepotrzebny kod
//TODO 2) 
//TODO 3)generowanie mapy (poprawic i przetestowac/przedebugowac- nie dziala jeszcze zawsze)
//TODO 4)generowanie klucza do mapy
//TODO 5)lista zawierajaca mapy z poziomami

public class Main {
	static int compuerLevel = 1;
	static int currency;
	static boolean isLevelPassed;
	static char[][] gameBoard = new char[15][20];
	static final int NUMBERS_OF_AVAILABLE_FIELDS = 30;
	static final String[] DIRECTIONS = { "right", "left", "up", "down" };

	static HashMap<String, Boolean> availableDirection = new HashMap<String, Boolean>();

	public static void main(String[] args) {
		availableDirectionMap();
		generateEmptyBoard();
		generateMap();
		showBoard();
	}

	public static void availableDirectionMap() {
		for (int i = 0; i < DIRECTIONS.length; i++) {
			availableDirection.put(DIRECTIONS[i], false);
		}
	}

	public static void mainMenu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		for (;;) {
			System.out.println("Wybierz dzia³anie");
			System.out.println("0- Rozegraj grê");
			System.out.println("1- Zobacz ilosc sowich monet");
			System.out.println("2- Zobacz ceny ulepszen");
			System.out.println("3- Zobacz poziom sowjego komputera");
			System.out.println("4- Ulepsz komputer");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				oneRoundOfGame();
				break;
			case 1:
				System.out.println("Twoja ilosc monet to " + currency);
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			default:
				System.out.println("Brak danej pozycji w menu");
				break;
			}
		}
	}

	public static void pricesOfUpgrades() {
		System.out.println(
				"poziom komputera ulepsz jego sprawnosc co skutkuje wiekszym mnoznikiem monet (poziom komputera x monety za poziom");
		System.out.println("Komputer na poziomie 1 darmowy");
		System.out.println("Komputer na poziomie 2 10 monet");
		System.out.println("Komputer na poziomie 3 25 monet");
		System.out.println("Komputer na poziomie 4 50 monet");
		System.out.println("ZAOKONCZENIE GRY 100 MONTE");

	}

	public static void upgradesSystem(int usersCurrency) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Witaj w sklepie");
		System.out.println("Wybier poziom na ktory chcesz ulepszyc komputer");
		choice = sc.nextInt();
		switch (choice) {
		case 1:

			break;
		}

	}

	public static void oneRoundOfGame() {
		chosingLevel();
		levelsReward();
	}

	public static void levelsReward() {
		if (isLevelPassed) {
			int currencyGained = compuerLevel * 1;
			currency = currency + currencyGained;
			System.out.println("Masz obecnie: " + currency + " kredytow");
		}
	}

	public static boolean chosingLevel() {
		Random generator = new Random();
		int levelNumber = 1;
		// int levelNumber = generator.nextInt(4);
		switch (levelNumber) {
		case 0:
			level1();
			break;
		case 1:
			level2();
			break;
		// case 2:
		//
		// break;
		// case 3:
		//

		//
		// break;
		default:
			break;
		}
		return isLevelPassed;

	}

	public static void generateEmptyBoard() {
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				gameBoard[i][j] = '@';
			}
		}

	}

	public static void showBoard() {
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				System.out.print(gameBoard[i][j] + " ");

			}
			System.out.println();
		}
	}

	public static void generateMap() {
		Random generator = new Random();
		int positionX = generator.nextInt(gameBoard.length);
		int positionY = 0;
		gameBoard[positionX][positionY] = 'x';

		for (int i = 0; i < NUMBERS_OF_AVAILABLE_FIELDS; i++) {
			checkPossibilities(positionX, positionY);
			if (DIRECTIONS[chosePosibility()] == DIRECTIONS[0]) {
				positionY = positionY + 1;
				gameBoard[positionX][positionY] = 'x';
			} else if (DIRECTIONS[chosePosibility()] == DIRECTIONS[1]) {
				positionY = positionY - 1;
				gameBoard[positionX][positionY] = 'x';
			} else if (DIRECTIONS[chosePosibility()] == DIRECTIONS[2]) {
				positionX = positionX + 1;
				gameBoard[positionX][positionY] = 'x';
			} else {
				positionX = positionX - 1;
				gameBoard[positionX][positionY] = 'x';
			}
		}

	}

	public static void checkPossibilities(int x, int y) {
		if ((y + 1) < gameBoard[x].length && gameBoard[x][y + 1] == '@') {
			availableDirection.replace(DIRECTIONS[0], true);
		} else {
			availableDirection.replace(DIRECTIONS[0], false);
		}
		if ((y - 1) > 0 && gameBoard[x][y - 1] == '@') {
			availableDirection.replace(DIRECTIONS[1], true);
		} else {
			availableDirection.replace(DIRECTIONS[1], false);

		}
		if ((x + 1) < gameBoard.length && gameBoard[x + 1][y] == '@') {
			availableDirection.replace(DIRECTIONS[2], true);
		} else {
			availableDirection.replace(DIRECTIONS[2], false);

		}
		if ((x - 1) > 0 && gameBoard[x - 1][y] == '@') {
			availableDirection.replace(DIRECTIONS[3], true);
		} else {
			availableDirection.replace(DIRECTIONS[3], false);

		}

	}

	public static int chosePosibility() {
		Random generator = new Random();
		int option;
		do {
			option = generator.nextInt(DIRECTIONS.length);
		} while (!availableDirection.get(DIRECTIONS[option]));

		return option;
	}

	public static void level1() {
		Scanner sc = new Scanner(System.in);
		String key = "wwdwwawwwwdww";
		System.out.println("           ___ __  						  ");
		System.out.println("          |  _ __ x|   				   	  ");
		System.out.println("          | |							  ");
		System.out.println("          | |							  ");
		System.out.println("    ___ __| |	     					  ");
		System.out.println("   |  _ __ _|                       	  ");
		System.out.println("   | |									  ");
		System.out.println("   |o|		                 			  ");
		System.out.println("o- twoja pozycja, dojdz do x wpisujac droge");
		System.out.println("W- kork w gore|A-obrot w lewo|D-obrot w pawo");
		System.out.println();
		System.out.println("Wprowadz rozwiazanie");
		String answer = sc.nextLine();
		switch (answer) {
		case "wwdwwawwwwdww":
			isLevelPassed = true;
			for (int i = 0; i < 10; i++) {
				System.out.println();
			}
			System.out.println("           ___ __  						  ");
			System.out.println("          |  _ __ o|   				   	  ");
			System.out.println("          | |							  ");
			System.out.println("          | |							  ");
			System.out.println("    ___ __| |	     					  ");
			System.out.println("   |  _ __ _|                       	  ");
			System.out.println("   | |									  ");
			System.out.println("   | |		                 			  ");
			System.out.println();
			System.out.println("Gratulacje udalo ci sie przejsc poziom");
			break;

		default:
			isLevelPassed = false;
			System.out.println("Niestety nie przeszedles poziomu");
			break;
		}

	}

	public static void level2() {
		Scanner sc = new Scanner(System.in);
		String key = "wwwdwwdwwwawwawwww";
		System.out.println("                  ___                      ");
		System.out.println("     ___ __ _     |x|                      ");
		System.out.println("    |  _ __  |    | |                      ");
		System.out.println("    | |    | |    | |                      ");
		System.out.println("    | |    | |_ __| |                      ");
		System.out.println("    |o|    |___ __ _|                      ");
		System.out.println("                                           ");
		System.out.println("o- twoja pozycja, dojdz do x wpisujac droge");
		System.out.println("W- kork w gore|A-obrot w lewo|D-obrot w pawo");

		String answer = sc.nextLine();
		switch (answer) {
		case "wwwdwwdwwwawwawwww":
			isLevelPassed = true;
			for (int i = 0; i < 10; i++) {
				System.out.println();
			}
			System.out.println("                  ___                      ");
			System.out.println("     ___ __ _     |o|                      ");
			System.out.println("    |  _ __  |    | |                      ");
			System.out.println("    | |    | |    | |                      ");
			System.out.println("    | |    | |_ __| |                      ");
			System.out.println("    | |    |___ __ _|                      ");
			System.out.println("                                           ");
			System.out.println();
			System.out.println("Gratulacje udalo ci sie przejsc poziom");
			break;
		default:
			isLevelPassed = false;
			System.out.println("Niestety nie przeszedles poziomu");
			break;

		}
	}
}
