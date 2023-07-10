import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int ageDeTom = 20;
        int ageDeTemel = ageDeTom;
        ageDeTom=44;
        //Preuve que les int sont des types valeurs
        System.out.println(ageDeTemel);

        Date naissanceJessim = new Date(123, 9,3);
        Date autreDate = naissanceJessim;
        System.out.println(autreDate);
        naissanceJessim.setTime(44444444);

        System.out.println(naissanceJessim);
        System.out.println(autreDate);


        //déclaration d'un type float attention obligé de mettre un f à la fin
        float f= -140.4f;
    }
}

