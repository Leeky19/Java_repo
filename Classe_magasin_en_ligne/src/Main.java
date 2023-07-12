public class Main {
    public static void main(String[] args) {
            // Création d'un exemple d'article
            Article article1 = new Article("REF001", "Téléphone portable", 799.99);

            // Affichage des informations de l'article
            System.out.println("Référence : " + article1.getReference());
            System.out.println("Désignation : " + article1.getDesignation());
            System.out.println("Prix : " + article1.getPrix());
        }
}