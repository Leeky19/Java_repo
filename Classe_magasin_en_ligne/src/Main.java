public class Main {
    public static void main(String[] args) {
            // Création d'un exemple d'article
            Article article1 = new Article("REF001", "Téléphone portable", 799.99);

            //Création d'un client test
            Client client1 = new Client("Smith","John", "36 Rue la Street", 69003,"Lyon 3ème");

            // Affichage des informations de l'article
            System.out.println("Référence : " + article1.getReference());
            System.out.println("Désignation : " + article1.getDesignation());
            System.out.println("Prix : " + article1.getPrix());

            System.out.println();

            //Affichage des informations du client
            System.out.println("Nom du client : " + client1.getNom());
            System.out.println("Prenom du client : " + client1.getPrenom());
            System.out.println("Adresse du client : " + client1.getAdresse());
            System.out.println("Code postal du client : " + client1.getCodePostal());
            System.out.println("Ville du client : " + client1.getVille());
        }
}