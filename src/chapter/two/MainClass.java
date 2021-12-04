package chapter.two;

import chapter.one.ma.esta.Personne;
import chapter.two.ma.esta.Etudiant;

public class MainClass {
    public static void main(String[] args) {
        Personne[] people = new Personne[4];

        people[0] = new Etudiant("nom1", "prenom1", 18, 18);
        people[1] = new Etudiant("nom2", "prenom2", 17, 17);
        people[2] = new Etudiant("nom3", "prenom3", 18, 15);
        people[3] = new Etudiant("nom4", "prenom4", 19, 19);

        Personne[] p = new Personne[4];
        p[0] = new Etudiant("nom1", "prenom1", 18, 18);
        p[1] = new Personne("nom2", "prenom2", 17);
        p[2] = new Etudiant("nom3", "prenom3", 18, 15);
        p[3] = new Personne("nom4", "prenom4", 19);

        show(p);
    }

    public static void show(Personne... args) {
        for (Personne p: args) {
            p.Afficher();
            System.out.println();
        }
    }
}
