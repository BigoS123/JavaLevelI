import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.sun.org.apache.regexp.internal.recompile;

public class Main {
	static String usersWord;
	static char[] alphabetTable = "abcdefghijklmnoprstuwxyz".toCharArray();
	static char[] cipher = new char[alphabetTable.length];
	static String cipheredWord;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateCipher();
		showCreatedCipher();
		System.out.println(cipherWord("maciek"));
		System.out.println(showCipheredWord());
	}

	public static void generateCipher() {
		Random generator = new Random();
		int i = 0;
		int randomNumber;
		char alphabetChar;
		while (i != alphabetTable.length) {
			randomNumber = generator.nextInt(alphabetTable.length);
			alphabetChar = alphabetTable[randomNumber];

			if (!isLetterInCipher(alphabetChar)) {
				cipher[i] = alphabetChar;
				i++;
			}

		}
	}

	public static boolean isLetterInCipher(char letter) {
		for (int i = 0; i < cipher.length; i++) {
			if (cipher[i] == letter) {
				return true;
			}
		}

		return false;

	}
	public static int validateInputInt(String comunicate) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println(comunicate);
			while (!sc.hasNextInt()) {
				String input = sc.next();
				System.out.printf("%s pozycja nie jest poprawna pozycja \n", input);
			}
			number = sc.nextInt();
		} while (number < 0);
		return number;
	

	}
	public static void scanWord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wprowadz haslo do zaszyfrowania");
		usersWord = sc.nextLine();

	}

	public static String cipherWord(String word) {
		char[] usersWord = cipheredWord.toCharArray();
		char[] cipherWord = new char[usersWord.length];

		for (int k = 0; k < usersWord.length; k++) {
			for (int i = 0; i < alphabetTable.length; i++) {
				if (alphabetTable[i] == usersWord[k]) {
					cipherWord[k] = cipher[i];
					break;
				}
			}
			 cipheredWord = String.valueOf(cipherWord);
		}
	
		return String.valueOf(cipherWord);
	}

	public static String showCipheredWord() {
		char[] cipherWord = cipheredWord.toCharArray();
		char[] usersWord = new char[cipherWord.length];

		for (int k = 0; k < cipherWord.length; k++) {
			for (int i = 0; i < alphabetTable.length; i++) {
				if (alphabetTable[i] == cipherWord[k]) {
					cipherWord[k] = usersWord[i];
					break;
				}
			}
		}
		return String.valueOf(usersWord);
	}

	public static void showCreatedCipher() {
		for (int i = 0; i < alphabetTable.length; i++) {
			System.out.println(alphabetTable[i] + " = " + cipher[i]);
		}
	}
}
