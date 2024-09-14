import java.io.*;

public class BruteForceDecryptor {
    public static void bruteForceDecrypt(String inputFile, String outputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                for (int key = 0; key < CipherAlgorithm.ALPHABET.length(); key++) {
                    String decryptedLine = CipherAlgorithm.decrypt(line, key);
                    writer.write("Key " + key + ": " + decryptedLine);
                    writer.newLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + inputFile);
        } catch (IOException e) {
            System.err.println("Error al leer o escribir archivo: " + e.getMessage());
        }
    }
}
