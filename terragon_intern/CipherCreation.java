package terragon_intern;

public class CipherCreation {

	private int shift;
	public CipherCreation(int shift) {
		super();
		this.setShift(shift);
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

//			if (charToCipher == ' '){
//				cipherText += " ";
//			}else{
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
	public String decrypt(String TextToDecrypt, int shift) {
		//number with which the text was shifted before must be known by the user
		
		TextToDecrypt = TextToDecrypt.toLowerCase();
		String UncipherText = "";  //created an empty String of decrypted text
		//loops through the entered text 
		
		for (int i = 0; i < TextToDecrypt.length(); i++) {
			char charToUnCipher=TextToDecrypt.charAt(i);  //taking each character of the text
			
			String d=" "; //we need to create provision for spaces in the test
			if (charToUnCipher == d.charAt(0)){   //d.charAt(0) converts the space string to char
				UncipherText += " ";
			}else{
				//gets the position of each character in the Text in the English Alphabet 
				int charPosition = ALPHABET26().indexOf(charToUnCipher);
				// ensures the index of the replacing character is not exceeding length of English Alphabet"26"
				int value = ( charPosition-shift)%26;
				// gets the replacing character 
				char replaceChar = ALPHABET26().charAt(value);
				// appends the replaceVal to the String cipher Text
				UncipherText += replaceChar;
			}
			// returns the ciphered text 

		}
		return UncipherText;
		}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}
}