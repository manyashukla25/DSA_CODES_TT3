import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class subarrayZeroSum {
    public static boolean subarrayExists(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0 || set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (subarrayExists(arr, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
