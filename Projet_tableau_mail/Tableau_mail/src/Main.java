public class Main {
    public static void main(String[] args) {
        String[] emails = {
                "jpp@sfr.fr",
                "tom@gmail.com",
                "fred@sfr.fr",
                "victor@sfr.fr",
                "chris@sfr.fr",
                "robert@orange.fr",
                "paul@sfr.fr",
                "lise@gmail.com",
                "thierry@gmail.com",
                "marie@isitech.fr"
        };

        int totalEmails = emails.length; //longueur de la string
        int gmailCount = 0; //total des comptes gmail
        int sfrCount = 0;
        int orangeCount = 0;
        int isitechCount = 0;

        for (String email : emails) {
            if (email.endsWith("@gmail.com")) { // Utilisation de endsWith(String suffix) pour trouver le fournisseur de mail
                gmailCount++;
            } else if (email.endsWith("@sfr.fr")) {
                sfrCount++;
            } else if (email.endsWith("@orange.fr")) {
                orangeCount++;
            } else if (email.endsWith("@isitech.fr")) {
                isitechCount++;
            }
        }

        //On fait le pourcentage en fonction de tous les mails.
        double gmailPercentage = (double) gmailCount / totalEmails * 100; //(double) force le resutat de la div à être en double
        double sfrPercentage = (double) sfrCount / totalEmails * 100;
        double orangePercentage = (double) orangeCount / totalEmails * 100;
        double isitechPercentage = (double) isitechCount / totalEmails * 100;

        System.out.println("Pourcentage de fournisseur de service mail :");
        System.out.println("Gmail : " + gmailPercentage + "%"); //Pour afficher les diff chose mettre des "+"
        System.out.println("SFR : " + sfrPercentage + "%");
        System.out.println("Orange : " + orangePercentage + "%");
        System.out.println("Isitech : " + isitechPercentage + "%");
    }
}