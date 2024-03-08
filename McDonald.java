package McDonaldProject;

import java.util.Scanner;

public class McDonald {
    //creo le variabili e lo scanner per l'input
    private static String[] usernames = new String[50];
    private static String[] passwords = new String[50];
    private static Scanner scanner = new Scanner(System.in);
    
    //creo un metodo dysplayMenu per la selezione
    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        System.out.println("Benvenuto!");
        System.out.println("1. Registrati");
        System.out.println("2. Login");
        System.out.println("3. Esci");
    }
}
