package Aufgaben_08;



public class Aufgaben_0811 {

        // Method to encrypt/decrypt a string using a key
        public static String xorEncryptDecrypt(String input, byte[] b) {
            StringBuilder output = new StringBuilder();
            int pos = 1;
            for (int i = 0; i < input.length(); i++) {
                output.append((char) (input.charAt(i) ^ b[pos%4]));
                pos++;
            }

            return output.toString();
        }

        public static void main(String[] args) {
            String plaintext = "Hello, World!";
            byte[] b = {1,2,3,4};

            // Encrypt the plaintext
            String encrypted = xorEncryptDecrypt(plaintext, b);
            System.out.println("Encrypted: " + encrypted);

            // Decrypt the ciphertext
            String decrypted = xorEncryptDecrypt(encrypted, b);
            System.out.println("Decrypted: " + decrypted);
        }
    }

