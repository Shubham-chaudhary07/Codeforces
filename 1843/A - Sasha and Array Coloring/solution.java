import java.util.Arrays;
import java.util.Scanner;
 
public class A1843 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            int max_sum=0;
            int s=0;
            int e=n-1;
            while(s<e){
                max_sum+=(arr[e]-arr[s]);
                s++;
                e--;
            }
            System.out.println(max_sum);
        }
    }
}