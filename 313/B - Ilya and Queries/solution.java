import java.util.Scanner;
 
public class B313 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
 
 
        int[] prefix=new int[str.length()];
        for(int i=1;i<str.length();i++){
            prefix[i]=prefix[i-1];
            if(str.charAt(i)==str.charAt(i-1)){
                prefix[i]++;
            }
        }
        int t=sc.nextInt();
        while(t-- >0){
            int l= sc.nextInt();
            int r= sc.nextInt();
            int count=prefix[r-1]-prefix[l-1];
            System.out.println(count);
        }
        sc.close();
    }
}