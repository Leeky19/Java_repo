import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Création d'un exemple de client
        Client client1 = new Client("Dupont", "Jean", "10 Rue de la Paix", 75001, "Paris");

        // Création de quelques articles
        Article article1 = new Article("REF001", "Ordinateur portable", 999.99);
        Article article2 = new Article("REF002", "Telephone portable", 699.99);
        Article article3 = new Article("REF003", "Casque audio", 199.99);

        // Création d'un tableau d'articles commandés et un tableau de quantités
        Article[] articlesCommandes = {article1, article2, article3};
        int[] quantitesCommandes = {2, 1, 3};

        // Création d'une date pour la commande
        Date dateCommande = new Date();

        // Création de la commande
        Commande commande1 = new Commande(1, dateCommande, client1, articlesCommandes, quantitesCommandes);

        // Affichage des informations de la commande
        System.out.println("Numéro de commande : " + commande1.getNumero());
        System.out.println("Date de commande : " + commande1.getDate());
        System.out.println("Client : " + commande1.getClient().getNom() + " " + commande1.getClient().getPrenom());

        //Affichage des articles commandés
        System.out.println("Articles commandés :");
        Article[] articles = commande1.getArticles();
        int[] quantites = commande1.getQuantites();
        for (int i = 0; i < articles.length; i++) {
            System.out.println("- " + articles[i].getDesignation() + " (Quantité : " + quantites[i] + ")");
        }
    }
}