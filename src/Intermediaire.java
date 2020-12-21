public class Intermediaire implements Difficulte {
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
        if(n>5) {
            int m = Math.min(n-1, p);
            int k = 1   + (int)(Math.random() * ((m  - 1 ) + 1));
            return k;
        }else{
            int reste = (n-1)%(p+1);
            if (reste==0) {
                return Math.max(1, reste);
            }else{
                return reste;
            }
        }
    }
}
