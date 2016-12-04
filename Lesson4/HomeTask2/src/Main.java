import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Kalkulator obwodu wielokata");
		System.out.println();
		
		int angels = 9;
		int[] sideLenght = new int[angels];
		int side;

		if (angels < 3) {
			System.out.println("Bledna iloscc katow");
		} else {
			System.out.println("Wprowadzona ilosc katow jest poprawna");
System.out.println();
		
			if (angels < 7) {
				Scanner scanner = new Scanner(System.in);

				for (int i = 0; i < sideLenght.length; i++) {
					System.out.println("Wprowadz dlugosc boku");
					side = scanner.nextInt();
					sideLenght[i] = side;

				}

			} else {
				Random generator = new Random();
				for (int i = 0; i < sideLenght.length; i++) {
					side = generator.nextInt((12) + 1);
					sideLenght[i] = side;

				}
			}
			for (int i = 0; i < sideLenght.length; i++) {
				System.out.println("Dlugosc boku " + (i + 1) + " wynosi: " + sideLenght[i]);
			}
			int circuit = 0;
			int	a = 0;
			do {
			circuit = circuit + sideLenght[a];
			a++;

			} while (a != sideLenght.length);
			System.out.println();
			System.out.println("Obwód wynosi: " + circuit);
		
		}

	}
}
