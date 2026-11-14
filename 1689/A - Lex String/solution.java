import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            char[] a = sc.next().toCharArray();
            char[] b = sc.next().toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
 
            int i = 0, j = 0;        // front of each queue
            int runA = 0, runB = 0;  // how many taken in a row from a / from b
            StringBuilder c = new StringBuilder();
 
            while (i < n && j < m) {
                boolean takeA = a[i] < b[j];          // take the smaller front letter
 
                if (takeA && runA == k) takeA = false;   // used a k times, must switch
                else if (!takeA && runB == k) takeA = true;
 
                if (takeA) { c.append(a[i++]); runA++; runB = 0; }
                else       { c.append(b[j++]); runB++; runA = 0; }
            }
            System.out.println(c);
        }
    }
}