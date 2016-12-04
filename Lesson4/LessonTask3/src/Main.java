import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("GENERATOR LICZ OD 1 DO 30");
		System.out.println();

		int userNumber;
		System.out.println("Wporwadz gorna liczbe zakresu");
		Scanner scanner = new Scanner(System.in);
		userNumber = scanner.nextInt();

		int randomNumber = 0;
		Random generator = new Random();

		System.out.println("Wylosowane liczby");
		int draftNumber = 0;

		do {
			randomNumber = generator.nextInt((30) + 1);
			draftNumber++;
			System.out.println("liczba wylosowana nr " +  draftNumber + " : " +randomNumber);
	
		} while (randomNumber != userNumber);
		
		System.out.println("Do wylosowania tej liczby potrzebowalismy " + draftNumber + " prob");

	}

}
