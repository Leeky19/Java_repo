public class Client {
    private String nom;
    private String prenom;
    private String  adresse;
    private int code_postal;
    private String ville;

    public Client(String nom, String prenom,String adresse, int code_postal,String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.code_postal = code_postal;
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
        return code_postal;
    }

    public String getVille() {
        return ville;
    }

}
