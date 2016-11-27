import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("GENERATRO LICZ OD 1 DO 30");
		System.out.println();
		
		int userNumber;
		System.out.println("Wporwadz gorna liczbe zakresu");
		Scanner scanner = new Scanner(System.in);
		userNumber = scanner.nextInt();
		
		int randomNumber = 0;
		Random generator = new Random();
		
		System.out.println("Wylosowane liczby");
		
		do{
			randomNumber = generator.nextInt((userNumber + 1));
			
		}
		while(randomNumber == userNumber);		
			System.out.println(randomNumber);
		
	
	}

}
