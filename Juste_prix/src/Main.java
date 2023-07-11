import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int justePrix = rand.nextInt(100) + 1; //random entre 1 et 100
        int tentative = 0; //nombre de tentatives
        int proposition; //proposition que va soumettre le joueur

        Scanner scanner = new Scanner(System.in); //crée une nouvelle instance de la classe Scanner.
        long debut = System.currentTimeMillis(); //debut du chronometre, long date en miliseconde depuis le 1 janvier 1970

        System.out.println("Bienvenue dans le jeu du Juste Prix ! Trouvez le nombre mystère entre 1 et 100.");

        do {
            System.out.print("Entrez votre proposition : ");
            proposition = scanner.nextInt(); //nombre entrer par le joueur, lecture de ce nombre par le "scanner"
            tentative++;

            if (proposition < justePrix) {
                System.out.println("C'est plus !");
            } else if (proposition > justePrix) {
                System.out.println("C'est moins !");
            } else {
                System.out.println("Félicitations ! Vous avez trouvé le juste prix en " + tentative + " tentative(s).");
            }
        } while (proposition != justePrix);

        long fin = System.currentTimeMillis(); //arret du chronomettre
        long tempsJeu = (fin - debut) / 1000; //temps du jeu en secondes
        System.out.println("Temps de jeu : " + tempsJeu + " secondes.");

        scanner.close(); //fermeture du scanner
    }
}
