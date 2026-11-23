import java.util.Locale;
import java.util.Scanner;
 
public class A112 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
 
            String s1=sc.next();
            String s2=sc.next();
            long result=s1.compareToIgnoreCase(s2);
            if(result==0){
                System.out.println("0");
            } else if (result<0) {
                System.out.println("-1");
 
            }
            else{
                System.out.println("1");
            }
 
    }
}
/* second approach
            long leto=0;
            long leto1=0;
            for(int i=0;i<s1.length();i++){
                leto+=Character.toLowerCase(s1.charAt(i));
                leto1+=Character.toLowerCase(s2.charAt(i));
            }
            if(leto==leto1){
                System.out.println("0");
            }
            else if(leto<leto1){
                System.out.println("-1");
            }
            else{
                System.out.println("1");
            }
 */