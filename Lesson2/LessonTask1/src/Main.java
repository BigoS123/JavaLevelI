import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	String name;
	short age;
	float height;
	String club;
	short number;
	boolean isRightFoot;
	short redCards;
	
	name = "Leo Messi";
	age = 29;
	height = (float) 1.69;
	club = "FC Barcelona";
	number = 10;
	isRightFoot = false;
	redCards = 10;
	
	System.out.println("Imie: " + name);
	System.out.println("Wiek: " + age);
	System.out.println("Wzrost: " + height);
	System.out.println("Klub: " + club);
	System.out.println("Numer: " + number);
	System.out.println("Czy jest prawo no¿ny: " + isRightFoot);
	System.out.println("Czerwone kartki: " + redCards);
	 System.out.println("Wprowadz pseudonim: "); 
	
	String pseudonim;
	
	Scanner odczyt = new Scanner(System.in);
	
	pseudonim = odczyt.nextLine();
	
	 System.out.println("Pseudonim: " + pseudonim);
	
	

	}

}
