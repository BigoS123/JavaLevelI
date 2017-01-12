import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static ArrayList<String> shoppingList = new ArrayList<String>();
	static ArrayList<Integer> shoppingListPrices = new ArrayList<Integer>();

	public static void main(String[] args) {
		validateInputInt("podaj wartosc ");
		System.out.println("przeszlo");
		// showOperations();
	}

	public static void showOperations() {

		for (;;) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Menu");
			System.out.println("1- dodaj produkt do listy zakupow");
			System.out.println("2- usun produkt z listy zakupow");
			System.out.println("3- wyswietl liste zakupow");
			System.out.println("4- zakoncz zakupy");
			System.out.println();

			int menuPosition = sc.nextInt();
			switch (menuPosition) {
			case 1:
				addProduct();
				break;
			case 2:
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Wskaz pozycje z listy do usuniecia");
				int position = sc1.nextInt();
				deleteProduct(position);
				break;
			case 3:
				clearingConsole();
				showListOfProducts();
				break;
			case 4:
				showTotalPrice();
				break;
			default:
				System.out.println("Brak danej pozycji w menu");
				break;
			}
			clearingConsole();
		}
	}

	public static void validateInputInt(String comunicate) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println(comunicate);
			while (!sc.hasNextInt()) {
				String input = sc.next();
				System.out.printf("%s nie jest poprawnym numerem \n", input);
			}
			number = sc.nextInt();
		} while (number < 0);

	}

	public static int generatePrice() {
		Random generator = new Random();

		return generator.nextInt((25) + 1);

	}

	public static void addProduct() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Wprowadz nazwe produktu");
		String product = sc.nextLine();
		shoppingList.add(product);
		shoppingListPrices.add(generatePrice());
	}

	public static void showListOfProducts() {
		for (int i = 0; i < shoppingList.size(); i++) {
			System.out
					.println("Produkt nr " + (i + 1) + " " + shoppingList.get(i) + " za " + shoppingListPrices.get(i));
		}
	}

	public static void clearingConsole() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}

	public static void deleteProduct(int productsNumber) {
		shoppingList.remove((productsNumber - 1));
		shoppingListPrices.remove((productsNumber - 1));
	}

	public static int sumUpPrice() {
		int totalPrcie = 0;
		for (int i = 0; i < shoppingListPrices.size(); i++) {

			totalPrcie = totalPrcie + shoppingListPrices.get(i);
		}
		return totalPrcie;
	}

	public static void showTotalPrice() {
		System.out.println("Laczna suma zakupow wynosi " + sumUpPrice());
	}
}
