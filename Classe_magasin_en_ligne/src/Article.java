public class Article {
    private String reference;
    private String designation;
    private double prix;

    public Article(String reference, String designation, double prix) {
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
    }

    public String getReference() {
        return reference;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix() {
        return prix;
    }

}

