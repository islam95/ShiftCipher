
package shiftcipher;

import java.util.Scanner;

/**
 * The class for encryption of Caesar Cipher using ASCII code
 * 
 * @author Islam Dudaev(CMP)
 * @since 30/10/2013
 */
public class UseASCIIcode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a message: ");
        String plaintext = scan.nextLine();
        System.out.println("Please enter number of shifts: ");
        int shift = scan.nextInt();
        
        char[] chars = new char[plaintext.length()];
        int[] ascii = new int[plaintext.length()];
        
        // Converts String to array of chars
        char[] charPlain = plaintext.toCharArray(); 
        
///// Encryption
        // Converts all characters to ASCII code
        for (int i = 0; i < charPlain.length; i++) {
            // the most common character: from 32 to 126 in ASCII table
            // 32 is the space in ASCII code
            ascii[i] = (int) (' ' + (charPlain[i] - ' ' + shift) % 94); // shifts the ascii code
        }
        
        System.out.println("\nEncrypted text is: ");
        for (int i = 0; i < charPlain.length; i++) {
            chars[i] = (char)ascii[i]; // encrypted text with its characters
        }
        System.out.println(chars);
        
///// Decryption
        System.out.println("\nDecrypted text: ");
        for(int i = 0; i < charPlain.length; i++){
            chars[i] = (char)(' ' + (chars[i] - ' ' + (94 - shift)) % 94); // shifting back
        }
        System.out.println(chars);
        System.out.println();
        //The end of program!
        
    }
}
