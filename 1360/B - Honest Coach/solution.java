import java.util.Arrays;
import java.util.Scanner;
 
public class B1360 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
 
            }
            Arrays.sort(arr);
 
            long min=Integer.MAX_VALUE;
            for(int i=1;i<n;i+=1){
 
                min=Math.min(min,Math.abs(arr[i-1]-arr[i]));
            }
            System.out.println(min);
        }
    }
}