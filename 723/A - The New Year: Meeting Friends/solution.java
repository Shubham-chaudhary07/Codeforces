import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class A723 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] aray=new int[3];
        for(int i=0;i<3;i++){
            aray[i]=sc.nextInt();
        }
        Arrays.sort(aray);
        System.out.println(aray[2]-aray[0]);
    }
}