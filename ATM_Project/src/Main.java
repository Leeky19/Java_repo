import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
    /*   //Partie compte
       Compte compte = new Compte("1234567890");

        System.out.println("Numéro de compte : " + compte.getNumero());
        System.out.println("Solde initial : " + compte.getSolde());

        compte.deposer(100.0);
        System.out.println("Solde après dépôt : " + compte.getSolde());

        compte.retirer(50.0);
        System.out.println("Solde après retrait : " + compte.getSolde());

        compte.retirer(100.0); // Tentative de retrait avec solde insuffisant

        compte.deposer(200.0);
        System.out.println("Solde après nouveau dépôt : " + compte.getSolde());

        //creer un nouveau client
        Client client1 = new Client("Dupont", "Jean", "10 Rue de la Paix", 75001, "Paris");

        //Initialisation des données du client
        System.out.println("Nom : " + client1.getNom());
        System.out.println("Prénom : " + client1.getPrenom());
        System.out.println("Adresse : " + client1.getAdresse());
        System.out.println("Code postal : " + client1.getCodePostal());
        System.out.println("Ville : " + client1.getVille() + "\n");

        //Changent dans les données
        client1.setNom("Dupon");
        client1.setPrenom("Janne");
        client1.setAdresse("456 Rue de la Sainte Rép");
        client1.setCodePostal(69890);
        client1.setVille("Tagalatchointchoin");

        //affiche les nouvelles données
        System.out.println("Nouveau nom : " + client1.getNom());
        System.out.println("Nouveau prénom : " + client1.getPrenom());
        System.out.println("Nouvelle adresse : " + client1.getAdresse());
        System.out.println("Nouveau code postal : " + client1.getCodePostal());
        System.out.println("Nouvelle ville : " + client1.getVille());

 */

        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Client> clients = new HashMap<>();

        // Création d'un compte et d'un client par défaut
       // Compte compte = new Compte("123456789");
      //  Client client = new Client("Dupon", "Pierre", "123 Rue de la Paix", 12345, "Lyon City",1234);

        //Booleen pour quitter le programme
        boolean fermer = false;
        while (!fermer) {
            System.out.println("--- ATM Menu ---");
            System.out.println("1. Se connecter avec un code client");
            System.out.println("2. Créer un nouveau client");
            System.out.println("3. Quitter" + "\n");

            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Code client : ");
                    int codeClient = scanner.nextInt();
                    if (clients.containsKey(codeClient)) {
                        Client client = clients.get(codeClient);
                        Compte compte = new Compte("123456789");

                        boolean quitterClient = false; //Rester connecter
                        while (!quitterClient) {
                            System.out.println("--- Menu Client ---");
                            System.out.println("--- Bienvenu " + client.getNom() + " " + client.getPrenom() + " ---");
                            System.out.println("1. Consulter le solde");
                            System.out.println("2. Déposer de l'argent");
                            System.out.println("3. Retirer de l'argent");
                            System.out.println("4. Historique du compte client");
                            System.out.println("5. Information client");
                            System.out.println("6. Modifier les informations du client");
                            System.out.println("7. Déconnexion" + "\n");

                            System.out.print("Choisissez une option : ");
                            int choixClient = scanner.nextInt();

                            switch (choixClient) {
                                case 1:
                                    System.out.println("Solde : " + compte.getSolde());
                                    break;
                                case 2:
                                    System.out.print("Montant à déposer : ");
                                    double montantDepot = scanner.nextDouble();
                                    compte.deposer(montantDepot);
                                    break;
                                case 3:
                                    System.out.print("Code PIN : ");
                                    int codePinRetrait = scanner.nextInt();
                                    if (codePinRetrait == client.getCodePin()) {
                                        System.out.print("Montant à retirer : ");
                                        double montantRetrait = scanner.nextDouble();
                                        compte.retirer(montantRetrait);
                                    } else {
                                        System.out.println("Code PIN invalide. Retrait annulé.");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Historique des opérations :");
                                    ArrayList<String> historique = compte.getHistorique();
                                    for (String operation : historique) {
                                        System.out.println(operation);
                                    }
                                    break;
                                case 5:
                                    System.out.println("--- Informations du client ---");
                                    System.out.println("Nom : " + client.getNom());
                                    System.out.println("Prénom : " + client.getPrenom());
                                    System.out.println("Adresse : " + client.getAdresse());
                                    System.out.println("Code postal : " + client.getCodePostal());
                                    System.out.println("Ville : " + client.getVille());
                                    break;
                                case 6:
                                    System.out.println("--- Modifier les informations du client ---");
                                    System.out.print("Nouveau nom : ");
                                    scanner.nextLine(); // Consomme la nouvelle ligne restante
                                    String nouveauNom = scanner.nextLine();
                                    client.setNom(nouveauNom);

                                    System.out.print("Nouveau prénom : ");
                                    String nouveauPrenom = scanner.nextLine();
                                    client.setPrenom(nouveauPrenom);

                                    System.out.print("Nouvelle adresse : ");
                                    String nouvelleAdresse = scanner.nextLine();
                                    client.setAdresse(nouvelleAdresse);

                                    System.out.print("Nouveau code postal : ");
                                    int nouveauCodePostal = scanner.nextInt();
                                    client.setCodePostal(nouveauCodePostal);

                                    System.out.print("Nouvelle ville : ");
                                    scanner.nextLine(); // Consomme la nouvelle ligne restante
                                    String nouvelleVille = scanner.nextLine();
                                    client.setVille(nouvelleVille);

                                    System.out.println("Les informations du client ont été mises à jour.");
                                    break;
                                case 7:
                                    quitterClient = true;
                                    break;
                                default:
                                    System.out.println("Option invalide");
                                    break;
                            }

                            System.out.println();
                        }
                    } else {
                        System.out.println("Code client inconnu. Veuillez créer un nouveau client.");
                    }
                    break;
                case 2:
                    System.out.print("Code client : ");
                    int nouveauCodeClient = scanner.nextInt();
                    if (clients.containsKey(nouveauCodeClient)) {
                        System.out.println("Code client déjà existant. Veuillez choisir un autre code.");
                    } else {
                        System.out.print("Nom : ");
                        scanner.nextLine(); // Consomme la nouvelle ligne restante
                        String nom = scanner.nextLine();

                        System.out.print("Prénom : ");
                        String prenom = scanner.nextLine();

                        System.out.print("Adresse : ");
                        String adresse = scanner.nextLine();

                        System.out.print("Code postal : ");
                        int codePostal = scanner.nextInt();

                        System.out.print("Ville : ");
                        scanner.nextLine(); // Consomme la nouvelle ligne restante
                        String ville = scanner.nextLine();

                        System.out.print("Code PIN : ");
                        int codePin = scanner.nextInt();

                        Client nouveauClient = new Client(nom, prenom, adresse, codePostal, ville, codePin);
                        clients.put(nouveauCodeClient, nouveauClient);

                        System.out.println("Nouveau client créé avec succès. Veuillez vous connecter avec le code client.");
                    }
                    break;
                case 3:
                    fermer = true;
                    break;
                default:
                    System.out.println("Option invalide");
                    break;
            }

            System.out.println();
        }

        System.out.println("Merci d'avoir utilisé l'ATM. Au revoir !");

    }
}
