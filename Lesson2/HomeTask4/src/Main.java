import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	    int cathetusA; //przyprostok�tna A
		int cathetusB; //przyprostok�tna B
		
		System.out.println("Wprowadz przyprostok�tn� A: ");
		
		Scanner odczyt1 = new Scanner(System.in);
		
	    cathetusA = odczyt1.nextInt();
		
	    System.out.println("Wprowadz przyprostok�tn� B: ");
	    
	    Scanner odczyt2 = new Scanner(System.in);
	    
	    cathetusB = odczyt2.nextInt();
		
		int hypotenuse; //przeciwprostok�tna
		
		hypotenuse = cathetusA*cathetusA + cathetusB*cathetusB;
		
		System.out.println("Przeciwprostok�tna do kwadratu wynosi: " + hypotenuse);
		
		System.out.println("Przyprostok�tna A wynosi: " + cathetusA + " ,Przyprostok�tna B wynosi: " + cathetusB );
		
		
		
	}

}
