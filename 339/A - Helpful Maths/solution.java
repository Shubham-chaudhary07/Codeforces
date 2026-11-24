import java.util.Arrays;
import java.util.Scanner;
 
public class A339 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str2="";
        for(char ch: str.toCharArray()){
            if(ch!='+'){
                str2+=ch;
            }
 
        }
        char[] c=str2.toCharArray();
        str2="";
        Arrays.sort(c);
        boolean flag=true;
        for(int i=0;i<c.length;i++){
            if(flag){
                str2+=c[i];
                flag=false;
            }
            else{
                str2+="+";
                flag=true;
                i--;
            }
        }
        System.out.println(str2);
 
 
 
    }
}