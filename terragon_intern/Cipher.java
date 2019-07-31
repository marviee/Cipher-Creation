/**
 * @author emarvie
 */
package terragon_intern;

public class Cipher{
	public static void main(String[] args) {
        
		//check the CipherCreation.java class for the methods to encrypt and decrypt
		//the number of character shift is set to 4 but we can collect all this inputs(texts and shift num) from user using Scanner
		
		CipherCreation cipherCreation = new CipherCreation(4);
		System.out.println(cipherCreation.encrypt("text to cipherr", 4));
        
		//To decrypt, uncomment the next line
		//System.out.println(cipherCreation.decrypt("xibxdxsdgmtlivv", 4));
	}
}


