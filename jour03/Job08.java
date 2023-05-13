import java.util.Arrays;

public class Job08 {
    public static void main(String[] args) {
        int[][] tableau = {{5,9,3},{7,2,8},{1,6,4}};
        int i, j, temp;
        int n=tableau.length;
        int m=tableau[0].length;
        for (i = 0; i < n * m - 1; i++) {
            for (j = 0; j < n * m - 1 - i; j++) {
                if (tableau[j / m][j % m] > tableau[(j + 1) / m][(j + 1) % m]) {
                    temp = tableau[(j + 1) / m][(j + 1) % m];
                    tableau[(j + 1) / m][(j + 1) % m] = tableau[j / m][j % m];
                    tableau[j / m][j % m] = temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(tableau));
    }
}