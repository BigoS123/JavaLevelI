import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Srednia koncowa ucznia");
		System.out.println();

		System.out.println("Wybierz typ szkoly do jakiej chodzi uczej 1-podstawowa 2-gimnazjum 3- liceum");
		Scanner scanner = new Scanner(System.in);
		int typeOfSchool = scanner.nextInt();
		

		int[] schoolSubjects;
		int schoolMark;
		Random generator = new Random();
		if (typeOfSchool == 1) {
			schoolSubjects = new int[4];
			for (int i = 0; i < schoolSubjects.length; i++) {
				schoolMark = generator.nextInt((6) + 1);
				schoolSubjects[i] = schoolMark;
				System.out.println("Ocena z przedmiotu nr " + (i + 1) + " wynosi " + schoolMark);
			}
			int marks = 0;
			int a = 0;
			do {
				marks = marks + schoolSubjects[a];
				a++;

			} while (a != schoolSubjects.length);
			System.out.println("Srednia wynosi wynosi: " + (marks / schoolSubjects.length));
		} else if (typeOfSchool == 2) {
			schoolSubjects = new int[6];
			for (int i = 0; i < schoolSubjects.length; i++) {
				schoolMark = generator.nextInt((6) + 1);
				schoolSubjects[i] = schoolMark;
				System.out.println("Ocena z przedmiotu nr " + (i + 1) + " wynosi " + schoolMark);
			}
			int marks = 0;
			int a = 0;
			do {
				marks = marks + schoolSubjects[a];
				a++;

			} while (a != schoolSubjects.length);
			System.out.println("Srednia wynosi wynosi: " + (marks / schoolSubjects.length));

		} else if (typeOfSchool == 3) {
			schoolSubjects = new int[7];
			for (int i = 0; i < schoolSubjects.length; i++) {
				schoolMark = generator.nextInt((6) + 1);
				schoolSubjects[i] = schoolMark;
				System.out.println("Ocena z przedmiotu nr " + (i + 1) + " wynosi " + schoolMark);
			}
			int marks = 0;
			int a = 0;
			do {
				marks = marks + schoolSubjects[a];
				a++;

			} while (a != schoolSubjects.length);
			System.out.println("Srednia wynosi wynosi: " + (marks / schoolSubjects.length));
		}

		
		
	}

}
