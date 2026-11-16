import java.util.Scanner;
 
public class D1690 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int k= sc.nextInt();
            String s=sc.next();
            int count=0;
            for(int i=0;i<k;i++){
                if(s.charAt(i)=='W'){
                    count++;
                }
            }
            int max=count;
            for(int i=k;i<n;i++){
                if(s.charAt(i-k)=='W'){
                    count--;
                }
                if(s.charAt(i)=='W'){
                    count++;
                }
                max=Math.min(max,count);
            }
            System.out.println(max);
        }
    }
}