import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Entrez un nombre entier : ");
                int nombre = scanner.nextInt();

                String binaire = Integer.toBinaryString(nombre);
                String octal = Integer.toOctalString(nombre);
                String hexa = Integer.toHexString(nombre);

                System.out.println("Valeur binaire : " + binaire);
                System.out.println("Valeur octale : " + octal);
                System.out.println("Valeur hexadécimale : " + hexa);

                scanner.close();
            }
}