import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("KALKULATOR");

		System.out.println();

		System.out.println("MENU");
		System.out.println("1- dodawanie");
		System.out.println("2- odejmowanie");
		System.out.println("3- dzielenie");
		System.out.println("4- mnozenie");

		double ammount1;
		double ammount2;
		int operation;

		System.out.println("Wprowadz liczbe nr1");
		Scanner scanner = new Scanner(System.in);
		ammount1 = scanner.nextInt();

		System.out.println("Wprowadz liczbe nr2");
		ammount2 = scanner.nextInt();

		System.out.println("Wybierz numer operacji z menu: ");
		operation = scanner.nextInt();

		switch (operation) {
		case 1:
			System.out.println("Dodawanie");
			System.out.println(ammount1 + " + " + ammount2 + " = " + (ammount1 + ammount2));
			break;
		case 2:
			System.out.println("Odejmowanie");
			System.out.println(ammount1 + " - " + ammount2 + " = " + (ammount1 - ammount2));
			break;
		case 3:
			System.out.println("Dzielenie");
			System.out.println(ammount1 + " / " + ammount2 + " = " + (ammount1 / ammount2));
			break;
		case 4:
			System.out.println("Mnozenie");
			System.out.println(ammount1 + " * " + ammount2 + " = " + (ammount1 * ammount2));
			break;
		default:
			System.out.println("W menu nie ma takiej pozycji");
			break;
		}

	}

}
