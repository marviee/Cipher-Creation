/**
 * @author emarvie
 */
package terragon_intern;

public class Cipher{
	public static void main(String[] args) {
        
		//check the CipherCreation.java class for the methods to encrypt and decrypt
		CipherCreation cipherCreation = new CipherCreation(4);
		System.out.println(cipherCreation.encrypt("text to cipherr", 4));
        
		//To decrypt
		//System.out.println(cipherCreation.decrypt("xibxdxsdgmtlivv", 4));
	}
}


