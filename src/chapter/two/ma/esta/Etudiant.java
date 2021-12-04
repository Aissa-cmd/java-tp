package chapter.two.ma.esta;

import chapter.one.ma.esta.Personne;

public class Etudiant extends Personne {
    private double moyenne;

    public Etudiant() {
        super();
    }

    public Etudiant(String nm, String prnm, int ag, double myn) {
        super(nm, prnm, ag);
        setMoyenne(myn);
    }

    public double getMoyenne() {
        return this.moyenne;
    }
    public void setMoyenne(double myn) {
        this.moyenne = myn;
    }

    @Override
    public void Afficher() {
        super.Afficher();
        System.out.println("moyenne: " + getMoyenne());
    }
}
