import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Dzienniczek ucznia");
		System.out.println();
		
		String studentSName;
		System.out.println("Wprowadz imie i nazwisko ucznia:");
		Scanner odczyt1 = new Scanner(System.in);
		studentSName = odczyt1.nextLine();
		
		String schoolName;
		System.out.println("Wprowadz nazwe szkoly: ");
		Scanner odczyt2 = new Scanner(System.in);
		schoolName = odczyt2.nextLine();
		
		int schoolType;
		System.out.println("Wprowadz typ szko³y 1- Podstawowa 2- Gimanzium");
		Scanner odczyt3 = new Scanner(System.in);
		schoolType = odczyt3.nextInt();
		
		String learningProfile;
		System.out.println("Wprowadz profil nauczania");
		Scanner odczyt4 = new Scanner(System.in);
		learningProfile = odczyt4.nextLine();
		
		System.out.println();
		System.out.println("Imie i nazwisko ucznia:" + studentSName);
		System.out.println("Nazwa szkoly: " + schoolName);
		System.out.println( schoolType > 1 ? "Gimnazium" : "Podstawowka");
		System.out.println( schoolType > 1  ? "Lista przedmiotów: WF, Jezyk Polski, Matematyka, Fizyka, Chemia" 
							: "Lista przedmiotów: WF, Jezyk Polski, Matematyka");
		System.out.println("Profil nauczania: " + learningProfile);
		
		System.out.println();
		String extraLessons;
		System.out.println("Wprowadz zajecia dodatkowe ucznia:");
		Scanner odczyt5 = new Scanner(System.in);
		extraLessons = odczyt5.nextLine();
		
		System.out.println();
		System.out.println("Imie i nazwisko ucznia:" + studentSName);
		System.out.println("Nazwa szkoly: " + schoolName);
		System.out.println( schoolType > 1 ? "Gimnazium" : "Podstawowka");
		System.out.println( schoolType > 1  ? "Lista przedmiotów: WF, Jezyk Polski, Matematyka, Fizyka, Chemia" 
							: "Lista przedmiotów: WF, Jezyk Polski, Matematyka");
		System.out.println("Profil nauczania: " + learningProfile);
		System.out.println("Zajecia dodatkowe ucznia: " + extraLessons);
		
		
		
		
		
		
	}

}
