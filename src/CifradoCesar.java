import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class CifradoCesar {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        CipherAlgorithm cipherAlgorithm = new CipherAlgorithm();
        ManagementFiles readTxt = new ManagementFiles();
        int key;
        int option;

        option = menu.ejecute();

        System.out.println("Ingrese la ruta del archivo original. Ejemplo C:/buzon/original.txt");
        final String routeIn = scanner.nextLine();
        //scanner.nextLine();
        System.out.println("Ingrese la ruta y nombre del archivo de salida. Ejemplo C:/buzon/cifrado.txt");
        //scanner.nextLine();
        final String routeOut = scanner.nextLine();

        try {
            switch (option) {
                case 1:
                    System.out.println("Ingrese la clave");
                    key = scanner.nextInt();
                    String inputTxt = readTxt.orginal(routeIn);
                    String cifrado = cipherAlgorithm.encrypt(inputTxt, key);
                    readTxt.out(routeOut, cifrado);
                    System.out.println("Archivo encriptado correctamente. Ver archivo en :" + routeOut);
                    break;
                case 2:
                    System.out.println("Ingrese la clave");
                    inputTxt = readTxt.orginal(routeIn);
                    key = scanner.nextInt();
                    //String descifrado = cipherAlgorithm.decrypt("IPMB NVOEP",key);
                    String descifrado = cipherAlgorithm.decrypt(inputTxt, key);
                    readTxt.out(routeOut, descifrado);
                    System.out.println("Archivo desencriptado correctamente. Ver archivo en: " + routeOut);
                    break;
                case 3:
                    BruteForceDecryptor.bruteForceDecrypt(routeIn, routeOut);
                    System.out.println("Fuerza bruta completada. Ver archivo en: " + routeOut);
                    break;
                default:
                    System.out.println("Uso inválido.");
            }
        } catch (FileNotFoundException e){
            System.err.println("Archivo no encontrado, revisar ruta de entrada");
        }

    }

}

