import java.util.Scanner;
 
public class A2292 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while( t-- > 0){
            int l=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
 
            boolean[] straw=new boolean[l];
            boolean[] berry=new boolean[l];
            int pos=0;
            while(!straw[pos]){
                straw[pos]=true;
                pos=(pos+a)%l;
            }
            pos=0;
            while(!berry[pos]){
                berry[pos]=true;
                pos=(pos+b)%l;
            }
            int idea=0;
            for(int i=0;i<l;i++){
                if(straw[i]&&berry[i]){
                    idea++;
                }
            }
            System.out.println(idea);
        }
    }
}