import java.util.Arrays;
import java.util.Scanner;
 
public class A1760 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int med=0;
            if((a>b && a<c)||(a<b && a>c)){
                med=a;
            }
            else if((b<c && b>a)||(b>c && b<a)){
                med=b;
 
            }
            else{
                med=c;
            }
            System.out.println(med);
 
        }
    }
}
/* second approach
            int[] arr=new int[3];
            for(int i=0;i<3;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
 */