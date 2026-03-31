package matrice;

public class MatriceUtils {

    public static int[][] genererMatrice(int n) {
        int[][] matrice = new int[n][n];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = (int) (Math.random() * 10);
            }
        }

        return matrice;
    }

    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
    }
}