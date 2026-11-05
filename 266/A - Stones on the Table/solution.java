import java.util.Scanner;
 
public class A266 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int count=0;
 
        for(int i=1;i<n;i++){
            if(str.charAt(i-1)==str.charAt(i)){
                count++;
            }
            
        }
        System.out.println(count);
 
    }
}