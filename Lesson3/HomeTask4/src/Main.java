import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("KALKULATOR PÓL");
		System.out.println();
		
		double sideA;
		double sideB;
		double radius;
		double height;
		double base;
		int task;	
		
		System.out.println("MENU");
		System.out.println("1- kwadrat");
		System.out.println("2- prostoka");
		System.out.println("3- kolo");
		System.out.println("4- trojkat");
		System.out.println();
		System.out.println("Wybierz figure by obliczyc jej pole");
		
		
		Scanner scanner = new Scanner(System.in);
		task = scanner.nextInt();
		
		switch(task)
		{
			case 1:
				System.out.println("Wprowadz bok kwadratu:");
				sideA = scanner.nextInt();
				System.out.println("Pole kwadratu wynosi: " + sideA + " * " + sideA  + " = " + (sideA * sideA));
				break;
			case 2:
				System.out.println("Wprowadz krotszy bok prostokata: ");
				sideA = scanner.nextInt();
				System.out.println("Wprowadz dluzszy bok prostokata: ");
				sideB = scanner.nextInt();
				System.out.println("Pole prostokata wynosi: " + sideA + " * " + sideB  + " = " + (sideA * sideB));
				break;
			case 3:	
				System.out.println("Wprowadz promien kola:");
				radius = scanner.nextInt();
				System.out.println("Pole kola wynosi: " + "3.14" + " * " + radius + " * " + radius + " = " + (3.14*radius*radius));
				break;
			case 4:
				System.out.println("Wprowadz wysokosc trojkata:");
				height = scanner.nextInt();
				System.out.println("Wprowadz podstawe trojkata:");
				base = scanner.nextInt();
				System.out.println("Pole trojkata wynosi: " + height + " * " + base + " = " + (height*base));
				break;
		}
		
		
		
	}

}
