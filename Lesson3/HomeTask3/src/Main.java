import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Moj odtwarzacz muzyczny");
		System.out.println();
		
		int typeOfMusic;
		int volume;
		int tone1;
		int tone2;
		int tone3;
		int rightSpeaker;
		
		System.out.println("Wybierz swoj ulubiony gatunek muzyczny: 1- rock 2- jazz 3- pop 4- rnb");
		Scanner odczyt1 = new Scanner(System.in);
		typeOfMusic = odczyt1.nextInt();
		System.out.println("Wybierz glosnosc muzyki: 1- glosno 2-cicho ");
		Scanner odczyt2 = new Scanner(System.in);
		volume = odczyt2.nextInt();
		System.out.println("Wybierz ton w jakim lubisz sluchac muzyki 1-niskie 2-srednie 3- wyskoie");
		Scanner odczyt3 = new Scanner(System.in);
		tone1 = odczyt3.nextInt();
		System.out.println("Wybierz ton w jakim lubisz sluchac muzyki 0- jesli lubisz tylko jeden 1-niskie 2-srednie 3- wyskoie ");
		Scanner odczyt4 = new Scanner(System.in);
		tone2 = odczyt4.nextInt();
		System.out.println("Wybierz ton w jakim lubisz sluchac muzyki 0- jesli lubisz tylko jeden lub dwa  1-niskie 2-srednie 3- wyskoie ");
		Scanner odczyt5 = new Scanner(System.in);
		tone3 = odczyt5.nextInt();
		System.out.println("Wybierz zakres DB dla prwaego glosnika (max 10 DB, lewy ustwia sie automatycznie)");
		Scanner odczyt6 = new Scanner(System.in);
		rightSpeaker = odczyt6.nextInt();
		
		System.out.println();
		
		switch(typeOfMusic)
		{
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
		System.out.println("Wybrana glosnosc musyki: ");
		System.out.println(volume == 1 ? "glosno" : "cicho");
		System.out.println();
		
		switch(tone1)
		{
			case 0:
			System.out.println();
				break;
			case 1:
				System.out.println("Twoje ulubione tony: niskie");
				break;
			case 2:
				System.out.println("Twoje ulubione tony: srednie");
				break;
			case 3:
				System.out.println("Twoje ulubion tony: wysokie");
				break;
		
		}
		switch(tone2)
		{
		case 0:
			System.out.println();
			break;
		case 1:
			System.out.println("Twoje ulubione tony: niskie");
			break;
		case 2:
			System.out.println("Twoje ulubione tony: srednie");
			break;
		case 3:
			System.out.println("Twoje ulubion tony: wysokie");
			break;
			
		}
		switch(tone3)
		{
		case 0:
			System.out.println();
			break;
		case 1:
			System.out.println("Twoje ulubione tony: niskie");
			break;
		case 2:
			System.out.println("Twoje ulubione tony: srednie");
			break;
		case 3:
			System.out.println("Twoje ulubion tony: wysokie");
			break;
			
		}
	
		
		System.out.println("balans pomiedzy glosnikami: " + rightSpeaker + " prawy " + (10-rightSpeaker) + "lewy");
		
		
	}

}
