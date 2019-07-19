/**
 * @author emarvie
 */
package terragon_intern;

import java.util.Scanner;
public class Cipher{
	public static void main(String[] args) {
//		System.out.println("Enter the text that you would like to encrypt with cipher: ");
//		Scanner input = new Scanner(System.in);
//	    String TextToCipherr = input.next();
//	   

		System.out.println("Enter the number of forward shift: "); //each letters in the String of text that the user input will be shifted by the number of forward shift
	    int NumberOfShift = 4;
	   

		
		CipherCreation cipherCreation = new CipherCreation(NumberOfShift);
		System.out.println(cipherCreation.encrypt("Text To Cipherr", cipherCreation.getShift()));
	}
}


