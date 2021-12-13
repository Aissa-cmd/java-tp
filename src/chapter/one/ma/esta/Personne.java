package chapter.one.ma.esta;

/**
* This file contains the Personne class
* to view the entire project go to {@link https://github.com/Aissa-cmd/java-tp}
* @author Aissa Ouboukioud
*/

import java.util.Objects;

public class Personne {
    private static int nombre_personne = 0;

    private String nom;
    private String prenom;
    private int age;

    public Personne() {
        nombre_personne++;
    }

    public Personne(String nm, String prnm, int ag) {
        setNom(nm);
        setPrenom(prnm);
        setAge(ag);
        nombre_personne++;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nm) {
        this.nom = nm;
    }

    public String getPrenom() {
        return this.prenom;
    }
    public void setPrenom(String prnm) {
        this.prenom = prnm;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int ag) {
        this.age = ag;
    }

    @Override
    public String toString() {
        return String.format("Personne{nom=%s, pernom=%s, age=%d}", getNom(), getPrenom(), getAge());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return getAge() == personne.age && Objects.equals(getNom(), personne.nom) && Objects.equals(getPrenom(), personne.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, age);
    }

    public static int ShowNBrPersonne() {
        return nombre_personne;
    }

    public void Afficher() {
        System.out.println("nom: " + getNom());
        System.out.println("presom: " + getPrenom());
        System.out.println("age: " + getAge());
    }
}
