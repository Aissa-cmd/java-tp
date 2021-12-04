package chapter.one;

import chapter.one.ma.esta.Personne;

public class MainClass {
    public static void main(String[] args) {
        Personne P1 = new Personne();
        Personne P2 = new Personne("David", "Jason", 34);
        P1.setNom("John");
        P1.setPrenom("Watson");
        P1.setAge(22);

        System.out.println(P1.equals(P2));
        System.out.println();

        System.out.printf("P1[nom= %s, prenom=%s, age=%d]\n", P1.getNom(), P1.getPrenom(), P1.getAge());
        System.out.printf("P2[nom= %s, prenom=%s, age=%d]\n", P2.getNom(), P2.getPrenom(), P2.getAge());
        System.out.println();

        System.out.println(P1);
        System.out.println(P2);
        System.out.println();

        Personne[] people = new Personne[4];
        people[0] = new Personne("nom1", "prenom1", 21);
        people[1] = new Personne("nom2", "prenom2", 22);
        people[2] = new Personne("nom3", "prenom3", 23);
        people[3] = new Personne("nom4", "prenom4", 24);

        for (Personne p: people) {
            System.out.println(p);
        }
        System.out.println();

        System.out.println(Personne.ShowNBrPersonne());
    }
}
