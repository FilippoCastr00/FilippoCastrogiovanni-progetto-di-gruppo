import java.util.Scanner;
import java.util.ArrayList;

public class McDonald {
     //creo le variabili e gli oggetti
    private static String[] usernames = new String[50];
    private static String[] passwords = new String[50];
    private static Scanner scanner = new Scanner(System.in);
    private static int userCount = 0;
    
    public static void main(String[] args) {
        displayMenu();
    }
    
    //metodo che mostra il menu
    private static void displayMenu() {
        System.out.println("Benvenuto!");
        System.out.println("1. Registrati");
        System.out.println("2. Login");
        System.out.println("3. Esci");

        //creo una variabile da usare nello switch
        int choice = scanner.nextInt();
        scanner.nextLine();
 
        //creo lo switch per le scelte utente
        switch (choice) {
            case 1:
                registerUser();
                break;
            case 2:
                loginUser();
                break;
            case 3:
                System.out.println("Arrivederci!");
                break;
            default:
                System.out.println("Scelta non valida. Riprova.");
                displayMenu();
        }
    }
        //mnetodo che registra lo user
    private static void registerUser() {
        System.out.println("Registrazione:");
        System.out.print("Nome utente: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        //primo controllo per verificare l'esistenza dello user
        if (findUser(username) != -1) {
            System.out.println("Questo nome utente è già stato utilizzato. Riprova.");
            displayMenu();
        } else {  //inserisce gli input negli array e aggiorna il contatore userCount
            usernames[userCount] = username;
            passwords[userCount] = password;
            userCount++;
            System.out.println("Registrazione completata con successo.");
            displayMenu();
        }
    }
        //metodo login
    private static void loginUser() {
        System.out.println("Login:");
        System.out.print("Nome utente: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
     
        int index = findUser(username);
        if (index != -1 && passwords[index].equals(password)) {         
            System.out.println("Accesso effettuato con successo!");
        } else {
            System.out.println("Nome utente o password non validi. Riprova.");
        }
        displayMenu();
    }

    private static int findUser(String username) {
        for (int i = 0; i < userCount; i++) {
            if (usernames[i].equals(username)) {
                return i;
            }
        }
        return -1;
    }
         
        //creo l'oggetto dell'ArrayList per il primo budget con 4 opzioni
        ArrayList<String> mcBudget1 = new ArrayList<String>();
        mcBudget1.add("Pacchetto A: McBurger,McNuggets,Coca-cola");
        mcBudget1.add("Pacchetto B: McChicken,McFlurry,Aranciata");
        mcBudget1.add("Pacchetto C: Carne,Patate,Acqua");
        mcBudget1.add("Pacchetto D: Pesce,Patate,Vino");

         //creo l'oggetto dell'ArrayList per il secondo budget con 4 opzioni
        ArrayList<String> mcBudget2 = new ArrayList<String>();
        mcBudget2.add("Pacchetto A: Fettina,Carote,Coca-cola");
        mcBudget2.add("Pacchetto B: Melanzane,Surimi,Acqua frizzante");
        mcBudget2.add("Pacchetto C: Cozze,Patate fritte,Acqua");
        mcBudget2.add("Pacchetto D: Salsiccia,Zucchina,Vino");

        //creo l'oggetto dell'ArrayList per il terzo budget con 4 opzioni
        ArrayList<String> mcBudget3 = new ArrayList<String>();
        mcBudget3.add("Pacchetto A: Fettina,Carote,Coca-cola");
        mcBudget3.add("Pacchetto B: Melanzane,Surimi,Acqua frizzante");
        mcBudget3.add("Pacchetto C: Cozze,Patate fritte,Acqua");
        mcBudget3.add("Pacchetto D: Salsiccia,Zucchina,Vino");

        //creo l'oggetto dell'ArrayList per il quarto budget con 4 opzioni
        ArrayList<String> mcBudget4 = new ArrayList<String>();
        mcBudget4.add("Pacchetto A: Schiacciatina,Carote,Sprite");
        mcBudget4.add("Pacchetto B: Salmone,Wakame,Acqua frizzante");
        mcBudget4.add("Pacchetto C: Tonno,Patate fritte,Acqua");
        mcBudget4.add("Pacchetto D: Agnello,Zucchina,Vino");

        // Chiedo all'utente il suo budget
        System.out.println("Seleziona un budget (1-4):");
        int budgetSelezionato = scanner.nextInt();

        // Chiedo all'utente quante persone sono
        System.out.println("Quante persone siete?");
        int numeroPersone = scanner.nextInt();

        
    }
}
