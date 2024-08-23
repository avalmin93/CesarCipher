import java.io.*;

public class ManagementFiles {
    public static String orginal(String inputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            String salida = "";

            while((line = reader.readLine()) != null) {
                salida = line;
                }
            return salida;
            }
    }
    public static void out (String outputFile,String data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            //String line;
            //String salida = "";
                writer.write(data);
                writer.newLine();
            }
    }
}