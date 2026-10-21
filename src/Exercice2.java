
import java.io.File;
import java.util.Date;

public class Exercice2 {

    public static void lister(String chemin, int niveau) {
        File dossier = new File(chemin);

        if (!dossier.exists() || !dossier.isDirectory()) {
            System.out.println("Repertoire invalide : " + chemin);
            return;
        }

        File[] fichiers = dossier.listFiles();

        if (fichiers == null) {
            return;
        }

        for (File f : fichiers) {
            for (int i = 0; i < niveau; i++) {
                System.out.print("    ");
            }

            if (f.isDirectory()) {
                System.out.println("[Dossier] " + f.getName());
                lister(f.getAbsolutePath(), niveau + 1);
            } else {
                System.out.println(
                    f.getName()
                    + " (" + new Date(f.lastModified()) + ") "
                    + f.length() + " octets"
                );
            }
        }
    }

    public static void main(String[] args) {
        lister("C:\\Users\\X1 YOGA\\Desktop\\Master_ISI_2027\\Statistique", 0);
    }
}
