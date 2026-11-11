import java.util.Scanner;
 
public class A381 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // there are two person in the game....
        // taking the sum variable for ech player to count the score..
        int sum_1 = 0;
        int sum_2 = 0;
        int s = 0;
        int e = n - 1;
        boolean serejaTurn = true;
        while (s <= e) {
            int chosenCard;
            // Greedily pick the maximum card from both ends
            if (arr[s] >= arr[e]) {
                chosenCard = arr[s];
                s++;
            } else {
                chosenCard = arr[e];
                e--;
            }
 
            // Add to the respective player's score and switch turn
            if (serejaTurn) {
                sum_1 += chosenCard;
                serejaTurn = false;
            } else {
                sum_2 += chosenCard;
                serejaTurn = true;
 
            }
 
        }
        System.out.println(sum_1 + " " + sum_2);
    }
}