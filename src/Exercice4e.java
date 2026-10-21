
import java.io.*;
import java.net.URL;

public class Exercice4e {
    public static void main(String[] args) throws IOException {
        URL url = new URL(
        		"https://petitrobert12.lerobert.com/AidePR/Pages/pdf/conjugaisons.pdf"
        		);

        try (
            BufferedInputStream bis =
                new BufferedInputStream(url.openStream());

            BufferedOutputStream bos =
                new BufferedOutputStream(
                    new FileOutputStream("fichier.txt"))
        ) {
            int a;

            while ((a = bis.read()) != -1) {
                bos.write(a);
            }
        }

        System.out.println("Telechargement termine.");
    }
}
