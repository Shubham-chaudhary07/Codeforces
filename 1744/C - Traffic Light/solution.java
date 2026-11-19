import java.util.Scanner;
 
public class C1744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
 
            if (c == 'g') {
                System.out.println(0);
                continue;
            }
 
            String sDouble = s + s;
            int lastGreen = -1;
            int maxWait = 0;
 
            for (int i = 2 * n - 1; i >= 0; i--) {
                if (sDouble.charAt(i) == 'g') {
                    lastGreen = i;
                }
                if (i < n && sDouble.charAt(i) == c && lastGreen != -1) {
                    maxWait = Math.max(maxWait, lastGreen - i);
                }
            }
 
            System.out.println(maxWait);
        }
 
        sc.close();
    }
}