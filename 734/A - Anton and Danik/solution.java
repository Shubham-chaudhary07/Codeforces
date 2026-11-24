import java.util.Scanner;
 
public class A734 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int d_won=0;
        int a_won=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='A'){
                a_won++;
            }
            else{
                d_won++;
            }
        }
        if(a_won>d_won){
            System.out.println("Anton");
        } else if (d_won>a_won) {
            System.out.println("Danik");
 
        }
        else{
            System.out.println("Friendship");
        }
    }
}