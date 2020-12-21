
public class JeuAll  {
    private int nb;
    private Difficulte strategy;
    public static final int nbTmax=3;

    public JeuAll(int nb) {
        this.nb=nb;
    }
    public int niveauDebutant(Debutant den,int n) {
        return den.jouer(n,nbTmax);
    }
    public int niveauExpert(Expert exp, int n) {
        return exp.jouer(n,nbTmax);
    }
    public int niveauIntermediaire(Intermediaire intrm, int n) {
        return intrm.jouer(n,nbTmax);
    }
    public void setStrategy(Difficulte strategy) {
        this.strategy=strategy;
    }
    public Difficulte getStrategy() {
        return strategy;
    }
    public int getNb() {
        return nb;
    }
    public void setNb(int nb) {
        this.nb = nb;
    }
}
