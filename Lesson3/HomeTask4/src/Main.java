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
		
		
		Scanner odczyt1 = new Scanner(System.in);
		task = odczyt1.nextInt();
		
		switch(task)
		{
			case 1:
				System.out.println("Wprowadz bok kwadratu:");
				Scanner odczyt2 = new Scanner(System.in);
				sideA = odczyt2.nextInt();
				System.out.println("Pole kwadratu wynosi: " + sideA + " * " + sideA  + " = " + (sideA * sideA));
				break;
			case 2:
				System.out.println("Wprowadz krotszy bok prostokata: ");
				Scanner odczyt3 = new Scanner(System.in);
				sideA = odczyt3.nextInt();
				System.out.println("Wprowadz dluzszy bok prostokata: ");
				Scanner odczyt4 = new Scanner(System.in);
				sideB = odczyt4.nextInt();
				System.out.println("Pole prostokata wynosi: " + sideA + " * " + sideB  + " = " + (sideA * sideB));
				break;
			case 3:	
				System.out.println("Wprowadz promien kola:");
				Scanner odczyt5 = new Scanner(System.in);
				radius = odczyt5.nextInt();
				System.out.println("Pole kola wynosi: " + "3.14" + " * " + radius + " * " + radius + " = " + (3.14*radius*radius));
				break;
			case 4:
				System.out.println("Wprowadz wysokosc trojkata:");
				Scanner odczyt6 = new Scanner(System.in);
				height = odczyt6.nextInt();
				System.out.println("Wprowadz podstawe trojkata:");
				Scanner odczyt7 = new Scanner(System.in);
				base = odczyt7.nextInt();
				System.out.println("Pole trojkata wynosi: " + height + " * " + base + " = " + (height*base));
				break;
		}
		
		
		
	}

}
