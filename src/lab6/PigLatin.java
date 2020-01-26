package lab6;

/*
 * @Author Kyle Warchuck
 */

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Please input a sentence to be converted to piglatin: ");
		String word = scnr.nextLine();

		if (word != "") {

			word = word.replaceAll("[^a-zA-Z0-9]+", "");

			String pigLatin = "";
			int number1 = 0;

			for (int i = 0; i < word.length(); i++) {
				char x = word.charAt(i);

				if (x == '1' || x == '2' || x == '3' || x == '4' || x == '5' || x == '6' || x == '7' || x == '8'
						|| x == '9' || x == '0') {
					pigLatin = word;
					number1 = 1;
					break;
				}
				
				else if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I'
						|| x == 'O' || x == 'U') {
					pigLatin = word.substring(i) + word.substring(0, i) + "ay";
					number1 = 1;
					break;
				}

			}
			if (number1 == 0) {
				pigLatin = (word + "ay");

			}
			System.out.println("Your word in piglatin is " + pigLatin);
			scnr.close();
		}

	}
// to do  Make   the   application   take   a   line   instead   of   a   single   word, (DONE)
//and   then  find   the   Pig   Latin   for   each   word   in   the   line.     	

}
