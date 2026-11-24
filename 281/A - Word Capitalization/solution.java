import java.util.Scanner;
 
public class A281 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder str=new StringBuilder();
        str.append(Character.toUpperCase(s.charAt(0)));
        str.append(s.substring(1,s.length()));
        System.out.println(str);
    }
}