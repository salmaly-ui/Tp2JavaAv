
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GestionPersonne {

    public static void SavePersonneToFile(Personne p)
            throws IOException {

        try (
            ObjectOutputStream out =
                new ObjectOutputStream(
                    new FileOutputStream("personne.ser"))
        ) {
            out.writeObject(p);
        }
    }

    public static Personne getPersonneFromFile()
            throws IOException, ClassNotFoundException {

        try (
            ObjectInputStream in =
                new ObjectInputStream(
                    new FileInputStream("personne.ser"))
        ) {
            return (Personne) in.readObject();
        }
    }

    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        Personne p1 = new Personne("Salma", 22);

        SavePersonneToFile(p1);

        Personne p2 = getPersonneFromFile();

        System.out.println(p2);
    }
}
