package shiftcipher;

/**
 * ShiftCipher.java
 * 
 * A class to show Caesar Shift Cipher
 * Encrypts a message by shifting the alphabet characters
 * 
 * @author Islam Dudaev(CMP)
 * @since 13/10/2013
 */

import java.util.Scanner;

public class ShiftCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your message: ");
        String plain = scan.nextLine(); // user input of message
        System.out.println("Please enter number of letters to shift: ");
        int numShift = scan.nextInt(); // user inputs number of shifts
        // while loop to get right number of shifts from 1 to 25.
        while(numShift <= 0 || numShift > 25){
        
            System.out.println("Try again!");
            System.out.println("From 1 to 25: ");
            numShift = scan.nextInt();
        }
        String message = "";
        char encrypt;
        char decrypt;
        
        System.out.println("Encrypted text is:");
        plain = plain.toUpperCase();
        
//Encryption..................................................................
        for(int i = 0; i < plain.length(); i++){
        
            encrypt = plain.charAt(i); //characters of entered string     
            // if statement to indicate space characters
            if(encrypt != ' '){
                encrypt = (char)('A' + (encrypt - 'A' + numShift) % 26); //shifting
            }
            System.out.print(encrypt);
            message += Character.toString(encrypt); 
        }
        
        System.out.println("\n");  
        System.out.println("Decrypted message is:");
 
//Decryption..................................................................
        for(int i = 0; i < message.length(); i++){
            //characters of decrypted string and put them to upper case
            decrypt = message.toLowerCase().charAt(i); 
            // if statement to indicate space characters
            if(decrypt != ' '){   
                decrypt = (char)('a' + (decrypt - 'a' + (26 - numShift)) % 26); //shifting back
            }
            System.out.print(decrypt);
        }
        System.out.println();
        
    }
}
