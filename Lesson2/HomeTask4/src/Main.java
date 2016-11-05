import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	    int cathetusA; //przyprostok¹tna A
		int cathetusB; //przyprostok¹tna B
		
		System.out.println("Wprowadz przyprostok¹tn¹ A: ");
		
		Scanner odczyt1 = new Scanner(System.in);
		
	    cathetusA = odczyt1.nextInt();
		
	    System.out.println("Wprowadz przyprostok¹tn¹ B: ");
	    
	    Scanner odczyt2 = new Scanner(System.in);
	    
	    cathetusB = odczyt2.nextInt();
		
		int hypotenuse; //przeciwprostok¹tna
		
		hypotenuse = cathetusA*cathetusA + cathetusB*cathetusB;
		
		System.out.println("Przeciwprostok¹tna do kwadratu wynosi: " + hypotenuse);
		
		System.out.println("Przyprostok¹tna A wynosi: " + cathetusA + " ,Przyprostok¹tna B wynosi: " + cathetusB );
		
		
		
	}

}
