import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Czy mamy wiadomo�� w skrzynce? ");
		System.out.println();
		
		int letters;
		
		Scanner odczyt = new Scanner(System.in);
		
		System.out.println("Ile masz wiadomo�ci? ");
		
		letters = odczyt.nextInt();
		
		System.out.println(letters > 0 ? "Masz wiadomosc" : "Poczta jest pusta");


	}

}
