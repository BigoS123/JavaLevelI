
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<String> value = new ArrayList<String>();
	static int number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showOperations();
	}

	public static void showOperations() {
		for (;;) {

			System.out.println("Menu");
			System.out.println("1- dodaj wartosc");
			System.out.println("2- usun wartosc");
			System.out.println("3- wyswietl liste wartosci");
			System.out.println("4- zastap wartosc");
			System.out.println();
			validateInputInt("Wybierz pozycje z menu");
			switch (number) {
			case 1:
				addValue();
				break;
			case 2:
				deleteValue();
				break;
			case 3:
				clearingConsole();
				showWholeList();
				break;
			case 4:
				replaceValue();
				break;
			default:
				System.out.println("Brak danej pozycji w menu");
				break;
			}
			clearingConsole();
		}
	}

	public static void addValue() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Wprowadz wartosc");
		String usersValue = sc.nextLine();
		value.add(usersValue);
	}

	public static void deleteValue() {
		System.out.println("Wprowadz pozycje wartosci");
		Scanner sc1 = new Scanner(System.in);
		int position = sc1.nextInt();
		value.remove((position - 1));

	}

	public static void clearingConsole() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}

	public static void replaceValue() {
		System.out.println("Wprowadz pozycje wartosci");
		Scanner sc1 = new Scanner(System.in);
		int position = sc1.nextInt();
		System.out.println("Wprowadz wartosc");
		Scanner sc = new Scanner(System.in);

		String usersValue = sc.nextLine();
		value.add((position - 1), usersValue);
	}

	public static void showWholeList() {
		System.out.println(value);
	}

	public static int validateInputInt(String comunicate) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(comunicate);
			while (!sc.hasNextInt()) {
				String input = sc.next();
				System.out.printf("%s pozycja nie jest poprawna pozycja \n", input);
			}
			number = sc.nextInt();
		} while (number < 0);
		return number;
	}
}