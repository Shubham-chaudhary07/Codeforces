import java.util.Scanner;
 
public class B1798 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0) {
            int m = sc.nextInt();
            int[][] arr = new int[m][];
            int[] last = new int[50001];
 
            for (int i = 0; i < m; i++) {
                int n = sc.nextInt();
                arr[i] = new int[n];
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                    last[arr[i][j]] = i;
 
                }
            }
 
 
            int[] ans = new int[m];
            boolean c=true;
            for(int i=0;i<m;i++){
 
                ans[i]=-1;
                for(int x: arr[i]){
 
                    if(last[x]==i){
                        ans[i]=x;
                        break;
                    }
 
                }
                if(ans[i] == -1){
                    c=false;
                    break;
 
                }
 
            }
            if(!c){
                System.out.println(-1);
            }
            else{
                for(int x: ans){
                    System.out.println(x+" ");
                }
                System.out.println( );
            }
        }
    }
}