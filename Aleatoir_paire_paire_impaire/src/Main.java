import java.util.Random;

public class Main {

        public static void main(String[] args) {
            int attempts = 0; // Compteur du nombre de tentative
            Random random = new Random(); // Instance de la classe Random pour générer des nombres aléatoires

            int num1, num2, num3; // Variables pour stocker les nombres générés


            // Génère un nombre aléatoire entre 0 et 1000 pour chaque numéro
            do {
                num1 = random.nextInt(1001); //bound car permet d'avoir une valaur entre 0 et 1001 exclu
                num2 = random.nextInt(1001);
                num3 = random.nextInt(1001);
                attempts++; // Incrémente le compteur d'essais chaque essaie

            // Vérifie si la combinaison "pair, pair, impair"
            } while (!(isEven(num1) && isEven(num2) && isOdd(num3)));

            System.out.println("Combinaison trouvée en " + attempts + " essais."); // Affiche le nombre d'essais
            System.out.println("Numéros générés : " + num1 + ", " + num2 + ", " + num3); // Affiche les nombres générés
        }
        //les Fonction n epeuvent pas être creer dans une méthode statique
        // Fonction qui verifie si le nombre est paire ou impaire

        private static boolean isEven(int num) {
            return num % 2 == 0;
        }

        private static boolean isOdd(int num) {
            return num % 2 != 0;
        }

}