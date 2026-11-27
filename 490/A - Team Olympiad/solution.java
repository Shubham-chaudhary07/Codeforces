import java.util.*;
 
public class A490 {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        ArrayList<Integer> l3=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                l1.add(i+1);
            }
            else if(arr[i]==2){
                l2.add(i+1);
            }
            else{
                l3.add(i+1);
            }
        }
        int team=Math.min(l1.size(), Math.min(l2.size(),l3.size()));
        System.out.println(team);
        for(int i=0;i<team;i++){
            System.out.println(l1.get(i)+" "+l2.get(i)+" "+l3.get(i));
        }
 
 
 
 
 
    }
}