package terragon_intern;
//This class contains the methods for encrypting and decrypting and the main method and class are in Cipher.java
public class CipherCreation {

	private int shift;
	public CipherCreation(int shift) {
		super();
	} 

	//a final function returning the English Alphabets as a String
	public final String ALPHABET26(){
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		return alphabet;
	}
	/*method for the encryption: it replace each character by the next "shift" character 
shift is the number entered by the user */
	public String encrypt(String TextToCipher, int shift) {
		TextToCipher = TextToCipher.toLowerCase();
		String cipherText = "";
		//loops through the entered text 
		for (int i = 0; i < TextToCipher.length(); i++) {
			char charToCipher=TextToCipher.charAt(i);  //taking each character of the text
			//gets the position of each character in the Text in the English Alphabet 
			int charPosition = ALPHABET26().indexOf(charToCipher);
			// ensures the index of the replacing character is not exceeding length of English Alphabet"26"
			int value = (shift + charPosition)%26;
			// gets the replacing character 
			char replaceChar = ALPHABET26().charAt(value);
			// appends the replaceVal to the String cipher Text
			cipherText += replaceChar;
			// returns the ciphered text 

		}
		return cipherText;

	}
	//to decrypt the text already encrypted
	public String decrypt(String TextToDecrypt, int shift) {
		//number with which the text was shifted before must be known by the user

		TextToDecrypt = TextToDecrypt.toLowerCase();
		String UncipherText = "";  //created an empty String of decrypted text
		//loops through the entered text


		for (int i = 0; i < TextToDecrypt.length(); i++) {
			char charToUnCipher=TextToDecrypt.charAt(i);  //taking each character of the text

			if (charToUnCipher== 'd'){  //space is converted to d in encrpting so 'd' should be converted to space back.
				UncipherText += " ";
				continue;  
			}

			//gets the position of each character in the Text in the English Alphabet 
			int charPosition = ALPHABET26().indexOf(charToUnCipher);
			// ensures the index of the replacing character is not exceeding length of English Alphabet"26"


			int c= (charPosition-shift)%26;     //c was created because of cases where charPosition is a negative number
			if (c>=0){
				int value = c;
				// gets the replacing character 
				char replaceChar = ALPHABET26().charAt(value);
				UncipherText += replaceChar;
				// appends the replaceVal to the String cipher Text

			}else if (c<0){
				char replaceChar = ALPHABET26().charAt(c+26); 
				UncipherText += replaceChar;
			}
			// returns the ciphered text 
		}		return UncipherText;

	}
}
