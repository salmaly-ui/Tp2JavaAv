import java.io.*;
import java.util.*;

public class Exercice5aRead {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("liste.ser"))) {

            ArrayList<String> liste =
                    (ArrayList<String>) ois.readObject();

            System.out.println(liste);
        }
    }
}