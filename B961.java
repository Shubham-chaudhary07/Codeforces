
import java.util.Scanner;

public class B961 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] theo = new int[n];
        int[] behaviour = new int[n];

        for (int i = 0; i < n; i++) {
            theo[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            behaviour[i] = sc.nextInt();
        }

        long sum = 0;

        // Step 1: Already attentive time
        for (int i = 0; i < n; i++) {
            if (behaviour[i] == 1) {
                sum += theo[i];
            }
        }

        // Step 2: First window
        long window = 0;

        for (int i = 0; i < k; i++) {
            if (behaviour[i] == 0) {
                window += theo[i];
            }
        }

        long max = window;

        // Step 3: Sliding window
        for (int i = k; i < n; i++) {

            if (behaviour[i] == 0) {
                window += theo[i];
            }

            if (behaviour[i - k] == 0) {
                window -= theo[i - k];
            }

            max = Math.max(max, window);
        }

        System.out.println(sum + max);
    }
}
