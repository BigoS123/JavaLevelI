import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	    int cathetusA; //przyprostokątna A
		int cathetusB; //przyprostokątna B
		
		System.out.println("Wprowadz przyprostokątną A: ");
		
		Scanner odczyt1 = new Scanner(System.in);
		
	    cathetusA = odczyt1.nextInt();
		
	    System.out.println("Wprowadz przyprostokątną B: ");
	    
	    Scanner odczyt2 = new Scanner(System.in);
	    
	    cathetusB = odczyt2.nextInt();
		
		int hypotenuse; //przeciwprostokątna
		
		hypotenuse = cathetusA*cathetusA + cathetusB*cathetusB;
		
		System.out.println("Przeciwprostokątna do kwadratu wynosi: " + hypotenuse);
		
		System.out.println("Przyprostokątna A wynosi: " + cathetusA + " ,Przyprostokątna B wynosi: " + cathetusB );
		
		
		
	}

}
