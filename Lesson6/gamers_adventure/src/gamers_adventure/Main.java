package gamers_adventure;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

//TODO 1) Refactofing kodu, uporz¹dkowac kod i popatrzeæ gdzie jeszcze mo¿na by stworzyæ funkcjê


public class Main {
	public static int computerLevel = 1;
	static int currency = 0;
	static char[][] gameBoard = new char[15][20];
	static final int NUMBERS_OF_AVAILABLE_FIELDS = 30;
	static final String[] DIRECTIONS = { "right", "up", "down" };
	static char[] gameKey = new char[NUMBERS_OF_AVAILABLE_FIELDS];
	static HashMap<String, Boolean> availableDirection = new HashMap<String, Boolean>();

	public static void main(String[] args) {
		mainMenu();
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
			clearConsole();
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
	
				pricesOfUpgrades();
				break;
			case 3:

				System.out.println("Pozion twojego komputera " + computerLevel);
				break;
			case 4:
			
				upgradesSystem();
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
		System.out.println("Komputer na poziomie 2 5 monet");
		System.out.println("Komputer na poziomie 3 10 monet");
		System.out.println("Komputer na poziomie 4 20 monet");
		System.out.println("ZAOKONCZENIE GRY 30 MONET");

	}

	public static void upgradesSystem() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Witaj w sklepie");
		System.out.println("Wybier poziom na ktory chcesz ulepszyc komputer");
		choice = sc.nextInt();
		switch (choice) {
		case 2:
			upgradingComputer(5, 2);
			break;
		case 3:
			upgradingComputer(10, 3);
			break;
		case 4:
			upgradingComputer(20, 4);
			break;
		default:
			System.out.println("Nie ma takiego pziomu komputera");
			
		}

	}

	public static void oneRoundOfGame() {
		availableDirectionMap();
		generateEmptyBoard();
		generateMap();
		showBoard();
		levelsReward(compareKey(getUsersKey(), String.valueOf(gameKey)));
	}

	public static void levelsReward(boolean passedLevel) {
		if (passedLevel) {
			int currencyGained = computerLevel * 1;
			currency = currency + currencyGained;
			System.out.println("Masz obecnie: " + currency + " kredytow");
		}
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
			int indexDirection = chosePosibility();
			if (DIRECTIONS[indexDirection] == DIRECTIONS[0]) {
				positionY = positionY + 1;
				gameBoard[positionX][positionY] = 'x';
				gameKey[i] = 'd';
			} else if (DIRECTIONS[indexDirection] == DIRECTIONS[1]) {
				positionX = positionX - 1;
				gameBoard[positionX][positionY] = 'x';
				gameKey[i] = 'w';
			} else {
				positionX = positionX + 1;
				gameBoard[positionX][positionY] = 'x';
				gameKey[i] = 's';
			}
		}

	}

	public static void checkPossibilities(int x, int y) {
		if ((y + 1) < gameBoard[x].length && gameBoard[x][y + 1] == '@') {
			availableDirection.replace(DIRECTIONS[0], true);
		} else {
			availableDirection.replace(DIRECTIONS[0], false);
		}

		if ((x - 1) > 0 && (y - 1) >= 0 && gameBoard[x - 1][y] == '@' && gameBoard[x - 1][y - 1] == '@') {
			availableDirection.replace(DIRECTIONS[1], true);
		} else {
			availableDirection.replace(DIRECTIONS[1], false);

		}
		if ((x + 1) < gameBoard.length && (y - 1) >= 0 && gameBoard[x + 1][y] == '@'
				&& gameBoard[x + 1][y - 1] == '@') {
			availableDirection.replace(DIRECTIONS[2], true);
		} else {
			availableDirection.replace(DIRECTIONS[2], false);

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

	public static boolean compareKey(String answer, String labirynthKey) {

		if (answer.equals(labirynthKey)) {
			System.out.println("Gratulacje przeszedles labirynt");
			return true;
		} else {
			System.out.println("Nie udalo ci sie przejsc labiryntu wprowadz klucz ponownie");
			return false;
		}

	}

	public static void showKey() {
		System.out.print(gameKey);
	}

	public static void clearConsole() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}

	public static String getUsersKey() {
		System.out.println("Wprowadz klucz do labiryntu");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public static void upgradingComputer(int ammountOfCoins, int computerLevelAfterUpgrade){
		if (currency >= ammountOfCoins) {
			currency = currency - ammountOfCoins;
			computerLevel = computerLevelAfterUpgrade;
			System.out.println("Komputer zostal ulepszony na "+ computerLevel + " poziom");
		} else {
			System.out.println("Masz za malo monet");
		}
	}
}
