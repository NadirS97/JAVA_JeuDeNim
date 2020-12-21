public class Expert implements Difficulte {
    private int nombreAllumettes;
    private int nombreAllumettesTirer;

    public int getNombreAllumettes() {
        return nombreAllumettes;
    }
    public void setNombreAllumettes(int nombreAllumettes) {
        this.nombreAllumettes = nombreAllumettes;
    }
    public int getNombreAllumettesTirer() {
        return nombreAllumettesTirer;
    }
    public void setNombreAllumettesTirer(int nombreAllumettesTirer) {
        this.nombreAllumettesTirer = nombreAllumettesTirer;
    }

    public int jouer (int n, int p) {
        int reste = (n-1)%(p+1);
        if (reste==0) {
            return 1;
        }else{
            return reste;
        }
    }

}