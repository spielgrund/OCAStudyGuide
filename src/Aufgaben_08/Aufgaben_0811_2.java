package Aufgaben_08;


import java.io.*;

public class Aufgaben_0811_2 {


    public static void main(String[] args) throws IOException {
        String filePathIn = "daten.txt";
        String filePathOut = "output.txt";
        String keyPathIn = "key.txt";
        byte[] b = new byte[1024];
        String key = "";
        try(BufferedReader br2 = new BufferedReader(new FileReader(keyPathIn))){
            key = br2.readLine();
            System.out.println("key: " + key);
        }catch (Exception e){
            System.out.println(e);
        }
        byte[] barr = key.getBytes();



        // Create a BufferedReader in a try-with-resources statement
        try (EncryptedInputStream inputStream = new EncryptedInputStream(new FileInputStream(filePathIn),barr);
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(filePathOut))){
            int n;
            while ((n = inputStream.read(b)) != -1) {

                outputStream.write(b, 0, n);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /////////////////////////////////////////////////
        String filePathIn2 = "output.txt";
        String filePathOut2 = "decrypt.txt";

        System.out.println(key);
        try (InputStream inputStream = new FileInputStream(filePathIn2);
             DecryptOutputStream decryptoutputStream = new DecryptOutputStream(new FileOutputStream(filePathOut2),barr)){
            int n;
            while ((n = inputStream.read(b)) != -1) {

                decryptoutputStream.write(b, 0, n);
            }
            System.out.println("out");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}


