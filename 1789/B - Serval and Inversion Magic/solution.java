import java.util.Scanner;
 
public class B1789 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n= sc.nextInt();
            String s=sc.next();
            char[] ch=s.toCharArray();
            int i=0 , j=n-1;
            while(i<n&&ch[i]==ch[j]){
                i++;
                j--;
            }
            while(j>0&& ch[i]!=ch[j]){
                i++;
                j--;
            }
            boolean flag=true;
            while(i<j){
                if(ch[i++]!=ch[j--]){
                    flag=false;
                    break;
                }
 
            }
            if(flag){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}