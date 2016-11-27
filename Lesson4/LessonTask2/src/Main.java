import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("KALKULATOR POTEG");
		System.out.println();
		
		int index;
		int number;
		int result = 1;
		
		System.out.println("Wprowadz liczbe ktora chcesz zpotegowac");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		System.out.println("Wprowadz wykladnik potegi");
		index = scanner.nextInt();

		
		for(int i = 0; i < index; i++){
			
			result = result * number;
		
		System.out.println("Wynik: " + result);
	
		}
	}

}
