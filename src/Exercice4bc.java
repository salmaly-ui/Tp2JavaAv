
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercice4bc {
    public static void main(String[] args) throws IOException {
        try (
            BufferedInputStream bis =
                new BufferedInputStream(
                    new FileInputStream("source.txt"));

            BufferedOutputStream bos =
                new BufferedOutputStream(
                    new FileOutputStream("copie.txt"))
        ) {
            int a;

            while ((a = bis.read()) != -1) {
                bos.write(a);
            }
        }

        System.out.println("Copie terminee.");
    }
}
