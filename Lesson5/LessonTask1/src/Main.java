import java.util.Scanner;

/**
 * 
 */

/**
 * @author User
 *
 */
public class Main {

	static Scanner scanner = new Scanner(System.in);
	static Scanner scanner2 = new Scanner(System.in);
	static Scanner scanner1 = new Scanner(System.in);
	static String studentSName;
	static String schoolName;
	static String learningProfile;
	static int schoolType;
	static String BASIC_CLASSES_IN_SCHOOL = "WF, Jezyk Polski, Matematyka";

	public static void main(String[] args) {

		addingInformationsAboutStudent();
		addingExtraLessons();
	}

	public static void addingInformationsAboutStudent() {

		String studentSName;
		System.out.println("Wprowadz imie i nazwisko ucznia:");
		studentSName = scanner1.nextLine();

		String schoolName;
		System.out.println("Wprowadz nazwe szkoly: ");
		schoolName = scanner1.nextLine();

		String learningProfile;
		System.out.println("Wprowadz profil nauczania");
		learningProfile = scanner1.nextLine();

		System.out.println("Wprowadz typ szko³y 1- Podstawowa 2- Gimanzium");
		schoolType = scanner2.nextInt();

		showingAllInformations();
	}

	public static void showingAllInformations() {
		System.out.println();
		System.out.println("Imie i nazwisko ucznia:" + studentSName);
		System.out.println("Nazwa szkoly: " + schoolName);
		System.out.println(schoolType == 2 ? "Gimnazium" : "Podstawowka");
		System.out.println(schoolType == 2 ? "Lista przedmiotów: " + BASIC_CLASSES_IN_SCHOOL + " Fizyka, Chemia"
				: "Lista przedmiotów: " + BASIC_CLASSES_IN_SCHOOL);
	}

	public static void addingExtraLessons() {
		System.out.println();
		System.out.println("Czy uczen uczeszcza na zajecia dodatkowe? (true, false)");
		boolean extraLessonsTorF = scanner.nextBoolean();
		if (extraLessonsTorF == false) {
			showingAllInformations();
			System.out.println("Uczen nie uczeszcza na zajecia dodatkowe");
		} else {
			System.out.println("Wprowadz zajecia dodatkowe");
			String extraLessons = scanner1.nextLine();
			showingAllInformations();
			System.out.println("Uczen uczeszcza na zajecia: " + extraLessons);
		}

	}
}
