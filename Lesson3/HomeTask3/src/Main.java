import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Moj odtwarzacz muzyczny");
		System.out.println();

		int typeOfMusic;
		String volume;
		boolean toneLow;
		boolean toneMedium;
		boolean toneHigh;
		int rightSpeaker;

		System.out.println("Wybierz swoj ulubiony gatunek muzyczny: 1- rock 2- jazz 3- pop 4- rnb");
		Scanner scanner = new Scanner(System.in);
		typeOfMusic = scanner.nextInt();
		System.out.println("Wprowadz glosnosc muzyki (Glosno, Cicho) ");
		Scanner scanner1 = new Scanner(System.in);
		volume = scanner1.nextLine();

		System.out.println("Czy lubisz sluchac w tonach niskich?(true false)");
		Scanner scanner2 = new Scanner(System.in);
		toneLow = scanner2.nextBoolean();
		System.out.println("Czy lubisz sluchac w tonach srednich?(true false)");
		toneMedium = scanner2.nextBoolean();
		if (!toneLow && !toneMedium) {
			toneHigh = true;
		} else {
			System.out.println("Czy lubisz sluchac w tonach wysokich?(true false)");
			toneHigh = scanner2.nextBoolean();
		}
		System.out.println("Wybierz zakres DB dla prwaego glosnika (max 10 DB, lewy ustwia sie automatycznie)");
		rightSpeaker = scanner.nextInt();

		System.out.println();

		switch (typeOfMusic) {
		case 1:
			System.out.println("Twoj ulubiony gatunek muzyczbny to: rock");
			break;
		case 2:
			System.out.println("Twoj ulubiony gatunek muzyczbny to: jazz");
			break;
		case 3:
			System.out.println("Twoj ulubiony gatunek muzyczbny to: pop");
			break;
		case 4:
			System.out.println("Twoj ulubiony gatunek muzyczbny to: rnb");
			break;

		}

		System.out.println();
		System.out.println("Wybrana glosnosc musyki: " + volume);

		System.out.println("Wybrane tony muzyki: ");
		if (toneLow) {
			System.out.println("Tony niskie ");
		}
		if (toneMedium) {
			System.out.println("Tony srednie ");
		}
		if (toneHigh) {
			System.out.println("Tony wysokie ");
		}

		System.out.println("balans pomiedzy glosnikami: " + rightSpeaker + " prawy " + (10 - rightSpeaker) + " lewy");

	}

}
