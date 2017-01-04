import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Srednia koncowa ucznia");
		System.out.println();

		System.out.println("Wybierz typ szkoly do jakiej chodzi uczej 1-podstawowa 2-gimnazjum 3- liceum");
		Scanner scanner = new Scanner(System.in);
		int typeOfSchool = scanner.nextInt();
		

		double[] schoolSubjects;
		double schoolMark;
		Random generator = new Random();
		if (typeOfSchool == 1) {
			schoolSubjects = new double[4];
			for (int i = 0; i < schoolSubjects.length; i++) {
				schoolMark = generator.nextInt((6) + 1);
				schoolSubjects[i] = schoolMark;
				System.out.println("Ocena z przedmiotu nr " + (i + 1) + " wynosi " + schoolMark);
			}
			double marks = 0;
			int a = 0;
			do {
				marks = marks + schoolSubjects[a];
				a++;

			} while (a != schoolSubjects.length);
			System.out.println("Srednia wynosi wynosi: " + (marks / schoolSubjects.length));
		} else if (typeOfSchool == 2) {
			schoolSubjects = new double[6];
			for (int i = 0; i < schoolSubjects.length; i++) {
				schoolMark = generator.nextInt((6) + 1);
				schoolSubjects[i] = schoolMark;
				System.out.println("Ocena z przedmiotu nr " + (i + 1) + " wynosi " + schoolMark);
			}
			double marks = 0;
			int a = 0;
			do {
				marks = marks + schoolSubjects[a];
				a++;

			} while (a != schoolSubjects.length);
			System.out.println("Srednia wynosi wynosi: " + (marks / schoolSubjects.length));

		} else if (typeOfSchool == 3) {
			schoolSubjects = new double[7];
			for (int i = 0; i < schoolSubjects.length; i++) {
				schoolMark = generator.nextInt((6) + 1);
				boolean b = generator.nextBoolean();
				if(b == true){
				
				schoolSubjects[i] =	schoolMark + 0.5;
				}
				else{
				schoolSubjects[i] =	schoolMark;
				}
				System.out.println("Ocena z przedmiotu nr " + (i + 1) + " wynosi " + schoolSubjects[i]);
			}
			double marks = 0;
			int a = 0;
			do {
				marks = marks + schoolSubjects[a];
				a++;
			
			} while (a != schoolSubjects.length);
			System.out.println("Srednia wynosi wynosi: " + (marks / schoolSubjects.length));
		}

		
		
	}

}
