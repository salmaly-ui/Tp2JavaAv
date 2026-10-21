
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercice4d {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br =
                new BufferedReader(new FileReader("source.txt"));

            BufferedWriter bw =
                new BufferedWriter(new FileWriter("copie.txt"))
        ) {
            String ligne;

            while ((ligne = br.readLine()) != null) {
                bw.write(ligne);
                bw.newLine();
            }
        }

        System.out.println("Copie terminee.");
    }
}
