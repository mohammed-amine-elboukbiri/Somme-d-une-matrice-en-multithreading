package matrice;

public class ThreadSom extends Thread {

    private final int[] ligne;
    private final int indexLigne;
    private int somme;

    public ThreadSom(int[] ligne, int indexLigne) {
        this.ligne = ligne;
        this.indexLigne = indexLigne;
        this.somme = 0;
    }

    @Override
    public void run() {
        for (int valeur : ligne) {
            somme += valeur;
        }

        System.out.println(
                Thread.currentThread().getName() +
                        " -> Somme ligne " + indexLigne + " = " + somme
        );
    }

    public int getSomme() {
        return somme;
    }
}