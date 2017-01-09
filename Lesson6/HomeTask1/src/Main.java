import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> shoppingList = new ArrayList<String>();

		shoppingList.add("Mleko");
		shoppingList.add("Ser");
		shoppingList.add("Szynka");
		shoppingList.add("Maslo");
		shoppingList.add("Chleb");
		shoppingList.add("Jogurty");
		shoppingList.add("Pasztet");
		shoppingList.add("Majonez");

		for (int i = 0; i < shoppingList.size(); i++) {
			System.out.println(shoppingList.get(i));
		}

		shoppingList.remove(shoppingList.get(0));
		shoppingList.remove(shoppingList.get(3));
		shoppingList.remove(shoppingList.get(4));
		System.out.println();
		for (int i = 0; i < shoppingList.size(); i++) {
			System.out.println(shoppingList.get(i));

		}

		shoppingList.add("Bulki");
		shoppingList.add("Nutella");
		shoppingList.add("Jajka");
		shoppingList.add("Piwo");
		shoppingList.add("Oliwki");
		shoppingList.add("Chipsy");

		Random generator = new Random();
		ArrayList<Integer> shoppingListPrices = new ArrayList<Integer>();

		if (shoppingList.size() > 10) {
			for (int i = 0; i < shoppingList.size(); i++) {
				shoppingListPrices.add(generator.nextInt((24) + 1));
			}
		}
		System.out.println();
		for (int i = 0; i < shoppingList.size(); i++) {
			System.out.println("Cena za " + shoppingList.get(i) + " wynosi " + shoppingListPrices.get(i));
		}
		int totalPrcie = 0;
		for (int i = 0; i < shoppingList.size(); i++) {

			totalPrcie = totalPrcie + shoppingListPrices.get(i);
		}
		System.out.println();
		System.out.println("Zakupy beda kosztowac " + totalPrcie);
	}
}
