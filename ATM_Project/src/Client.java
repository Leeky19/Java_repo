public class Client {
    private String nom;
    private String prenom;
    private String  adresse;
    private int codePostal;
    private String ville;

    public Client(String nom, String prenom, String adresse, int codePostal, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }
    public int getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.nom = prenom;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public void setCodePostal(int codePostal){
        this.codePostal = codePostal;
    }
    public void setVille(String ville){
        this.ville = ville;
    }

}
