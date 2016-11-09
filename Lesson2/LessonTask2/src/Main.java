
public class Main {

	public static void main(String[] args) {
	
		short redBalls;
		short blueBalls;
		short greenBalls;
		
		redBalls = 6;
		blueBalls = 4;
		greenBalls = 9;
		
		System.out.println("Kulki czerwone: " + redBalls);
		System.out.println("Kulki niebieskie: " + blueBalls);
		System.out.println("Kulki zielone:" + greenBalls);
		System.out.println("Wszystie kulki: " + (redBalls + blueBalls + greenBalls));
		
		short blackBalls;
		
		blackBalls = 2;
		
		
		int allBalls;
		
		allBalls = (redBalls + blueBalls + greenBalls + blackBalls);
		
		System.out.println("Wszystkie kulki: " + allBalls);
		
		redBalls = 5;
		
		System.out.println("Wszystkie kulki: " + allBalls);
		
		

	}

}
