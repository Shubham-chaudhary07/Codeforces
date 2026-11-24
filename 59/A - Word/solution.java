import java.util.Scanner;
 
public class A59 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int upper_count=0;
        int lower_count=0;
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)){
                upper_count++;
            }
            else{
                lower_count++;
            }
        }
        if(upper_count>lower_count){
            System.out.println(s.toUpperCase());
        }
        else{
            System.out.println(s.toLowerCase());
        }
 
    }
}