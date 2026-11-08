import java.util.Scanner;
 
public class A791 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        while(l<=b){
            l=l*3;
            b=b*2;
            count++;
 
        }
        System.out.println(count);
    }
}