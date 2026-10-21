
import java.io.File;
import java.io.FilenameFilter;

class FiltreFichier implements FilenameFilter {
    private String extension;
    private long size;

    public FiltreFichier(String extension, long size) {
        this.extension = extension;
        this.size = size;
    }

    @Override
    public boolean accept(File dir, String nom) {
        File f = new File(dir, nom);

        return f.isFile()
                && nom.toLowerCase().endsWith(extension.toLowerCase())
                && f.length() >= size;
    }
}

public class Exercice3c {
    public static void main(String[] args) {
        File dossier = new File("C:\\Windows\\System32");

        FiltreFichier filtre = new FiltreFichier(".exe", 1000);
        String[] fichiers = dossier.list(filtre);

        if (fichiers != null) {
            for (String nom : fichiers) {
                System.out.println(nom);
            }
        }
    }
}
