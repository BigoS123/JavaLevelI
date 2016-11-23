import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Dzienniczek ucznia");
		System.out.println();
		
		final String BASIC_CLASSES_IN_SCHOOL = "WF, Jezyk Polski, Matematyka";
		
		String studentSName;
		System.out.println("Wprowadz imie i nazwisko ucznia:");
		Scanner scanner = new Scanner(System.in);
		studentSName = scanner.nextLine();
		
		String schoolName;
		System.out.println("Wprowadz nazwe szkoly: ");
		schoolName = scanner.nextLine();

		
		int schoolType;
		System.out.println("Wprowadz typ szko³y 1- Podstawowa 2- Gimanzium");
		schoolType = scanner.nextInt();
		
		String learningProfile;
		System.out.println("Wprowadz profil nauczania");
		learningProfile = scanner.nextLine();
		
		System.out.println();
		System.out.println("Imie i nazwisko ucznia:" + studentSName);
		System.out.println("Nazwa szkoly: " + schoolName);
		System.out.println( schoolType == 2 ? "Gimnazium" : "Podstawowka");
		System.out.println( schoolType == 2  ? "Lista przedmiotów: " + BASIC_CLASSES_IN_SCHOOL + " Fizyka, Chemia" 
							: "Lista przedmiotów: " + BASIC_CLASSES_IN_SCHOOL);
		System.out.println("Profil nauczania: " + learningProfile);
		
		System.out.println();
		int extraLessonsYesNo;
		boolean extraLessons = false;
		String extraLessonsNames = "";
		System.out.println("Czy uczen uczeszcza na kolka? 1-Tak 2-Nie");
		extraLessonsYesNo = scanner.nextInt();
		if (extraLessonsYesNo == 1){
			extraLessons = true;
		System.out.println("Wprowadz zajecia dodatkowe");
		extraLessonsNames = scanner.nextLine();
		}
		System.out.println();
		System.out.println("Imie i nazwisko ucznia:" + studentSName);
		System.out.println("Nazwa szkoly: " + schoolName);
		System.out.println( schoolType == 2 ? "Gimnazium" : "Podstawowka");
		System.out.println( schoolType == 2  ? "Lista przedmiotów: " + BASIC_CLASSES_IN_SCHOOL + " Fizyka, Chemia" 
				: "Lista przedmiotów: " + BASIC_CLASSES_IN_SCHOOL);
		System.out.println("Profil nauczania: " + learningProfile);
		if (extraLessons == true){
		System.out.println("Zajecia dodatkowe ucznia: " + extraLessonsNames) ;
		}else{
		System.out.println("Uczen nie uczeszcza na zadne zajecia dodatkowe");	
		}
		
		
		
		
		
	}

}
