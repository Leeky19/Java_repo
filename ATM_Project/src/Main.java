public class Main {
    public static void main(String[] args) {
       /* Partie compte
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

        */

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
    }
}
