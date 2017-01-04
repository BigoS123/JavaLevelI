import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("OBLICZNIE WYRAZU Z CIAGU FIBONACCIEGO");
		System.out.println();
		int usersNumber;
		System.out.println("WPROWADZ WAWRTOSC KTORA CHCESZ OBLICZYC");
		Scanner scanner = new Scanner(System.in);
		usersNumber = scanner.nextInt();
		int a = 0;
		int b = 1;
		System.out.println("TWOJA WARTOSC WYNOSI");
		if (usersNumber == 0) {
			System.out.println("0");
		} else if (usersNumber == 1) {
			System.out.println("0");
			System.out.println("1");
		} else{
			System.out.println("0");
			System.out.println("1");
		
			for(int i = 2; i <= usersNumber; i++) {
				System.out.println(a + b);
				
				b = a + b;
				a = b - a;
			}
		}
		
	}
}
