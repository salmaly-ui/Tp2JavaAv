# TP Java : Entrées / Sorties avec `java.io`

## Présentation

Ce TP a pour objectif de découvrir les mécanismes d'entrées/sorties en Java et d'apprendre à manipuler les fichiers, les dossiers et les flux de données.

## Objectifs du TP

- Lire des données saisies au clavier et calculer une moyenne.
- Parcourir les fichiers et les dossiers.
- Filtrer les fichiers selon leur extension.
- Lire, écrire et copier des fichiers.
- Télécharger un fichier depuis Internet.
- Sauvegarder et récupérer des objets grâce à la sérialisation.

## Contenu du TP

### Exercice 1 : Calcul de la moyenne
Calcul de la moyenne de nombres positifs jusqu'à la saisie de `-1`.

### Exercice 2 : Manipulation des fichiers et dossiers
Parcours récursif d'un dossier et affichage des informations sur les fichiers.

### Exercice 3 : Filtrage des fichiers
Utilisation de `FilenameFilter` pour filtrer les fichiers selon leur extension.

### Exercice 4 : Lecture et écriture des fichiers
Utilisation de différents flux Java :
- `FileInputStream` et `FileOutputStream`
- `BufferedInputStream` et `BufferedOutputStream`
- Flux de caractères
- `URL` pour télécharger un fichier depuis Internet

### Exercice 5 : Sérialisation
Sauvegarde et lecture d'une liste d'objets et d'une instance de la classe `Personne` avec `ObjectOutputStream` et `ObjectInputStream`.

## Technologies utilisées

- Java
- JDK
- Package `java.io`
- Classe `java.net.URL`

## Exécution

1. Cloner ou télécharger le dépôt GitHub.
2. Ouvrir le projet dans un IDE Java, comme IntelliJ IDEA ou Eclipse.
3. Vérifier les chemins des fichiers utilisés dans les exercices.
4. Exécuter la classe principale correspondant à chaque exercice.

**Remarque :** Pour les exercices de sérialisation, exécuter d'abord le programme de sauvegarde avant celui de lecture.

## Auteur

**Salma Laouy**  
Master Ingénierie des Systèmes d'Information (ISI) – S1
