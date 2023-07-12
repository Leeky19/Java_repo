import java.util.Date;
import java.util.HashMap;
    public class Commande {
        private int numero;
        private Date date;
        private Client client;

        private HashMap<Article, Integer> articlesQuantites;

        public Commande(int numero, Date date, Client client) {
            this.numero = numero;
            this.date = date;
            this.client = client;
            this.articlesQuantites = new HashMap<>();
        }

    public int getNumero() {
        return numero;
    }

    public Date getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public HashMap<Article, Integer> getArticlesQuantites() {
        return articlesQuantites;
    }
}
