
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercice4a {
    public static void main(String[] args) throws IOException {
        try (
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("copie.txt")
        ) {
            int octet;

            while ((octet = fis.read()) != -1) {
                fos.write(octet);
            }
        }

        System.out.println("Copie terminee.");
    }
}
