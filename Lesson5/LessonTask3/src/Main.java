import java.util.Random;
import java.util.Scanner;

public class Main {

	static int angels = 9;
	static int[] sideLenght = new int[angels];
	static int side;
	static int circuit = 0;
	static int a = 0;

	public static void main(String[] args) {

		if (angels < 3) {
			System.out.println("Bledna iloscc katow");
		} else {
			System.out.println("Wprowadzona ilosc katow jest poprawna");
			System.out.println();
			if (angels < 7) {
				addingSideLenght();
			} else {
				generatingSideLenght();
			}

		}
		showingSideLenght();
		countingCircut();
	
	
	
	
	
	}

	public static void generatingSideLenght() {
		Random generator = new Random();
		for (int i = 0; i < sideLenght.length; i++) {
			side = generator.nextInt((12) + 1);
			sideLenght[i] = side;

		}
	}

	public static void showingSideLenght() {
		for (int i = 0; i < sideLenght.length; i++) {
			System.out.println("Dlugosc boku " + (i + 1) + " wynosi: " + sideLenght[i]);

		}
	}

	public static void addingSideLenght() {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < sideLenght.length; i++) {
			System.out.println("Wprowadz dlugosc boku");
			side = scanner.nextInt();
			sideLenght[i] = side;

		}

	}

	public static void countingCircut() {

		do {
			circuit = circuit + sideLenght[a];
			a++;

		} while (a != sideLenght.length);
		System.out.println();
		System.out.println("Obwód wynosi: " + circuit);

	}

}
