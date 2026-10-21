
import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somme = 0;
        int compteur = 0;
        int nombre;

        System.out.print("Donner les nombres (terminer par -1) : ");

        while (true) {
            nombre = sc.nextInt();

            if (nombre == -1) {
                break;
            }

            if (nombre >= 0) {
                somme += nombre;
                compteur++;
            }
        }

        if (compteur > 0) {
            System.out.println("Moyenne : " + somme / compteur);
        } else {
            System.out.println("Aucun nombre valide.");
        }

        sc.close();
    }
}
