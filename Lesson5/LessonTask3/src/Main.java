import java.util.Random;
import java.util.Scanner;

public class Main {

	static int[] sideLenght = new int[9];
	

	public static void main(String[] args) {

		if (sideLenght.length < 3) {
			System.out.println("Bledna iloscc katow");
		} else {
			System.out.println("Wprowadzona ilosc katow jest poprawna");
			System.out.println();
			if (sideLenght.length < 7) {
				addingSideLenght();
			} else {
				generatingSideLenght();
			}

			showingSideLenght();
			System.out.println();
			System.out.println("Obwód wynosi: " + countingCircut());
			
		}

	}

	public static void generatingSideLenght() {
		Random generator = new Random();
		for (int i = 0; i < sideLenght.length; i++) {
			sideLenght[i] = generator.nextInt(12) + 1;
			

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
			sideLenght[i] = scanner.nextInt();
			

		}

	}

	public static int countingCircut() {
		int circuit = 0;
		for(int i = 0; i < sideLenght.length; i++){
			
			circuit = circuit + sideLenght[i];
			
		}
		
		return circuit;
	}

}
