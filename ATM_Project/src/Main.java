public class Main {
    public static void main(String[] args) {
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
    }
}
