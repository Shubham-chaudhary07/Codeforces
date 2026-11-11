import java.util.Arrays;
import java.util.Scanner;
 
public class A1462 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int s=0;
            int e=n-1;
            int[] res=new int[n];
            int i=0;
            boolean flag=true;
            while(s<=e){
 
                if(flag){
                    res[i]=arr[s];
                    s++;
                    i++;
                    flag=false;
                }
                else{
                    res[i]=arr[e];
                    e--;
                    i++;
                    flag=true;
                }
 
            }
            for(int x: res){
                System.out.print(x+" ");
 
            }
            System.out.println();
        }
    }
}