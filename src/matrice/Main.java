package matrice;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int n = Integer.parseInt(args.length > 0 ? args[0] : "10");

        int[][] matrice = MatriceUtils.genererMatrice(n);
        int[] sommes = new int[n];

        System.out.println("Matrice générée :");
        MatriceUtils.afficherMatrice(matrice);

        ThreadSom[] threads = new ThreadSom[n];

        for (int i = 0; i < n; i++) {
            threads[i] = new ThreadSom(matrice[i], i);
            threads[i].start();
        }

        for (int i = 0; i < n; i++) {
            threads[i].join();
        }

        int total = 0;

        System.out.println("\nSommes des lignes :");
        for (int i = 0; i < n; i++) {
            sommes[i] = threads[i].getSomme();
            System.out.println("Ligne " + i + " = " + sommes[i]);
            total += sommes[i];
        }

        System.out.println("\nSomme totale = " + total);
    }
}