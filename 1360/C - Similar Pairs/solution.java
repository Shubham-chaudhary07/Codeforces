import java.util.Arrays;
import java.util.Scanner;
 
public class C1360 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int count=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]%2==0){
                    count++;
                }
            }
            Arrays.sort(arr);
 
 
            boolean flag=false;
            if(count%2==0){
                flag=true;
            }
            else{
                for(int i=1;i<n;i++){
                    if((Math.abs(arr[i-1]-arr[i])==1)){
                        flag=true;
                        break;
                    }
 
 
            }
        }
            System.out.println(flag? "YES":"NO");
        }
    }
}