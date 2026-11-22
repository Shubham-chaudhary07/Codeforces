import java.util.Scanner;
 
public class C1840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();
 
            int[] temp = new int[n];
 
            for (int i = 0; i < n; i++) {
                temp[i] = sc.nextInt();
            }
 
            long way = 0;
            int count = 0;
 
            for (int i = 0; i < n; i++) {
 
                if (temp[i] <= q) {
                    count++;
 
                    if (count >= k) {
                        way += count - k + 1;
                    }
                }
                else {
                    count = 0;
                }
            }
 
            System.out.println(way);
        }
    }
}