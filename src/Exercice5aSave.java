import java.io.*;
import java.util.*;

public class Exercice5aSave {
    public static void main(String[] args) throws IOException {
        ArrayList<String> liste = new ArrayList<>();

        liste.add("Java");
        liste.add("Python");
        liste.add("C++");

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("liste.ser"))) {
            oos.writeObject(liste);
        }

        System.out.println("Sauvegarde terminee !");
    }
}