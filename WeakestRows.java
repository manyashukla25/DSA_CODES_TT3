import java.util.Arrays;
import java.util.Comparator;

public class WeakestRows {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[][] strengths = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int strength = Arrays.stream(mat[i]).sum();
            strengths[i] = new int[]{i, strength};
        }

        Arrays.sort(strengths, Comparator.comparingInt(a -> a[1]));

        int[] weakestRows = new int[k];
        for (int i = 0; i < k; i++) {
            weakestRows[i] = strengths[i][0];
        }

        return weakestRows;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 3;
        int[] weakestRows = kWeakestRows(mat, k);
        System.out.println("Indices of the k weakest rows:");
        for (int row : weakestRows) {
            System.out.println(row);
        }
    }
}
