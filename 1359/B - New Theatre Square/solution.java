import java.util.Scanner;
 
public class B1359 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int row = sc.nextInt();
            int col = sc.nextInt();
 
            int x = sc.nextInt();
            int y = sc.nextInt();
 
            String[] tiles = new String[row];
 
            for (int i = 0; i < row; i++) {
                tiles[i] = sc.next();
            }
 
            int cost = 0;
 
            for (int i = 0; i < row; i++) {
 
                char[] ch = tiles[i].toCharArray();
 
                int j = 0;
 
                while (j < col) {
 
                    if (ch[j] == '.') {
 
                        if (j + 1 < col &&
                                ch[j + 1] == '.' &&
                                y < 2 * x) {
 
                            cost += y;
                            j += 2;
 
                        } else {
 
                            cost += x;
                            j++;
                        }
 
                    } else {
                        j++;
                    }
                }
            }
 
            System.out.println(cost);
        }
    }
}