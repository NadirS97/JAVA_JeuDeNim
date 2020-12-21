public class Debutant implements Difficulte {
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
        int m = Math.min(n-1, p);
        int k = 1   + (int)(Math.random() * ((m  - 1 ) + 1));
        return k;
    }
}
