import java.util.Scanner;

public class Menu {
    private int option;
    public int ejecute(){

            System.out.println("------------- CIFRADO CESAR ----------");
            System.out.println("------        Menu Principal    ------");
            System.out.println("1. Encriptar Archivo");
            System.out.println("2. Desencriptar Archivo Con Clave");
            System.out.println("3. Desencriptar Archivo Por Fuerza Bruta");
            // System.out.println("4. Desencriptar Archivo Por Analisis Estadistico");
            System.out.println("0. Salir");
            System.out.println();
            System.out.println();
            System.out.println("Seleccione una opción");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            return option;
    }
}
