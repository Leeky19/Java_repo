import java.util.ArrayList;
public class Compte {
    private String numero;
    private double solde;
    private ArrayList<String> historique;

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

    public ArrayList<String> getHistorique() {
        return historique;
    }

    public void deposer(double montant) {
        solde += montant;
        historique.add("Dépôt : +" + montant);
        System.out.println("Dépôt effectué : +" + montant);
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            historique.add("Retrait : -" + montant);
            System.out.println("Retrait effectué : -" + montant);
            System.out.println("Le solde de votre compte est de : " + solde);

        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait");
            System.out.println("Pour rappel, le solde de votre compte est de : " + solde);
        }
    }
}
