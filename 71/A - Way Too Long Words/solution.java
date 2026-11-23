import java.util.Scanner;
 
public class A71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            int a = str.length() - 2;
            if (str.length() <= 10) {
                System.out.println(str);
 
            } else {
                System.out.println(str.charAt(0) + "" + a + "" + str.charAt(str.length() - 1));
            }
        }
    }
}