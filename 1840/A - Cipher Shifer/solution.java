import java.util.Scanner;
 
public class A1840 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n= sc.nextInt();
            String s= sc.next();
            StringBuilder new_str= new StringBuilder();
            int i=0;
            int j=1;
            while (i<n){
                char ch=s.charAt(i);
                char ch_2=s.charAt(j);
                if(ch==ch_2){
                    new_str.append(ch);
                    i=j+1;
                    j = i + 1;
                } else {
                    j++;
                }
            }
            System.out.println(new_str);
        }
    }
}