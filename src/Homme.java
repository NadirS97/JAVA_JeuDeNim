public class Homme {
    private String nom;
    private int nbAll;

    public Homme(String nom, int nb) {
        this.nom=nom;
        this.nbAll=nb;
    }
    public String getName() {
        return nom;
    }
    public int getNbAll() {
        return nbAll;
    }
    public void setNbAll(int nbAll) {
        this.nbAll = nbAll;
    }
}