import java.util.Arrays;
import java.util.Scanner;
 
public class A1399 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            boolean flag=true;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=1;i<n;i++){
                if(Math.abs(arr[i-1]-arr[i])>1){
                    flag=false;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}