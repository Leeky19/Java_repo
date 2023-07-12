public class Compte {
    private String numero;
    private double solde;

    public Compte(String numero) {
        this.numero = numero;
        this.solde = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public void deposer(double montant) {
        solde += montant;
        System.out.println("Dépôt effectué : +" + montant);
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            System.out.println("Retrait effectué : -" + montant);
            System.out.println("Le solde de votre compte est de : " + solde);

        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait");
            System.out.println("Pour rappel, le solde de votre compte est de : " + solde);
        }
    }
}
