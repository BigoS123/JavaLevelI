import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.sun.org.apache.regexp.internal.recompile;

public class Main {
	static String usersWord;
	static char[] alphabetTable = "abcdefghijklmnoprstuwxyz".toCharArray();
	static char[] cipher = new char[alphabetTable.length];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateCipher();
		showCreatedCipher();
		System.out.println(cipherWord("maciek"));
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

	public static void scanWord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wprowadz haslo do zaszyfrowania");
		usersWord = sc.nextLine();

	}

	public static String cipherWord(String word) {
		char[] usersWord = word.toCharArray();
		char[] cipherWord = new char[usersWord.length];

		for (int k = 0; k < usersWord.length; k++) {
			for (int i = 0; i < alphabetTable.length; i++) {
				if (alphabetTable[i] == usersWord[k]) {
					cipherWord[k] = cipher[i];
					break;
				}
			}
		}
		return String.valueOf(cipherWord);
	}

	public static void showCipheredWord() {

	}

	public static void showCreatedCipher() {
		for (int i = 0; i < alphabetTable.length; i++) {
			System.out.println(alphabetTable[i] + " = " + cipher[i]);
		}
	}
}
