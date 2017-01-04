import java.util.Scanner;
import java.util.Random;

public class Main {
	static int userNumber;
	static int randomNumber = 0;
	static int draftNumber = 0;

	public static void main(String[] args) {

		System.out.println("GENERATOR LICZ OD 1 DO 30");
		System.out.println();
		chosingNumber();
		generatingNumber();

	}

	public static void chosingNumber() {

		System.out.println("Wporwadz gorna liczbe zakresu");
		Scanner scanner = new Scanner(System.in);
		userNumber = scanner.nextInt();

	}

	public static void generatingNumber() {

		Random generator = new Random();

		System.out.println("Wylosowane liczby");

		do {
			randomNumber = generator.nextInt((30) + 1);
			draftNumber++;
			System.out.println("liczba wylosowana nr " + draftNumber + " : " + randomNumber);

		} while (randomNumber != userNumber);

		System.out.println("Do wylosowania tej liczby potrzebowalismy " + draftNumber + " prob");

	}

}
